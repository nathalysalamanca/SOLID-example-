package com.solid.example;

public class Client {
	private String name;
	private String idnumber;
	private int phone;
	
	public Client(String name, String idnumber, int phone) {
		super();
		this.name = name;
		this.idnumber = idnumber;
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public String getIdnumber() {
		return idnumber;
	}
	public int getPhone() {
		return phone;
	} 
}
