package com.currency;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CurrencyJSON {

	@SerializedName("timestamp")
	@Expose
	private Integer timestamp;
	@SerializedName("base")
	@Expose
	private String base;
	@SerializedName("rates")
	@Expose
	private Rates rates;

	public Integer getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Integer timestamp) {
		this.timestamp = timestamp;
	}

	public String getBase() {
		return base;
	}

	public void setBase(String base) {
		this.base = base;
	}

	public Rates getRates() {
		return rates;
	}

	public void setRates(Rates rates) {
		this.rates = rates;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("timestamp", timestamp).append("base", base).append("rates", rates)
				.toString();
	}

}