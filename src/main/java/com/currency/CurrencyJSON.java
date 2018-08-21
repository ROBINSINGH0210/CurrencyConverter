package com.currency;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "disclaimer", "license", "timestamp", "base", "rates" })
public class CurrencyJSON implements Serializable {

	@JsonProperty("disclaimer")
	private String disclaimer;
	@JsonProperty("license")
	private String license;
	@JsonProperty("timestamp")
	private Integer timestamp;
	@JsonProperty("base")
	private String base;
	@JsonProperty("rates")
	private Rates rates;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = 5089017721980439372L;

	@JsonProperty("disclaimer")
	public String getDisclaimer() {
		return disclaimer;
	}

	@JsonProperty("disclaimer")
	public void setDisclaimer(String disclaimer) {
		this.disclaimer = disclaimer;
	}

	@JsonProperty("license")
	public String getLicense() {
		return license;
	}

	@JsonProperty("license")
	public void setLicense(String license) {
		this.license = license;
	}

	@JsonProperty("timestamp")
	public Integer getTimestamp() {
		return timestamp;
	}

	@JsonProperty("timestamp")
	public void setTimestamp(Integer timestamp) {
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

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("disclaimer", disclaimer).append("license", license)
				.append("timestamp", timestamp).append("base", base).append("rates", rates)
				.append("additionalProperties", additionalProperties).toString();
	}

}