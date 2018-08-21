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
@JsonPropertyOrder({ "AED", "AFN", "ALL", "AMD", "ANG", "AOA", "ARS", "AUD", "AWG", "AZN", "BAM", "BBD", "BDT", "BGN",
		"BHD", "BIF", "BMD", "BND", "BOB", "BRL", "BSD", "BTC", "BTN", "BWP", "BYN", "BZD", "CAD", "CDF", "CHF", "CLF",
		"CLP", "CNH", "CNY", "COP", "CRC", "CUC", "CUP", "CVE", "CZK", "DJF", "DKK", "DOP", "DZD", "EGP", "ERN", "ETB",
		"EUR", "FJD", "FKP", "GBP", "GEL", "GGP", "GHS", "GIP", "GMD", "GNF", "GTQ", "GYD", "HKD", "HNL", "HRK", "HTG",
		"HUF", "IDR", "ILS", "IMP", "INR", "IQD", "IRR", "ISK", "JEP", "JMD", "JOD", "JPY", "KES", "KGS", "KHR", "KMF",
		"KPW", "KRW", "KWD", "KYD", "KZT", "LAK", "LBP", "LKR", "LRD", "LSL", "LYD", "MAD", "MDL", "MGA", "MKD", "MMK",
		"MNT", "MOP", "MRO", "MRU", "MUR", "MVR", "MWK", "MXN", "MYR", "MZN", "NAD", "NGN", "NIO", "NOK", "NPR", "NZD",
		"OMR", "PAB", "PEN", "PGK", "PHP", "PKR", "PLN", "PYG", "QAR", "RON", "RSD", "RUB", "RWF", "SAR", "SBD", "SCR",
		"SDG", "SEK", "SGD", "SHP", "SLL", "SOS", "SRD", "SSP", "STD", "STN", "SVC", "SYP", "SZL", "THB", "TJS", "TMT",
		"TND", "TOP", "TRY", "TTD", "TWD", "TZS", "UAH", "UGX", "USD", "UYU", "UZS", "VEF", "VES", "VND", "VUV", "WST",
		"XAF", "XAG", "XAU", "XCD", "XDR", "XOF", "XPD", "XPF", "XPT", "YER", "ZAR", "ZMW", "ZWL" })
public class Rates implements Serializable {

	@JsonProperty("AED")
	private Double aED;
	@JsonProperty("AFN")
	private Double aFN;
	@JsonProperty("ALL")
	private Double aLL;
	@JsonProperty("AMD")
	private Double aMD;
	@JsonProperty("ANG")
	private Double aNG;
	@JsonProperty("AOA")
	private Double aOA;
	@JsonProperty("ARS")
	private Double aRS;
	@JsonProperty("AUD")
	private Double aUD;
	@JsonProperty("AWG")
	private Double aWG;
	@JsonProperty("AZN")
	private Double aZN;
	@JsonProperty("BAM")
	private Double bAM;
	@JsonProperty("BBD")
	private Integer bBD;
	@JsonProperty("BDT")
	private Double bDT;
	@JsonProperty("BGN")
	private Double bGN;
	@JsonProperty("BHD")
	private Double bHD;
	@JsonProperty("BIF")
	private Double bIF;
	@JsonProperty("BMD")
	private Integer bMD;
	@JsonProperty("BND")
	private Double bND;
	@JsonProperty("BOB")
	private Double bOB;
	@JsonProperty("BRL")
	private Double bRL;
	@JsonProperty("BSD")
	private Integer bSD;
	@JsonProperty("BTC")
	private Double bTC;
	@JsonProperty("BTN")
	private Double bTN;
	@JsonProperty("BWP")
	private Double bWP;
	@JsonProperty("BYN")
	private Double bYN;
	@JsonProperty("BZD")
	private Double bZD;
	@JsonProperty("CAD")
	private Double cAD;
	@JsonProperty("CDF")
	private Double cDF;
	@JsonProperty("CHF")
	private Double cHF;
	@JsonProperty("CLF")
	private Double cLF;
	@JsonProperty("CLP")
	private Double cLP;
	@JsonProperty("CNH")
	private Double cNH;
	@JsonProperty("CNY")
	private Double cNY;
	@JsonProperty("COP")
	private Double cOP;
	@JsonProperty("CRC")
	private Double cRC;
	@JsonProperty("CUC")
	private Integer cUC;
	@JsonProperty("CUP")
	private Double cUP;
	@JsonProperty("CVE")
	private Double cVE;
	@JsonProperty("CZK")
	private Double cZK;
	@JsonProperty("DJF")
	private Integer dJF;
	@JsonProperty("DKK")
	private Double dKK;
	@JsonProperty("DOP")
	private Double dOP;
	@JsonProperty("DZD")
	private Double dZD;
	@JsonProperty("EGP")
	private Double eGP;
	@JsonProperty("ERN")
	private Double eRN;
	@JsonProperty("ETB")
	private Double eTB;
	@JsonProperty("EUR")
	private Double eUR;
	@JsonProperty("FJD")
	private Double fJD;
	@JsonProperty("FKP")
	private Double fKP;
	@JsonProperty("GBP")
	private Double gBP;
	@JsonProperty("GEL")
	private Double gEL;
	@JsonProperty("GGP")
	private Double gGP;
	@JsonProperty("GHS")
	private Double gHS;
	@JsonProperty("GIP")
	private Double gIP;
	@JsonProperty("GMD")
	private Double gMD;
	@JsonProperty("GNF")
	private Double gNF;
	@JsonProperty("GTQ")
	private Double gTQ;
	@JsonProperty("GYD")
	private Double gYD;
	@JsonProperty("HKD")
	private Double hKD;
	@JsonProperty("HNL")
	private Double hNL;
	@JsonProperty("HRK")
	private Double hRK;
	@JsonProperty("HTG")
	private Double hTG;
	@JsonProperty("HUF")
	private Double hUF;
	@JsonProperty("IDR")
	private Double iDR;
	@JsonProperty("ILS")
	private Double iLS;
	@JsonProperty("IMP")
	private Double iMP;
	@JsonProperty("INR")
	private Double iNR;
	@JsonProperty("IQD")
	private Double iQD;
	@JsonProperty("IRR")
	private Double iRR;
	@JsonProperty("ISK")
	private Double iSK;
	@JsonProperty("JEP")
	private Double jEP;
	@JsonProperty("JMD")
	private Double jMD;
	@JsonProperty("JOD")
	private Double jOD;
	@JsonProperty("JPY")
	private Double jPY;
	@JsonProperty("KES")
	private Double kES;
	@JsonProperty("KGS")
	private Double kGS;
	@JsonProperty("KHR")
	private Double kHR;
	@JsonProperty("KMF")
	private Double kMF;
	@JsonProperty("KPW")
	private Integer kPW;
	@JsonProperty("KRW")
	private Double kRW;
	@JsonProperty("KWD")
	private Double kWD;
	@JsonProperty("KYD")
	private Double kYD;
	@JsonProperty("KZT")
	private Double kZT;
	@JsonProperty("LAK")
	private Double lAK;
	@JsonProperty("LBP")
	private Double lBP;
	@JsonProperty("LKR")
	private Double lKR;
	@JsonProperty("LRD")
	private Double lRD;
	@JsonProperty("LSL")
	private Double lSL;
	@JsonProperty("LYD")
	private Double lYD;
	@JsonProperty("MAD")
	private Double mAD;
	@JsonProperty("MDL")
	private Double mDL;
	@JsonProperty("MGA")
	private Double mGA;
	@JsonProperty("MKD")
	private Double mKD;
	@JsonProperty("MMK")
	private Double mMK;
	@JsonProperty("MNT")
	private Double mNT;
	@JsonProperty("MOP")
	private Double mOP;
	@JsonProperty("MRO")
	private Integer mRO;
	@JsonProperty("MRU")
	private Integer mRU;
	@JsonProperty("MUR")
	private Double mUR;
	@JsonProperty("MVR")
	private Double mVR;
	@JsonProperty("MWK")
	private Double mWK;
	@JsonProperty("MXN")
	private Double mXN;
	@JsonProperty("MYR")
	private Double mYR;
	@JsonProperty("MZN")
	private Double mZN;
	@JsonProperty("NAD")
	private Double nAD;
	@JsonProperty("NGN")
	private Double nGN;
	@JsonProperty("NIO")
	private Double nIO;
	@JsonProperty("NOK")
	private Double nOK;
	@JsonProperty("NPR")
	private Double nPR;
	@JsonProperty("NZD")
	private Double nZD;
	@JsonProperty("OMR")
	private Double oMR;
	@JsonProperty("PAB")
	private Integer pAB;
	@JsonProperty("PEN")
	private Double pEN;
	@JsonProperty("PGK")
	private Double pGK;
	@JsonProperty("PHP")
	private Double pHP;
	@JsonProperty("PKR")
	private Double pKR;
	@JsonProperty("PLN")
	private Double pLN;
	@JsonProperty("PYG")
	private Double pYG;
	@JsonProperty("QAR")
	private Double qAR;
	@JsonProperty("RON")
	private Double rON;
	@JsonProperty("RSD")
	private Double rSD;
	@JsonProperty("RUB")
	private Double rUB;
	@JsonProperty("RWF")
	private Double rWF;
	@JsonProperty("SAR")
	private Double sAR;
	@JsonProperty("SBD")
	private Double sBD;
	@JsonProperty("SCR")
	private Double sCR;
	@JsonProperty("SDG")
	private Double sDG;
	@JsonProperty("SEK")
	private Double sEK;
	@JsonProperty("SGD")
	private Double sGD;
	@JsonProperty("SHP")
	private Double sHP;
	@JsonProperty("SLL")
	private Integer sLL;
	@JsonProperty("SOS")
	private Double sOS;
	@JsonProperty("SRD")
	private Double sRD;
	@JsonProperty("SSP")
	private Double sSP;
	@JsonProperty("STD")
	private Double sTD;
	@JsonProperty("STN")
	private Double sTN;
	@JsonProperty("SVC")
	private Double sVC;
	@JsonProperty("SYP")
	private Double sYP;
	@JsonProperty("SZL")
	private Double sZL;
	@JsonProperty("THB")
	private Double tHB;
	@JsonProperty("TJS")
	private Double tJS;
	@JsonProperty("TMT")
	private Double tMT;
	@JsonProperty("TND")
	private Double tND;
	@JsonProperty("TOP")
	private Double tOP;
	@JsonProperty("TRY")
	private Double tRY;
	@JsonProperty("TTD")
	private Double tTD;
	@JsonProperty("TWD")
	private Double tWD;
	@JsonProperty("TZS")
	private Double tZS;
	@JsonProperty("UAH")
	private Double uAH;
	@JsonProperty("UGX")
	private Double uGX;
	@JsonProperty("USD")
	private Integer uSD;
	@JsonProperty("UYU")
	private Double uYU;
	@JsonProperty("UZS")
	private Double uZS;
	@JsonProperty("VEF")
	private Double vEF;
	@JsonProperty("VES")
	private Double vES;
	@JsonProperty("VND")
	private Double vND;
	@JsonProperty("VUV")
	private Double vUV;
	@JsonProperty("WST")
	private Double wST;
	@JsonProperty("XAF")
	private Double xAF;
	@JsonProperty("XAG")
	private Double xAG;
	@JsonProperty("XAU")
	private Double xAU;
	@JsonProperty("XCD")
	private Double xCD;
	@JsonProperty("XDR")
	private Double xDR;
	@JsonProperty("XOF")
	private Double xOF;
	@JsonProperty("XPD")
	private Double xPD;
	@JsonProperty("XPF")
	private Double xPF;
	@JsonProperty("XPT")
	private Double xPT;
	@JsonProperty("YER")
	private Double yER;
	@JsonProperty("ZAR")
	private Double zAR;
	@JsonProperty("ZMW")
	private Double zMW;
	@JsonProperty("ZWL")
	private Double zWL;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = 8334387487048356370L;

	@JsonProperty("AED")
	public Double getAED() {
		return aED;
	}

	@JsonProperty("AED")
	public void setAED(Double aED) {
		this.aED = aED;
	}

	@JsonProperty("AFN")
	public Double getAFN() {
		return aFN;
	}

	@JsonProperty("AFN")
	public void setAFN(Double aFN) {
		this.aFN = aFN;
	}

	@JsonProperty("ALL")
	public Double getALL() {
		return aLL;
	}

	@JsonProperty("ALL")
	public void setALL(Double aLL) {
		this.aLL = aLL;
	}

	@JsonProperty("AMD")
	public Double getAMD() {
		return aMD;
	}

	@JsonProperty("AMD")
	public void setAMD(Double aMD) {
		this.aMD = aMD;
	}

	@JsonProperty("ANG")
	public Double getANG() {
		return aNG;
	}

	@JsonProperty("ANG")
	public void setANG(Double aNG) {
		this.aNG = aNG;
	}

	@JsonProperty("AOA")
	public Double getAOA() {
		return aOA;
	}

	@JsonProperty("AOA")
	public void setAOA(Double aOA) {
		this.aOA = aOA;
	}

	@JsonProperty("ARS")
	public Double getARS() {
		return aRS;
	}

	@JsonProperty("ARS")
	public void setARS(Double aRS) {
		this.aRS = aRS;
	}

	@JsonProperty("AUD")
	public Double getAUD() {
		return aUD;
	}

	@JsonProperty("AUD")
	public void setAUD(Double aUD) {
		this.aUD = aUD;
	}

	@JsonProperty("AWG")
	public Double getAWG() {
		return aWG;
	}

	@JsonProperty("AWG")
	public void setAWG(Double aWG) {
		this.aWG = aWG;
	}

	@JsonProperty("AZN")
	public Double getAZN() {
		return aZN;
	}

	@JsonProperty("AZN")
	public void setAZN(Double aZN) {
		this.aZN = aZN;
	}

	@JsonProperty("BAM")
	public Double getBAM() {
		return bAM;
	}

	@JsonProperty("BAM")
	public void setBAM(Double bAM) {
		this.bAM = bAM;
	}

	@JsonProperty("BBD")
	public Integer getBBD() {
		return bBD;
	}

	@JsonProperty("BBD")
	public void setBBD(Integer bBD) {
		this.bBD = bBD;
	}

	@JsonProperty("BDT")
	public Double getBDT() {
		return bDT;
	}

	@JsonProperty("BDT")
	public void setBDT(Double bDT) {
		this.bDT = bDT;
	}

	@JsonProperty("BGN")
	public Double getBGN() {
		return bGN;
	}

	@JsonProperty("BGN")
	public void setBGN(Double bGN) {
		this.bGN = bGN;
	}

	@JsonProperty("BHD")
	public Double getBHD() {
		return bHD;
	}

	@JsonProperty("BHD")
	public void setBHD(Double bHD) {
		this.bHD = bHD;
	}

	@JsonProperty("BIF")
	public Double getBIF() {
		return bIF;
	}

	@JsonProperty("BIF")
	public void setBIF(Double bIF) {
		this.bIF = bIF;
	}

	@JsonProperty("BMD")
	public Integer getBMD() {
		return bMD;
	}

	@JsonProperty("BMD")
	public void setBMD(Integer bMD) {
		this.bMD = bMD;
	}

	@JsonProperty("BND")
	public Double getBND() {
		return bND;
	}

	@JsonProperty("BND")
	public void setBND(Double bND) {
		this.bND = bND;
	}

	@JsonProperty("BOB")
	public Double getBOB() {
		return bOB;
	}

	@JsonProperty("BOB")
	public void setBOB(Double bOB) {
		this.bOB = bOB;
	}

	@JsonProperty("BRL")
	public Double getBRL() {
		return bRL;
	}

	@JsonProperty("BRL")
	public void setBRL(Double bRL) {
		this.bRL = bRL;
	}

	@JsonProperty("BSD")
	public Integer getBSD() {
		return bSD;
	}

	@JsonProperty("BSD")
	public void setBSD(Integer bSD) {
		this.bSD = bSD;
	}

	@JsonProperty("BTC")
	public Double getBTC() {
		return bTC;
	}

	@JsonProperty("BTC")
	public void setBTC(Double bTC) {
		this.bTC = bTC;
	}

	@JsonProperty("BTN")
	public Double getBTN() {
		return bTN;
	}

	@JsonProperty("BTN")
	public void setBTN(Double bTN) {
		this.bTN = bTN;
	}

	@JsonProperty("BWP")
	public Double getBWP() {
		return bWP;
	}

	@JsonProperty("BWP")
	public void setBWP(Double bWP) {
		this.bWP = bWP;
	}

	@JsonProperty("BYN")
	public Double getBYN() {
		return bYN;
	}

	@JsonProperty("BYN")
	public void setBYN(Double bYN) {
		this.bYN = bYN;
	}

	@JsonProperty("BZD")
	public Double getBZD() {
		return bZD;
	}

	@JsonProperty("BZD")
	public void setBZD(Double bZD) {
		this.bZD = bZD;
	}

	@JsonProperty("CAD")
	public Double getCAD() {
		return cAD;
	}

	@JsonProperty("CAD")
	public void setCAD(Double cAD) {
		this.cAD = cAD;
	}

	@JsonProperty("CDF")
	public Double getCDF() {
		return cDF;
	}

	@JsonProperty("CDF")
	public void setCDF(Double cDF) {
		this.cDF = cDF;
	}

	@JsonProperty("CHF")
	public Double getCHF() {
		return cHF;
	}

	@JsonProperty("CHF")
	public void setCHF(Double cHF) {
		this.cHF = cHF;
	}

	@JsonProperty("CLF")
	public Double getCLF() {
		return cLF;
	}

	@JsonProperty("CLF")
	public void setCLF(Double cLF) {
		this.cLF = cLF;
	}

	@JsonProperty("CLP")
	public Double getCLP() {
		return cLP;
	}

	@JsonProperty("CLP")
	public void setCLP(Double cLP) {
		this.cLP = cLP;
	}

	@JsonProperty("CNH")
	public Double getCNH() {
		return cNH;
	}

	@JsonProperty("CNH")
	public void setCNH(Double cNH) {
		this.cNH = cNH;
	}

	@JsonProperty("CNY")
	public Double getCNY() {
		return cNY;
	}

	@JsonProperty("CNY")
	public void setCNY(Double cNY) {
		this.cNY = cNY;
	}

	@JsonProperty("COP")
	public Double getCOP() {
		return cOP;
	}

	@JsonProperty("COP")
	public void setCOP(Double cOP) {
		this.cOP = cOP;
	}

	@JsonProperty("CRC")
	public Double getCRC() {
		return cRC;
	}

	@JsonProperty("CRC")
	public void setCRC(Double cRC) {
		this.cRC = cRC;
	}

	@JsonProperty("CUC")
	public Integer getCUC() {
		return cUC;
	}

	@JsonProperty("CUC")
	public void setCUC(Integer cUC) {
		this.cUC = cUC;
	}

	@JsonProperty("CUP")
	public Double getCUP() {
		return cUP;
	}

	@JsonProperty("CUP")
	public void setCUP(Double cUP) {
		this.cUP = cUP;
	}

	@JsonProperty("CVE")
	public Double getCVE() {
		return cVE;
	}

	@JsonProperty("CVE")
	public void setCVE(Double cVE) {
		this.cVE = cVE;
	}

	@JsonProperty("CZK")
	public Double getCZK() {
		return cZK;
	}

	@JsonProperty("CZK")
	public void setCZK(Double cZK) {
		this.cZK = cZK;
	}

	@JsonProperty("DJF")
	public Integer getDJF() {
		return dJF;
	}

	@JsonProperty("DJF")
	public void setDJF(Integer dJF) {
		this.dJF = dJF;
	}

	@JsonProperty("DKK")
	public Double getDKK() {
		return dKK;
	}

	@JsonProperty("DKK")
	public void setDKK(Double dKK) {
		this.dKK = dKK;
	}

	@JsonProperty("DOP")
	public Double getDOP() {
		return dOP;
	}

	@JsonProperty("DOP")
	public void setDOP(Double dOP) {
		this.dOP = dOP;
	}

	@JsonProperty("DZD")
	public Double getDZD() {
		return dZD;
	}

	@JsonProperty("DZD")
	public void setDZD(Double dZD) {
		this.dZD = dZD;
	}

	@JsonProperty("EGP")
	public Double getEGP() {
		return eGP;
	}

	@JsonProperty("EGP")
	public void setEGP(Double eGP) {
		this.eGP = eGP;
	}

	@JsonProperty("ERN")
	public Double getERN() {
		return eRN;
	}

	@JsonProperty("ERN")
	public void setERN(Double eRN) {
		this.eRN = eRN;
	}

	@JsonProperty("ETB")
	public Double getETB() {
		return eTB;
	}

	@JsonProperty("ETB")
	public void setETB(Double eTB) {
		this.eTB = eTB;
	}

	@JsonProperty("EUR")
	public Double getEUR() {
		return eUR;
	}

	@JsonProperty("EUR")
	public void setEUR(Double eUR) {
		this.eUR = eUR;
	}

	@JsonProperty("FJD")
	public Double getFJD() {
		return fJD;
	}

	@JsonProperty("FJD")
	public void setFJD(Double fJD) {
		this.fJD = fJD;
	}

	@JsonProperty("FKP")
	public Double getFKP() {
		return fKP;
	}

	@JsonProperty("FKP")
	public void setFKP(Double fKP) {
		this.fKP = fKP;
	}

	@JsonProperty("GBP")
	public Double getGBP() {
		return gBP;
	}

	@JsonProperty("GBP")
	public void setGBP(Double gBP) {
		this.gBP = gBP;
	}

	@JsonProperty("GEL")
	public Double getGEL() {
		return gEL;
	}

	@JsonProperty("GEL")
	public void setGEL(Double gEL) {
		this.gEL = gEL;
	}

	@JsonProperty("GGP")
	public Double getGGP() {
		return gGP;
	}

	@JsonProperty("GGP")
	public void setGGP(Double gGP) {
		this.gGP = gGP;
	}

	@JsonProperty("GHS")
	public Double getGHS() {
		return gHS;
	}

	@JsonProperty("GHS")
	public void setGHS(Double gHS) {
		this.gHS = gHS;
	}

	@JsonProperty("GIP")
	public Double getGIP() {
		return gIP;
	}

	@JsonProperty("GIP")
	public void setGIP(Double gIP) {
		this.gIP = gIP;
	}

	@JsonProperty("GMD")
	public Double getGMD() {
		return gMD;
	}

	@JsonProperty("GMD")
	public void setGMD(Double gMD) {
		this.gMD = gMD;
	}

	@JsonProperty("GNF")
	public Double getGNF() {
		return gNF;
	}

	@JsonProperty("GNF")
	public void setGNF(Double gNF) {
		this.gNF = gNF;
	}

	@JsonProperty("GTQ")
	public Double getGTQ() {
		return gTQ;
	}

	@JsonProperty("GTQ")
	public void setGTQ(Double gTQ) {
		this.gTQ = gTQ;
	}

	@JsonProperty("GYD")
	public Double getGYD() {
		return gYD;
	}

	@JsonProperty("GYD")
	public void setGYD(Double gYD) {
		this.gYD = gYD;
	}

	@JsonProperty("HKD")
	public Double getHKD() {
		return hKD;
	}

	@JsonProperty("HKD")
	public void setHKD(Double hKD) {
		this.hKD = hKD;
	}

	@JsonProperty("HNL")
	public Double getHNL() {
		return hNL;
	}

	@JsonProperty("HNL")
	public void setHNL(Double hNL) {
		this.hNL = hNL;
	}

	@JsonProperty("HRK")
	public Double getHRK() {
		return hRK;
	}

	@JsonProperty("HRK")
	public void setHRK(Double hRK) {
		this.hRK = hRK;
	}

	@JsonProperty("HTG")
	public Double getHTG() {
		return hTG;
	}

	@JsonProperty("HTG")
	public void setHTG(Double hTG) {
		this.hTG = hTG;
	}

	@JsonProperty("HUF")
	public Double getHUF() {
		return hUF;
	}

	@JsonProperty("HUF")
	public void setHUF(Double hUF) {
		this.hUF = hUF;
	}

	@JsonProperty("IDR")
	public Double getIDR() {
		return iDR;
	}

	@JsonProperty("IDR")
	public void setIDR(Double iDR) {
		this.iDR = iDR;
	}

	@JsonProperty("ILS")
	public Double getILS() {
		return iLS;
	}

	@JsonProperty("ILS")
	public void setILS(Double iLS) {
		this.iLS = iLS;
	}

	@JsonProperty("IMP")
	public Double getIMP() {
		return iMP;
	}

	@JsonProperty("IMP")
	public void setIMP(Double iMP) {
		this.iMP = iMP;
	}

	@JsonProperty("INR")
	public Double getINR() {
		return iNR;
	}

	@JsonProperty("INR")
	public void setINR(Double iNR) {
		this.iNR = iNR;
	}

	@JsonProperty("IQD")
	public Double getIQD() {
		return iQD;
	}

	@JsonProperty("IQD")
	public void setIQD(Double iQD) {
		this.iQD = iQD;
	}

	@JsonProperty("IRR")
	public Double getIRR() {
		return iRR;
	}

	@JsonProperty("IRR")
	public void setIRR(Double iRR) {
		this.iRR = iRR;
	}

	@JsonProperty("ISK")
	public Double getISK() {
		return iSK;
	}

	@JsonProperty("ISK")
	public void setISK(Double iSK) {
		this.iSK = iSK;
	}

	@JsonProperty("JEP")
	public Double getJEP() {
		return jEP;
	}

	@JsonProperty("JEP")
	public void setJEP(Double jEP) {
		this.jEP = jEP;
	}

	@JsonProperty("JMD")
	public Double getJMD() {
		return jMD;
	}

	@JsonProperty("JMD")
	public void setJMD(Double jMD) {
		this.jMD = jMD;
	}

	@JsonProperty("JOD")
	public Double getJOD() {
		return jOD;
	}

	@JsonProperty("JOD")
	public void setJOD(Double jOD) {
		this.jOD = jOD;
	}

	@JsonProperty("JPY")
	public Double getJPY() {
		return jPY;
	}

	@JsonProperty("JPY")
	public void setJPY(Double jPY) {
		this.jPY = jPY;
	}

	@JsonProperty("KES")
	public Double getKES() {
		return kES;
	}

	@JsonProperty("KES")
	public void setKES(Double kES) {
		this.kES = kES;
	}

	@JsonProperty("KGS")
	public Double getKGS() {
		return kGS;
	}

	@JsonProperty("KGS")
	public void setKGS(Double kGS) {
		this.kGS = kGS;
	}

	@JsonProperty("KHR")
	public Double getKHR() {
		return kHR;
	}

	@JsonProperty("KHR")
	public void setKHR(Double kHR) {
		this.kHR = kHR;
	}

	@JsonProperty("KMF")
	public Double getKMF() {
		return kMF;
	}

	@JsonProperty("KMF")
	public void setKMF(Double kMF) {
		this.kMF = kMF;
	}

	@JsonProperty("KPW")
	public Integer getKPW() {
		return kPW;
	}

	@JsonProperty("KPW")
	public void setKPW(Integer kPW) {
		this.kPW = kPW;
	}

	@JsonProperty("KRW")
	public Double getKRW() {
		return kRW;
	}

	@JsonProperty("KRW")
	public void setKRW(Double kRW) {
		this.kRW = kRW;
	}

	@JsonProperty("KWD")
	public Double getKWD() {
		return kWD;
	}

	@JsonProperty("KWD")
	public void setKWD(Double kWD) {
		this.kWD = kWD;
	}

	@JsonProperty("KYD")
	public Double getKYD() {
		return kYD;
	}

	@JsonProperty("KYD")
	public void setKYD(Double kYD) {
		this.kYD = kYD;
	}

	@JsonProperty("KZT")
	public Double getKZT() {
		return kZT;
	}

	@JsonProperty("KZT")
	public void setKZT(Double kZT) {
		this.kZT = kZT;
	}

	@JsonProperty("LAK")
	public Double getLAK() {
		return lAK;
	}

	@JsonProperty("LAK")
	public void setLAK(Double lAK) {
		this.lAK = lAK;
	}

	@JsonProperty("LBP")
	public Double getLBP() {
		return lBP;
	}

	@JsonProperty("LBP")
	public void setLBP(Double lBP) {
		this.lBP = lBP;
	}

	@JsonProperty("LKR")
	public Double getLKR() {
		return lKR;
	}

	@JsonProperty("LKR")
	public void setLKR(Double lKR) {
		this.lKR = lKR;
	}

	@JsonProperty("LRD")
	public Double getLRD() {
		return lRD;
	}

	@JsonProperty("LRD")
	public void setLRD(Double lRD) {
		this.lRD = lRD;
	}

	@JsonProperty("LSL")
	public Double getLSL() {
		return lSL;
	}

	@JsonProperty("LSL")
	public void setLSL(Double lSL) {
		this.lSL = lSL;
	}

	@JsonProperty("LYD")
	public Double getLYD() {
		return lYD;
	}

	@JsonProperty("LYD")
	public void setLYD(Double lYD) {
		this.lYD = lYD;
	}

	@JsonProperty("MAD")
	public Double getMAD() {
		return mAD;
	}

	@JsonProperty("MAD")
	public void setMAD(Double mAD) {
		this.mAD = mAD;
	}

	@JsonProperty("MDL")
	public Double getMDL() {
		return mDL;
	}

	@JsonProperty("MDL")
	public void setMDL(Double mDL) {
		this.mDL = mDL;
	}

	@JsonProperty("MGA")
	public Double getMGA() {
		return mGA;
	}

	@JsonProperty("MGA")
	public void setMGA(Double mGA) {
		this.mGA = mGA;
	}

	@JsonProperty("MKD")
	public Double getMKD() {
		return mKD;
	}

	@JsonProperty("MKD")
	public void setMKD(Double mKD) {
		this.mKD = mKD;
	}

	@JsonProperty("MMK")
	public Double getMMK() {
		return mMK;
	}

	@JsonProperty("MMK")
	public void setMMK(Double mMK) {
		this.mMK = mMK;
	}

	@JsonProperty("MNT")
	public Double getMNT() {
		return mNT;
	}

	@JsonProperty("MNT")
	public void setMNT(Double mNT) {
		this.mNT = mNT;
	}

	@JsonProperty("MOP")
	public Double getMOP() {
		return mOP;
	}

	@JsonProperty("MOP")
	public void setMOP(Double mOP) {
		this.mOP = mOP;
	}

	@JsonProperty("MRO")
	public Integer getMRO() {
		return mRO;
	}

	@JsonProperty("MRO")
	public void setMRO(Integer mRO) {
		this.mRO = mRO;
	}

	@JsonProperty("MRU")
	public Integer getMRU() {
		return mRU;
	}

	@JsonProperty("MRU")
	public void setMRU(Integer mRU) {
		this.mRU = mRU;
	}

	@JsonProperty("MUR")
	public Double getMUR() {
		return mUR;
	}

	@JsonProperty("MUR")
	public void setMUR(Double mUR) {
		this.mUR = mUR;
	}

	@JsonProperty("MVR")
	public Double getMVR() {
		return mVR;
	}

	@JsonProperty("MVR")
	public void setMVR(Double mVR) {
		this.mVR = mVR;
	}

	@JsonProperty("MWK")
	public Double getMWK() {
		return mWK;
	}

	@JsonProperty("MWK")
	public void setMWK(Double mWK) {
		this.mWK = mWK;
	}

	@JsonProperty("MXN")
	public Double getMXN() {
		return mXN;
	}

	@JsonProperty("MXN")
	public void setMXN(Double mXN) {
		this.mXN = mXN;
	}

	@JsonProperty("MYR")
	public Double getMYR() {
		return mYR;
	}

	@JsonProperty("MYR")
	public void setMYR(Double mYR) {
		this.mYR = mYR;
	}

	@JsonProperty("MZN")
	public Double getMZN() {
		return mZN;
	}

	@JsonProperty("MZN")
	public void setMZN(Double mZN) {
		this.mZN = mZN;
	}

	@JsonProperty("NAD")
	public Double getNAD() {
		return nAD;
	}

	@JsonProperty("NAD")
	public void setNAD(Double nAD) {
		this.nAD = nAD;
	}

	@JsonProperty("NGN")
	public Double getNGN() {
		return nGN;
	}

	@JsonProperty("NGN")
	public void setNGN(Double nGN) {
		this.nGN = nGN;
	}

	@JsonProperty("NIO")
	public Double getNIO() {
		return nIO;
	}

	@JsonProperty("NIO")
	public void setNIO(Double nIO) {
		this.nIO = nIO;
	}

	@JsonProperty("NOK")
	public Double getNOK() {
		return nOK;
	}

	@JsonProperty("NOK")
	public void setNOK(Double nOK) {
		this.nOK = nOK;
	}

	@JsonProperty("NPR")
	public Double getNPR() {
		return nPR;
	}

	@JsonProperty("NPR")
	public void setNPR(Double nPR) {
		this.nPR = nPR;
	}

	@JsonProperty("NZD")
	public Double getNZD() {
		return nZD;
	}

	@JsonProperty("NZD")
	public void setNZD(Double nZD) {
		this.nZD = nZD;
	}

	@JsonProperty("OMR")
	public Double getOMR() {
		return oMR;
	}

	@JsonProperty("OMR")
	public void setOMR(Double oMR) {
		this.oMR = oMR;
	}

	@JsonProperty("PAB")
	public Integer getPAB() {
		return pAB;
	}

	@JsonProperty("PAB")
	public void setPAB(Integer pAB) {
		this.pAB = pAB;
	}

	@JsonProperty("PEN")
	public Double getPEN() {
		return pEN;
	}

	@JsonProperty("PEN")
	public void setPEN(Double pEN) {
		this.pEN = pEN;
	}

	@JsonProperty("PGK")
	public Double getPGK() {
		return pGK;
	}

	@JsonProperty("PGK")
	public void setPGK(Double pGK) {
		this.pGK = pGK;
	}

	@JsonProperty("PHP")
	public Double getPHP() {
		return pHP;
	}

	@JsonProperty("PHP")
	public void setPHP(Double pHP) {
		this.pHP = pHP;
	}

	@JsonProperty("PKR")
	public Double getPKR() {
		return pKR;
	}

	@JsonProperty("PKR")
	public void setPKR(Double pKR) {
		this.pKR = pKR;
	}

	@JsonProperty("PLN")
	public Double getPLN() {
		return pLN;
	}

	@JsonProperty("PLN")
	public void setPLN(Double pLN) {
		this.pLN = pLN;
	}

	@JsonProperty("PYG")
	public Double getPYG() {
		return pYG;
	}

	@JsonProperty("PYG")
	public void setPYG(Double pYG) {
		this.pYG = pYG;
	}

	@JsonProperty("QAR")
	public Double getQAR() {
		return qAR;
	}

	@JsonProperty("QAR")
	public void setQAR(Double qAR) {
		this.qAR = qAR;
	}

	@JsonProperty("RON")
	public Double getRON() {
		return rON;
	}

	@JsonProperty("RON")
	public void setRON(Double rON) {
		this.rON = rON;
	}

	@JsonProperty("RSD")
	public Double getRSD() {
		return rSD;
	}

	@JsonProperty("RSD")
	public void setRSD(Double rSD) {
		this.rSD = rSD;
	}

	@JsonProperty("RUB")
	public Double getRUB() {
		return rUB;
	}

	@JsonProperty("RUB")
	public void setRUB(Double rUB) {
		this.rUB = rUB;
	}

	@JsonProperty("RWF")
	public Double getRWF() {
		return rWF;
	}

	@JsonProperty("RWF")
	public void setRWF(Double rWF) {
		this.rWF = rWF;
	}

	@JsonProperty("SAR")
	public Double getSAR() {
		return sAR;
	}

	@JsonProperty("SAR")
	public void setSAR(Double sAR) {
		this.sAR = sAR;
	}

	@JsonProperty("SBD")
	public Double getSBD() {
		return sBD;
	}

	@JsonProperty("SBD")
	public void setSBD(Double sBD) {
		this.sBD = sBD;
	}

	@JsonProperty("SCR")
	public Double getSCR() {
		return sCR;
	}

	@JsonProperty("SCR")
	public void setSCR(Double sCR) {
		this.sCR = sCR;
	}

	@JsonProperty("SDG")
	public Double getSDG() {
		return sDG;
	}

	@JsonProperty("SDG")
	public void setSDG(Double sDG) {
		this.sDG = sDG;
	}

	@JsonProperty("SEK")
	public Double getSEK() {
		return sEK;
	}

	@JsonProperty("SEK")
	public void setSEK(Double sEK) {
		this.sEK = sEK;
	}

	@JsonProperty("SGD")
	public Double getSGD() {
		return sGD;
	}

	@JsonProperty("SGD")
	public void setSGD(Double sGD) {
		this.sGD = sGD;
	}

	@JsonProperty("SHP")
	public Double getSHP() {
		return sHP;
	}

	@JsonProperty("SHP")
	public void setSHP(Double sHP) {
		this.sHP = sHP;
	}

	@JsonProperty("SLL")
	public Integer getSLL() {
		return sLL;
	}

	@JsonProperty("SLL")
	public void setSLL(Integer sLL) {
		this.sLL = sLL;
	}

	@JsonProperty("SOS")
	public Double getSOS() {
		return sOS;
	}

	@JsonProperty("SOS")
	public void setSOS(Double sOS) {
		this.sOS = sOS;
	}

	@JsonProperty("SRD")
	public Double getSRD() {
		return sRD;
	}

	@JsonProperty("SRD")
	public void setSRD(Double sRD) {
		this.sRD = sRD;
	}

	@JsonProperty("SSP")
	public Double getSSP() {
		return sSP;
	}

	@JsonProperty("SSP")
	public void setSSP(Double sSP) {
		this.sSP = sSP;
	}

	@JsonProperty("STD")
	public Double getSTD() {
		return sTD;
	}

	@JsonProperty("STD")
	public void setSTD(Double sTD) {
		this.sTD = sTD;
	}

	@JsonProperty("STN")
	public Double getSTN() {
		return sTN;
	}

	@JsonProperty("STN")
	public void setSTN(Double sTN) {
		this.sTN = sTN;
	}

	@JsonProperty("SVC")
	public Double getSVC() {
		return sVC;
	}

	@JsonProperty("SVC")
	public void setSVC(Double sVC) {
		this.sVC = sVC;
	}

	@JsonProperty("SYP")
	public Double getSYP() {
		return sYP;
	}

	@JsonProperty("SYP")
	public void setSYP(Double sYP) {
		this.sYP = sYP;
	}

	@JsonProperty("SZL")
	public Double getSZL() {
		return sZL;
	}

	@JsonProperty("SZL")
	public void setSZL(Double sZL) {
		this.sZL = sZL;
	}

	@JsonProperty("THB")
	public Double getTHB() {
		return tHB;
	}

	@JsonProperty("THB")
	public void setTHB(Double tHB) {
		this.tHB = tHB;
	}

	@JsonProperty("TJS")
	public Double getTJS() {
		return tJS;
	}

	@JsonProperty("TJS")
	public void setTJS(Double tJS) {
		this.tJS = tJS;
	}

	@JsonProperty("TMT")
	public Double getTMT() {
		return tMT;
	}

	@JsonProperty("TMT")
	public void setTMT(Double tMT) {
		this.tMT = tMT;
	}

	@JsonProperty("TND")
	public Double getTND() {
		return tND;
	}

	@JsonProperty("TND")
	public void setTND(Double tND) {
		this.tND = tND;
	}

	@JsonProperty("TOP")
	public Double getTOP() {
		return tOP;
	}

	@JsonProperty("TOP")
	public void setTOP(Double tOP) {
		this.tOP = tOP;
	}

	@JsonProperty("TRY")
	public Double getTRY() {
		return tRY;
	}

	@JsonProperty("TRY")
	public void setTRY(Double tRY) {
		this.tRY = tRY;
	}

	@JsonProperty("TTD")
	public Double getTTD() {
		return tTD;
	}

	@JsonProperty("TTD")
	public void setTTD(Double tTD) {
		this.tTD = tTD;
	}

	@JsonProperty("TWD")
	public Double getTWD() {
		return tWD;
	}

	@JsonProperty("TWD")
	public void setTWD(Double tWD) {
		this.tWD = tWD;
	}

	@JsonProperty("TZS")
	public Double getTZS() {
		return tZS;
	}

	@JsonProperty("TZS")
	public void setTZS(Double tZS) {
		this.tZS = tZS;
	}

	@JsonProperty("UAH")
	public Double getUAH() {
		return uAH;
	}

	@JsonProperty("UAH")
	public void setUAH(Double uAH) {
		this.uAH = uAH;
	}

	@JsonProperty("UGX")
	public Double getUGX() {
		return uGX;
	}

	@JsonProperty("UGX")
	public void setUGX(Double uGX) {
		this.uGX = uGX;
	}

	@JsonProperty("USD")
	public Integer getUSD() {
		return uSD;
	}

	@JsonProperty("USD")
	public void setUSD(Integer uSD) {
		this.uSD = uSD;
	}

	@JsonProperty("UYU")
	public Double getUYU() {
		return uYU;
	}

	@JsonProperty("UYU")
	public void setUYU(Double uYU) {
		this.uYU = uYU;
	}

	@JsonProperty("UZS")
	public Double getUZS() {
		return uZS;
	}

	@JsonProperty("UZS")
	public void setUZS(Double uZS) {
		this.uZS = uZS;
	}

	@JsonProperty("VEF")
	public Double getVEF() {
		return vEF;
	}

	@JsonProperty("VEF")
	public void setVEF(Double vEF) {
		this.vEF = vEF;
	}

	@JsonProperty("VES")
	public Double getVES() {
		return vES;
	}

	@JsonProperty("VES")
	public void setVES(Double vES) {
		this.vES = vES;
	}

	@JsonProperty("VND")
	public Double getVND() {
		return vND;
	}

	@JsonProperty("VND")
	public void setVND(Double vND) {
		this.vND = vND;
	}

	@JsonProperty("VUV")
	public Double getVUV() {
		return vUV;
	}

	@JsonProperty("VUV")
	public void setVUV(Double vUV) {
		this.vUV = vUV;
	}

	@JsonProperty("WST")
	public Double getWST() {
		return wST;
	}

	@JsonProperty("WST")
	public void setWST(Double wST) {
		this.wST = wST;
	}

	@JsonProperty("XAF")
	public Double getXAF() {
		return xAF;
	}

	@JsonProperty("XAF")
	public void setXAF(Double xAF) {
		this.xAF = xAF;
	}

	@JsonProperty("XAG")
	public Double getXAG() {
		return xAG;
	}

	@JsonProperty("XAG")
	public void setXAG(Double xAG) {
		this.xAG = xAG;
	}

	@JsonProperty("XAU")
	public Double getXAU() {
		return xAU;
	}

	@JsonProperty("XAU")
	public void setXAU(Double xAU) {
		this.xAU = xAU;
	}

	@JsonProperty("XCD")
	public Double getXCD() {
		return xCD;
	}

	@JsonProperty("XCD")
	public void setXCD(Double xCD) {
		this.xCD = xCD;
	}

	@JsonProperty("XDR")
	public Double getXDR() {
		return xDR;
	}

	@JsonProperty("XDR")
	public void setXDR(Double xDR) {
		this.xDR = xDR;
	}

	@JsonProperty("XOF")
	public Double getXOF() {
		return xOF;
	}

	@JsonProperty("XOF")
	public void setXOF(Double xOF) {
		this.xOF = xOF;
	}

	@JsonProperty("XPD")
	public Double getXPD() {
		return xPD;
	}

	@JsonProperty("XPD")
	public void setXPD(Double xPD) {
		this.xPD = xPD;
	}

	@JsonProperty("XPF")
	public Double getXPF() {
		return xPF;
	}

	@JsonProperty("XPF")
	public void setXPF(Double xPF) {
		this.xPF = xPF;
	}

	@JsonProperty("XPT")
	public Double getXPT() {
		return xPT;
	}

	@JsonProperty("XPT")
	public void setXPT(Double xPT) {
		this.xPT = xPT;
	}

	@JsonProperty("YER")
	public Double getYER() {
		return yER;
	}

	@JsonProperty("YER")
	public void setYER(Double yER) {
		this.yER = yER;
	}

	@JsonProperty("ZAR")
	public Double getZAR() {
		return zAR;
	}

	@JsonProperty("ZAR")
	public void setZAR(Double zAR) {
		this.zAR = zAR;
	}

	@JsonProperty("ZMW")
	public Double getZMW() {
		return zMW;
	}

	@JsonProperty("ZMW")
	public void setZMW(Double zMW) {
		this.zMW = zMW;
	}

	@JsonProperty("ZWL")
	public Double getZWL() {
		return zWL;
	}

	@JsonProperty("ZWL")
	public void setZWL(Double zWL) {
		this.zWL = zWL;
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
		return new ToStringBuilder(this).append("aED", aED).append("aFN", aFN).append("aLL", aLL).append("aMD", aMD)
				.append("aNG", aNG).append("aOA", aOA).append("aRS", aRS).append("aUD", aUD).append("aWG", aWG)
				.append("aZN", aZN).append("bAM", bAM).append("bBD", bBD).append("bDT", bDT).append("bGN", bGN)
				.append("bHD", bHD).append("bIF", bIF).append("bMD", bMD).append("bND", bND).append("bOB", bOB)
				.append("bRL", bRL).append("bSD", bSD).append("bTC", bTC).append("bTN", bTN).append("bWP", bWP)
				.append("bYN", bYN).append("bZD", bZD).append("cAD", cAD).append("cDF", cDF).append("cHF", cHF)
				.append("cLF", cLF).append("cLP", cLP).append("cNH", cNH).append("cNY", cNY).append("cOP", cOP)
				.append("cRC", cRC).append("cUC", cUC).append("cUP", cUP).append("cVE", cVE).append("cZK", cZK)
				.append("dJF", dJF).append("dKK", dKK).append("dOP", dOP).append("dZD", dZD).append("eGP", eGP)
				.append("eRN", eRN).append("eTB", eTB).append("eUR", eUR).append("fJD", fJD).append("fKP", fKP)
				.append("gBP", gBP).append("gEL", gEL).append("gGP", gGP).append("gHS", gHS).append("gIP", gIP)
				.append("gMD", gMD).append("gNF", gNF).append("gTQ", gTQ).append("gYD", gYD).append("hKD", hKD)
				.append("hNL", hNL).append("hRK", hRK).append("hTG", hTG).append("hUF", hUF).append("iDR", iDR)
				.append("iLS", iLS).append("iMP", iMP).append("iNR", iNR).append("iQD", iQD).append("iRR", iRR)
				.append("iSK", iSK).append("jEP", jEP).append("jMD", jMD).append("jOD", jOD).append("jPY", jPY)
				.append("kES", kES).append("kGS", kGS).append("kHR", kHR).append("kMF", kMF).append("kPW", kPW)
				.append("kRW", kRW).append("kWD", kWD).append("kYD", kYD).append("kZT", kZT).append("lAK", lAK)
				.append("lBP", lBP).append("lKR", lKR).append("lRD", lRD).append("lSL", lSL).append("lYD", lYD)
				.append("mAD", mAD).append("mDL", mDL).append("mGA", mGA).append("mKD", mKD).append("mMK", mMK)
				.append("mNT", mNT).append("mOP", mOP).append("mRO", mRO).append("mRU", mRU).append("mUR", mUR)
				.append("mVR", mVR).append("mWK", mWK).append("mXN", mXN).append("mYR", mYR).append("mZN", mZN)
				.append("nAD", nAD).append("nGN", nGN).append("nIO", nIO).append("nOK", nOK).append("nPR", nPR)
				.append("nZD", nZD).append("oMR", oMR).append("pAB", pAB).append("pEN", pEN).append("pGK", pGK)
				.append("pHP", pHP).append("pKR", pKR).append("pLN", pLN).append("pYG", pYG).append("qAR", qAR)
				.append("rON", rON).append("rSD", rSD).append("rUB", rUB).append("rWF", rWF).append("sAR", sAR)
				.append("sBD", sBD).append("sCR", sCR).append("sDG", sDG).append("sEK", sEK).append("sGD", sGD)
				.append("sHP", sHP).append("sLL", sLL).append("sOS", sOS).append("sRD", sRD).append("sSP", sSP)
				.append("sTD", sTD).append("sTN", sTN).append("sVC", sVC).append("sYP", sYP).append("sZL", sZL)
				.append("tHB", tHB).append("tJS", tJS).append("tMT", tMT).append("tND", tND).append("tOP", tOP)
				.append("tRY", tRY).append("tTD", tTD).append("tWD", tWD).append("tZS", tZS).append("uAH", uAH)
				.append("uGX", uGX).append("uSD", uSD).append("uYU", uYU).append("uZS", uZS).append("vEF", vEF)
				.append("vES", vES).append("vND", vND).append("vUV", vUV).append("wST", wST).append("xAF", xAF)
				.append("xAG", xAG).append("xAU", xAU).append("xCD", xCD).append("xDR", xDR).append("xOF", xOF)
				.append("xPD", xPD).append("xPF", xPF).append("xPT", xPT).append("yER", yER).append("zAR", zAR)
				.append("zMW", zMW).append("zWL", zWL).append("additionalProperties", additionalProperties).toString();
	}

}