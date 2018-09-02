package com.currencyConvertor.main.json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "from", "to", "amount" })
public class Query {

	@JsonProperty("from")
	private String from;
	@JsonProperty("to")
	private String to;
	@JsonProperty("amount")
	private Integer amount;

	@JsonProperty("from")
	public String getFrom() {
		return from;
	}

	@JsonProperty("from")
	public void setFrom(String from) {
		this.from = from;
	}

	@JsonProperty("to")
	public String getTo() {
		return to;
	}

	@JsonProperty("to")
	public void setTo(String to) {
		this.to = to;
	}

	@JsonProperty("amount")
	public Integer getAmount() {
		return amount;
	}

	@JsonProperty("amount")
	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Query [from=").append(from).append(", to=").append(to).append(", amount=").append(amount).append("]");
		return builder.toString();
	}

}