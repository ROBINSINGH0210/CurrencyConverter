package com.currencyConverter.test;

import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.user;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.test.web.servlet.setup.SecurityMockMvcConfigurers;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.AnnotationConfigWebContextLoader;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.couchbase.client.deps.com.fasterxml.jackson.databind.ObjectMapper;
import com.currencyConvertor.main.WebApplication;
import com.currencyConvertor.main.json.CurrencyJSON;
import com.currencyConvertor.main.json.Info;
import com.currencyConvertor.main.json.Query;
import com.currencyConvertor.main.util.CurrencyConverterUtil;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { WebApplication.class }, loader = AnnotationConfigWebContextLoader.class)
@WebAppConfiguration
public class RateControllerTest {

	@Autowired
	private WebApplicationContext wac;

	private MockMvc mockMvc;

	@Before
	public void setup() {
		mockMvc = MockMvcBuilders.webAppContextSetup(wac).apply(SecurityMockMvcConfigurers.springSecurity()).build();
	}

	@Test
	public void testGetData() throws Exception {
		mockMvc.perform(get("/getData").with(user("admin").password("pass").roles("USER", "ADMIN"))).andExpect(status().isOk())
				.andExpect(content().contentType("application/json;charset=UTF-8"));

	}

	@Test
	public void testSaveData_FailOnGetTypeRequest() throws Exception {
		mockMvc.perform(get("/saveData").with(user("admin").password("pass").roles("USER", "ADMIN")))
				.andExpect(status().is4xxClientError());

	}

	@Test
	public void testSaveData_SuccessOnPostTypeRequest() throws Exception {
		CurrencyJSON currencyJSON = new CurrencyJSON();
		currencyJSON.setDate(CurrencyConverterUtil.FORMATTER.format(new Date()));
		Info info = new Info();
		info.setQuote(60.20);
		info.setTimestamp(15025525);
		Query query = new Query();
		query.setAmount(20);
		query.setFrom("USD");
		query.setTo("INR");
		currencyJSON.setInfo(info);
		currencyJSON.setQuery(query);
		currencyJSON.setResult(info.getQuote()*query.getAmount());
		ObjectMapper mapper = new ObjectMapper();
		mockMvc.perform(post("/saveData").with(user("admin").password("pass").roles("USER", "ADMIN"))
				.contentType(MediaType.APPLICATION_JSON_UTF8_VALUE).accept(MediaType.APPLICATION_JSON_UTF8_VALUE).content(mapper.writeValueAsString(currencyJSON)))
				.andExpect(status().isOk());

	}

}
