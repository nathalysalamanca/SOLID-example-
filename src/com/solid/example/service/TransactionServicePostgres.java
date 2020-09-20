package com.solid.example.service;

import com.solid.example.Transaction;
import com.solid.example.interfaces.Persistence;

public class TransactionServicePostgres implements Persistence{

	@Override
	public boolean saveTrx(Transaction trx) {
		System.out.println("Se almaceno la transaccion en BD POSTGRES " + trx.toString());
		return false;
	}

}
