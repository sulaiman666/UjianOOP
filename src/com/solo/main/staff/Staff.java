package com.solo.main.staff;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

import com.solo.main.income.Income;

public class Staff {
	private String name;
	private String id;
	private Income income;
	private DecimalFormat kursIndonesia;
	private DecimalFormatSymbols formatRp;
	
	public Staff(String name, String id, Income income) {
		this.name = name;
		this.id = id;
		this.income = income;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getID() {
		return this.id;
	}
	
	public double calculateNetIncome() {
		return income.getAmount() - income.getTotalTax();
	}
	
	public void displayStaffInfo() {
		System.out.println("Data Karyawan");
		System.out.println("Nama Karyawan: " + this.name);
		System.out.println("ID Karyawan: " + this.id);
	}
	
	public void displayIncomeInfo() {
		formatRp = new DecimalFormatSymbols();
		formatRp.setCurrencySymbol("Rp. ");
		formatRp.setMonetaryDecimalSeparator(',');
		formatRp.setGroupingSeparator('.');
		
		kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
		kursIndonesia.setDecimalFormatSymbols(formatRp);
		
		displayStaffInfo();
		System.out.println("Income Karyawan: " + kursIndonesia.format(income.getAmount()));
		System.out.println("Income Type: " + income.getIncomeType());
		System.out.println("Pajak: " + income.getTax() + "%");
		System.out.println("Pajak yang harus dibayar: " + kursIndonesia.format(income.getTotalTax()));
		System.out.println("Income Bersih: " + kursIndonesia.format(calculateNetIncome()));
	}
}
