package com.solid.example;

import java.math.BigDecimal;

import com.solid.example.interfaces.Persistence;

public class DeliveryToCompany extends Delivery{
	
	public DeliveryToCompany(Persistence persistence) {
		super(persistence);
		// TODO Auto-generated constructor stub
	}
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
