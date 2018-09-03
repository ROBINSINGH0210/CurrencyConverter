package com.currencyConvertor.main.util;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import com.currencyConvertor.main.json.CurrencyJSON;
import com.currencyConvertor.main.json.Info;
import com.currencyConvertor.main.json.Query;
import com.currencyConvertor.main.model.CurrencyEntity;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CurrencyConverterUtil {

	public static final SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

	public static void dtoTOJSONList(List<CurrencyJSON> list, CurrencyEntity e) {
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

	public static CurrencyEntity prepareCurrencyEntity(CurrencyJSON currencyJSON) throws JsonProcessingException, ParseException {
		ObjectMapper mapper = new ObjectMapper();
		String query = mapper.writerWithView(Query.class).writeValueAsString(currencyJSON.getQuery());
		String info = mapper.writerWithView(Info.class).writeValueAsString(currencyJSON.getInfo());
		CurrencyEntity data = new CurrencyEntity();
		data.setQuery(query);
		data.setInfo(info);
		data.setCallDate(CurrencyConverterUtil.formatter.parse(currencyJSON.getDate()));
		data.setResult(currencyJSON.getResult());
		return data;
	}
}
