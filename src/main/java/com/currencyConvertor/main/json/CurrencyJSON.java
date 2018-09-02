package com.currencyConvertor.main.json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "query", "info", "date", "result" })
public class CurrencyJSON {

	@JsonProperty("query")
	private Query query;
	@JsonProperty("info")
	private Info info;
	@JsonProperty("date")
	private String date;
	@JsonProperty("result")
	private Double result;

	@JsonProperty("query")
	public Query getQuery() {
		return query;
	}

	@JsonProperty("query")
	public void setQuery(Query query) {
		this.query = query;
	}

	@JsonProperty("info")
	public Info getInfo() {
		return info;
	}

	@JsonProperty("info")
	public void setInfo(Info info) {
		this.info = info;
	}

	@JsonProperty("date")
	public String getDate() {
		return date;
	}

	@JsonProperty("date")
	public void setDate(String date) {
		this.date = date;
	}

	@JsonProperty("result")
	public Double getResult() {
		return result;
	}

	@JsonProperty("result")
	public void setResult(Double result) {
		this.result = result;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CurrencyJSON [query=").append(query).append(", info=").append(info).append(", date=").append(date)
				.append(", result=").append(result).append("]");
		return builder.toString();
	}

}