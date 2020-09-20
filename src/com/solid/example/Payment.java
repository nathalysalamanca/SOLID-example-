package com.solid.example;

import com.solid.example.interfaces.Persistence;
import com.solid.example.service.TransactionServiceMySQL;

public class Payment extends Transaction {
	public Payment(Persistence persistence) {
		super(persistence);
	}

	private String TransactionCode;
	private TransactionServiceMySQL trxService = new TransactionServiceMySQL();

	@Override
	public boolean saveTransaction() {
		trxService.saveTrx(this);
		return false;
	}
	
}
