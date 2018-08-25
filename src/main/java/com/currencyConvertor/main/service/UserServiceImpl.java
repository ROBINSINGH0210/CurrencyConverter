package com.currencyConvertor.main.service;

import java.sql.Date;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.currencyConvertor.json.CurrencyJSON;
import com.currencyConvertor.json.Rates;
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
		String rate = null;
		try {
			rate = mapper.writerWithView(Rates.class).writeValueAsString(currencyJSON.getRates());
			CurrencyEntity data = new CurrencyEntity();
			data.setBase(currencyJSON.getBase());
			data.setRates(rate);
			data.setCallDate(Date.from(Instant.ofEpochMilli(currencyJSON.getTimestamp())));
			currencyRepository.saveAndFlush(data);
		} catch (Exception e) {
			return "Error";
		}
		return "Success";
	}

	@Override
	public List<CurrencyJSON> getPreviousDetails() {
		List<CurrencyJSON> list = new ArrayList<>();
		ObjectMapper mapper = new ObjectMapper();
		List<CurrencyEntity> dataList = currencyRepository.findTop10ByOrderByIdDesc();
		dataList.forEach(e -> {
			CurrencyJSON json = new CurrencyJSON();
			json.setBase(e.getBase());
			json.setTimestamp(e.getCallDate().getTime());
			try {
				json.setRates(mapper.readValue(e.getRates(), Rates.class));
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			list.add(json);
		});
		return list;
	}
	
}
