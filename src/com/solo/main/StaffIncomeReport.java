package com.solo.main;

import java.util.Scanner;

import com.solo.main.income.Income;
import com.solo.main.staff.Staff;

public class StaffIncomeReport {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Masukkan nama karyawan: ");
		String name = in.nextLine();
		
		System.out.print("Masukkan ID karyawan: ");
		String id = in.nextLine();
		
		System.out.print("Tipe pendapatan karyawan: ");
		String incomeType = in.nextLine();
		
		System.out.print("Masukkan gaji karyawan: ");
		double amount = in.nextDouble();
		
		System.out.print("Masukkan pajak karyawan: ");
		double tax = in.nextDouble();
		
		System.out.println();
		
		Income pendapatan = new Income(incomeType, amount, tax);
		Staff karyawan = new Staff(name, id, pendapatan);
		
		karyawan.displayIncomeInfo();
	}
}
