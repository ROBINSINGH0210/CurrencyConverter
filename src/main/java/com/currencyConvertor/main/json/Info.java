package com.currencyConvertor.main.json;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "timestamp", "quote" })
public class Info {

	@JsonProperty("timestamp")
	private Integer timestamp;
	@JsonProperty("quote")
	private Double quote;

	@JsonProperty("timestamp")
	public Integer getTimestamp() {
		return timestamp;
	}

	@JsonProperty("timestamp")
	public void setTimestamp(Integer timestamp) {
		this.timestamp = timestamp;
	}

	@JsonProperty("quote")
	public Double getQuote() {
		return quote;
	}

	@JsonProperty("quote")
	public void setQuote(Double quote) {
		this.quote = quote;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("timestamp", timestamp).append("quote", quote).toString();
	}

}