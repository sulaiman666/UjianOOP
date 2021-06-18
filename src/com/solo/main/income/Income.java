package com.solo.main.income;

public class Income {
	private String incomeType;
	private double amount;
	private double tax;
	
	public Income(String incomeType, double amount, double tax) {
		this.incomeType = incomeType;
		this.amount = amount;
		this.tax = tax;
	}
	
	public String getIncomeType() {
		return this.incomeType;
	}
	
	public double getAmount() {
		return this.amount;
	}
	
	public double getTax() {
		return this.tax;
	}
	
	public double getTotalTax() {
		return (tax/100) * amount;
	}
}
