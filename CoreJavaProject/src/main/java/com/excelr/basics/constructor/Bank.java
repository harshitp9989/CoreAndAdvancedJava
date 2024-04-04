package com.excelr.basics.constructor;

public class Bank {
	private static final String BankName = "HDFC BANK";
	private String IFSC;
	private String branch;
	
	public Bank(String IFSC, String branch)
	{
		IFSC = IFSC;
		this.branch = branch;
		
	}

	public static void main(String[] args) {
		Bank bank1 = new Bank("123456", "Gajuwaka");
		Bank bank2 = new Bank("999999", "Heaven");
		
		System.out.println(bank1.BankName);
		System.out.println(bank1.IFSC);
		System.out.println(bank1.branch);
		
		System.out.println(bank2.BankName);
		System.out.println(bank2.IFSC);
		System.out.println(bank2.branch);
	}
	
	
}
