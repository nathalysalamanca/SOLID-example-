package com.solid.example.service;

import com.solid.example.Transaction;
import com.solid.example.interfaces.Persistence;

public class TransactionService implements Persistence<Transaction>{
	
	@Override
	public boolean saveTrx(Transaction tx) {
		System.out.println("Se almaceno la transaccion " + tx.toString());
		return true;
	}
	
	
	
}
