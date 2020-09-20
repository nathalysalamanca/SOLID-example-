package com.solid.example.interfaces;

import com.solid.example.Transaction;

public interface Persistence {
	
	public boolean saveTrx(Transaction trx);

}
