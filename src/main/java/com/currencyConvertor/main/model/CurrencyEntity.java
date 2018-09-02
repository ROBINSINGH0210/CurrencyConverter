package com.currencyConvertor.main.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "CurrencyHistory", uniqueConstraints = { @UniqueConstraint(columnNames = { "calldate", "query", "result" }) })
public class CurrencyEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="calldate",nullable = false)
	@Temporal(TemporalType.DATE)
	private Date callDate;
	@Column(name = "query",nullable = false)
	private String query;
	@Column(name= "info",nullable = false)
	private String info;
	@Column(name="result",nullable = false)
	private Double result;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getCallDate() {
		return callDate;
	}

	public void setCallDate(Date callDate) {
		this.callDate = callDate;
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public Double getResult() {
		return result;
	}

	public void setResult(Double result) {
		this.result = result;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CurrencyEntity [id=").append(id).append(", callDate=").append(callDate).append(", query=").append(query)
				.append(", info=").append(info).append(", result=").append(result).append("]");
		return builder.toString();
	}
}
