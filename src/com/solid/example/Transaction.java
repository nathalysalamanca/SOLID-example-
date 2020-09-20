package com.solid.example;

import java.math.BigDecimal;

public abstract class Transaction {

	private Client client;
	private Client counterpart;
	private BigDecimal value;

	public abstract boolean saveTransaction();
	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Client getCounterpart() {
		return counterpart;
	}

	public void setCounterpart(Client counterpart) {
		this.counterpart = counterpart;
	}

	public BigDecimal getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "Transaction [client=" + client.getName() + ", counterpart=" + counterpart.getName() + ", value=" + value + "]";
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}
}
