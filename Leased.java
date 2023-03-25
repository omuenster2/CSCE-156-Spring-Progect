package com.fmt;

import java.time.LocalDate;

public class Leased extends Equipment{
	

	private LocalDate startDate;
	private LocalDate endDate;
	private double leaseFee; 

	public Leased(Equipment e, LocalDate startDate, LocalDate endDate, double leaseFee) {
		super(e.code, e.name, e.model);
		this.startDate = startDate;
		this.endDate = endDate;
		this.leaseFee = leaseFee;
	}
	
	public LocalDate getStartDate() {
		return startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public double getLeaseFee() {
		return leaseFee;
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

