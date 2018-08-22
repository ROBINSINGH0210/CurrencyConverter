package com.currency;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "timestamp", "base", "rates" })
public class CurrencyJSON implements Serializable {
	@JsonProperty("timestamp")
	private Long timestamp;
	@JsonProperty("base")
	private String base;
	@JsonProperty("rates")
	private Rates rates;
	@JsonIgnore
	private final static long serialVersionUID = 5089017721980439372L;

	@JsonProperty("timestamp")
	public Long getTimestamp() {
		return timestamp;
	}

	@JsonProperty("timestamp")
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	@JsonProperty("base")
	public String getBase() {
		return base;
	}

	@JsonProperty("base")
	public void setBase(String base) {
		this.base = base;
	}

	@JsonProperty("rates")
	public Rates getRates() {
		return rates;
	}

	@JsonProperty("rates")
	public void setRates(Rates rates) {
		this.rates = rates;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CurrencyJSON [timestamp=").append(timestamp).append(", base=").append(base).append(", rates=")
				.append(rates).append("]");
		return builder.toString();
	}

}