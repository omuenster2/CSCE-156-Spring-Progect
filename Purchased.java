package com.fmt;

public class Purchased extends Equipment{

	private double flatRate;

	public Purchased(Equipment e, double flatRate) {
		super(e.code, e.name, e.equipment, e.model);
		this.flatRate = flatRate;
	}

	@Override
	public double getTotalCost() {
		return 0;
	}

	@Override
	public double getTax() {
		return 0;
	}

	@Override
	public String toString() {
		return null;
	}
}

