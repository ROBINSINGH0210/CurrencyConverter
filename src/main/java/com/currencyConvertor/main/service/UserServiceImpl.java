package com.currencyConvertor.main.service;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.currencyConvertor.main.json.CurrencyJSON;
import com.currencyConvertor.main.json.Info;
import com.currencyConvertor.main.json.Query;
import com.currencyConvertor.main.model.CurrencyEntity;
import com.currencyConvertor.main.model.User;
import com.currencyConvertor.main.repository.CurrencyRepository;
import com.currencyConvertor.main.repository.UserRepository;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private CurrencyRepository currencyRepository;
	private SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

	@Override
	public void save(User user) {
		user.setPassword(user.getPassword());
		userRepository.saveAndFlush(user);
	}

	@Override
	public User findByEmail(String email) {
		return userRepository.findByEmail(email);
	}

	@Override
	public String saveCurrencyDetails(CurrencyJSON currencyJSON) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			String query = mapper.writerWithView(Query.class).writeValueAsString(currencyJSON.getQuery());
			String info = mapper.writerWithView(Info.class).writeValueAsString(currencyJSON.getInfo());
			CurrencyEntity data = new CurrencyEntity();
			data.setQuery(query);
			data.setInfo(info);
			data.setCallDate(formatter.parse(currencyJSON.getDate()));
			data.setResult(currencyJSON.getResult());
			currencyRepository.saveAndFlush(data);
		} catch (Exception e) {
			return "Error";
		}
		return "Success";
	}
	
	@Cacheable("historicalData")
	@Override
	public List<CurrencyJSON> getPreviousDetails() {
		List<CurrencyJSON> list = new ArrayList<>();
		List<CurrencyEntity> dataList = currencyRepository.findTop10ByOrderByIdDesc();
		dataList.forEach(e -> this.dtoTOJSONList(list, e));
		return list;
	}
	
	private void dtoTOJSONList(List<CurrencyJSON> list, CurrencyEntity e) {
		ObjectMapper mapper = new ObjectMapper();
		CurrencyJSON json = new CurrencyJSON();
		json.setDate(formatter.format(e.getCallDate()));
		json.setResult(e.getResult());
			try {
				json.setInfo(mapper.readValue(e.getInfo(), Info.class));
				json.setQuery(mapper.readValue(e.getQuery(), Query.class));
			} catch (IOException e1) {
				e1.printStackTrace();
			} 
		list.add(json);	
	}
	
}
