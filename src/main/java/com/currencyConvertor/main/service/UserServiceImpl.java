package com.currencyConvertor.main.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.currencyConvertor.main.json.CurrencyJSON;
import com.currencyConvertor.main.model.CurrencyEntity;
import com.currencyConvertor.main.model.User;
import com.currencyConvertor.main.repository.CurrencyRepository;
import com.currencyConvertor.main.repository.UserRepository;
import com.currencyConvertor.main.util.CurrencyConverterUtil;

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
		try {
			CurrencyEntity data = CurrencyConverterUtil.prepareCurrencyEntity(currencyJSON);
			currencyRepository.saveAndFlush(data);
		} catch (Exception e) {
			return "Error";
		}
		return "Success";
	}

	@Cacheable("historicalData")
	@Override
	public List<CurrencyJSON> getPreviousDetails() {
		List<CurrencyEntity> dataList = currencyRepository.findTop10ByOrderByIdDesc();
		return dataList.stream().map(CurrencyConverterUtil::dtoTOJSONObject).collect(Collectors.toList());
	}
	
}
