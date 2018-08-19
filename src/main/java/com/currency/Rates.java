package com.currency;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Rates {

	@SerializedName("EUR")
	@Expose
	private Double eUR;
	@SerializedName("USD")
	@Expose
	private Double uSD;
	@SerializedName("GBP")
	@Expose
	private Integer gBP;
	@SerializedName("NZD")
	@Expose
	private Double nZD;
	@SerializedName("AUD")
	@Expose
	private Double aUD;
	@SerializedName("JPY")
	@Expose
	private Double jPY;
	@SerializedName("HUF")
	@Expose
	private Double hUF;
	@SerializedName("INR")
	@Expose
	private Double iNR;

	public Double getEUR() {
		return eUR;
	}

	public void setEUR(Double eUR) {
		this.eUR = eUR;
	}

	public Double getUSD() {
		return uSD;
	}

	public void setUSD(Double uSD) {
		this.uSD = uSD;
	}

	public Integer getGBP() {
		return gBP;
	}

	public void setGBP(Integer gBP) {
		this.gBP = gBP;
	}

	public Double getNZD() {
		return nZD;
	}

	public void setNZD(Double nZD) {
		this.nZD = nZD;
	}

	public Double getAUD() {
		return aUD;
	}

	public void setAUD(Double aUD) {
		this.aUD = aUD;
	}

	public Double getJPY() {
		return jPY;
	}

	public void setJPY(Double jPY) {
		this.jPY = jPY;
	}

	public Double getHUF() {
		return hUF;
	}

	public void setHUF(Double hUF) {
		this.hUF = hUF;
	}

	public Double getINR() {
		return iNR;
	}

	public void setINR(Double iNR) {
		this.iNR = iNR;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("eUR", eUR).append("uSD", uSD).append("gBP", gBP).append("nZD", nZD)
				.append("aUD", aUD).append("jPY", jPY).append("hUF", hUF).append("iNR", iNR).toString();
	}

}