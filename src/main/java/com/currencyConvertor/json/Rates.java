package com.currencyConvertor.json;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "AUD", "EUR", "GBP", "HUF", "INR", "JPY", "NZD", "USD" })
public class Rates implements Serializable {

	@JsonProperty("AUD")
	private Double aUD;

	@JsonProperty("EUR")
	private Double eUR;

	@JsonProperty("GBP")
	private Double gBP;

	@JsonProperty("HUF")
	private Double hUF;

	@JsonProperty("INR")
	private Double iNR;

	@JsonProperty("JPY")
	private Double jPY;

	@JsonProperty("NZD")
	private Double nZD;

	@JsonProperty("USD")
	private Integer uSD;
	private final static long serialVersionUID = 8334387487048356370L;

	@JsonProperty("AUD")
	public Double getAUD() {
		return aUD;
	}

	@JsonProperty("AUD")
	public void setAUD(Double aUD) {
		this.aUD = aUD;
	}

	@JsonProperty("EUR")
	public Double getEUR() {
		return eUR;
	}

	@JsonProperty("EUR")
	public void setEUR(Double eUR) {
		this.eUR = eUR;
	}

	@JsonProperty("GBP")
	public Double getGBP() {
		return gBP;
	}

	@JsonProperty("GBP")
	public void setGBP(Double gBP) {
		this.gBP = gBP;
	}

	@JsonProperty("HUF")
	public Double getHUF() {
		return hUF;
	}

	@JsonProperty("HUF")
	public void setHUF(Double hUF) {
		this.hUF = hUF;
	}

	@JsonProperty("INR")
	public Double getINR() {
		return iNR;
	}

	@JsonProperty("INR")
	public void setINR(Double iNR) {
		this.iNR = iNR;
	}

	@JsonProperty("JPY")
	public Double getJPY() {
		return jPY;
	}

	@JsonProperty("JPY")
	public void setJPY(Double jPY) {
		this.jPY = jPY;
	}

	@JsonProperty("NZD")
	public Double getNZD() {
		return nZD;
	}

	@JsonProperty("NZD")
	public void setNZD(Double nZD) {
		this.nZD = nZD;
	}

	@JsonProperty("USD")
	public Integer getUSD() {
		return uSD;
	}

	@JsonProperty("USD")
	public void setUSD(Integer uSD) {
		this.uSD = uSD;
	}

	// @JsonAnyGetter
	// public Map<String, Object> getAdditionalProperties() {
	// return this.additionalProperties;
	// }
	//
	// @JsonAnySetter
	// public void setAdditionalProperty(String name, Object value) {
	// this.additionalProperties.put(name, value);
	// }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Rates [aUD=").append(aUD).append(", eUR=").append(eUR).append(", gBP=").append(gBP)
				.append(", hUF=").append(hUF).append(", iNR=").append(iNR).append(", jPY=").append(jPY).append(", nZD=")
				.append(nZD).append(", uSD=").append(uSD).append("]");
		return builder.toString();
	}

}