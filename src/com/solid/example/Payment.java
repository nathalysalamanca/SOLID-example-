package com.solid.example;

import com.solid.example.service.TransactionService;

public class Payment extends Transaction {
	private String TransactionCode;

	@Override
	public boolean saveTransaction() {
		new TransactionService().saveTrx(this);
		return false;
	}
	
}
