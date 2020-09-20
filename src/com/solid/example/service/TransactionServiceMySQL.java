package com.solid.example.service;

import com.solid.example.Transaction;
import com.solid.example.interfaces.Persistence;

public class TransactionServiceMySQL implements Persistence{
	
	@Override
	public boolean saveTrx(Transaction tx) {
		System.out.println("Se almaceno la transaccion en BD MYSQL " + tx.toString());
		return true;
	}
	
}
