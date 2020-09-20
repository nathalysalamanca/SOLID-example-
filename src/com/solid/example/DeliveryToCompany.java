package com.solid.example;

import java.math.BigDecimal;

public class DeliveryToCompany extends Delivery{
	
	private String account;
	@Override
	public void getComission() {
		this.comission = this.getValue().multiply(BigDecimal.valueOf(.05)) ;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
}
