package com.currencyConverter.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import java.text.ParseException;
import java.util.Date;
import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import com.currencyConvertor.main.WebApplication;
import com.currencyConvertor.main.json.CurrencyJSON;
import com.currencyConvertor.main.json.Info;
import com.currencyConvertor.main.json.Query;
import com.currencyConvertor.main.model.CurrencyEntity;
import com.currencyConvertor.main.repository.CurrencyRepository;
import com.currencyConvertor.main.service.UserService;
import com.currencyConvertor.main.util.CurrencyConverterUtil;
import com.fasterxml.jackson.core.JsonProcessingException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { WebApplication.class }, loader = AnnotationConfigContextLoader.class)
@Transactional
public class InMemoryDBTest {
	@Autowired
	private UserService userService;

	@Resource
	private CurrencyRepository currencyRepository;

	public CurrencyJSON prepareJSON() {
		CurrencyJSON currencyJSON = new CurrencyJSON();
		currencyJSON.setDate(CurrencyConverterUtil.formatter.format(new Date()));
		Info info = new Info();
		info.setQuote(60.2);
		Query query = new Query();
		query.setAmount(10);
		query.setFrom("USD");
		query.setTo("INR");
		currencyJSON.setQuery(query);
		currencyJSON.setInfo(info);
		currencyJSON.setResult(query.getAmount() * info.getQuote());

		return currencyJSON;
	}

	@Test
	public void givenCurr_whenSave_thenGetOk() throws JsonProcessingException, ParseException {
		CurrencyJSON currObject = prepareJSON();
		CurrencyEntity currencyEntity = CurrencyConverterUtil.prepareCurrencyEntity(currObject);
		currencyRepository.save(currencyEntity);
		assertNotNull(currencyEntity.getId());

	}

	@Test(expected = DataAccessException.class)
	public void givenSameCurrTwice_whenSave_thenGetNotOk() throws JsonProcessingException, ParseException {
		CurrencyJSON currObject = prepareJSON();
		CurrencyJSON currObject2 = prepareJSON();
		CurrencyEntity currencyEntity = CurrencyConverterUtil.prepareCurrencyEntity(currObject);
		CurrencyEntity currencyEntity2 = CurrencyConverterUtil.prepareCurrencyEntity(currObject2);
		currencyRepository.save(currencyEntity);
		currencyRepository.save(currencyEntity2);
	}

	@Test(expected = RuntimeException.class)
	public void forNullValue_whenSave_thenGetNotOk() throws JsonProcessingException, ParseException {
		CurrencyJSON currObject = new CurrencyJSON();
		CurrencyEntity currencyEntity = CurrencyConverterUtil.prepareCurrencyEntity(currObject);
		currencyRepository.save(currencyEntity);
		assertNotNull(currencyEntity.getId());
	}

	@Test
	public void forNullValue_WhenUserNotPresent() throws JsonProcessingException, ParseException {
		assertNull(userService.findByEmail("admin"));
	}

}