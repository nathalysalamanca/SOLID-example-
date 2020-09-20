package com.solid.example;

import java.math.BigDecimal;

import com.solid.example.interfaces.IPoints;
import com.solid.example.interfaces.ITaxes;
import com.solid.example.interfaces.Persistence;

public class Delivery extends Transaction implements ITaxes, IPoints {

	public Delivery(Persistence persistence) {
		super(persistence);
	}

	protected BigDecimal comission;
	private BigDecimal IVA;
	private int points;

	@Override
	public boolean saveTransaction() {
		getIVA();
		getComission();
		getPoints();
		super.persistence.saveTrx(this);
		return false;
	}

	@Override
	public void getIVA() {
		this.IVA = this.getValue().multiply(BigDecimal.valueOf(0.19));
	}

	@Override
	public void getComission() {
		this.comission = this.getValue().multiply(BigDecimal.valueOf(.01));
	}

	@Override
	public void getPoints() {
		this.points = this.getValue().divide(BigDecimal.valueOf(1000)).intValue();

	}

	@Override
	public String toString() {
		return super.toString() + ", Delivery [comission=" + comission + ", IVA=" + IVA + ", points=" + points + "]";
	}

}
