package com.currencyConvertor.main.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.currencyConvertor.main.json.CurrencyJSON;
import com.currencyConvertor.main.service.UserService;

@RestController
public class RatesController {
	@Autowired
	private UserService userService;
	
	@Cacheable("historicalData")
	@RequestMapping(value = "/getData", method = RequestMethod.GET)
	@ResponseBody
	public List<CurrencyJSON> getHistoricalData() {
		return userService.getPreviousDetails();
	}

	@RequestMapping(value = "/saveData", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseBody
	public String saveCurrentData(@RequestBody CurrencyJSON request) {
		return userService.saveCurrencyDetails(request);
	}
}
