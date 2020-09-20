package com.solid.example.interfaces;

public interface Persistence<T> {
	
	public boolean saveTrx(T trx);

}
