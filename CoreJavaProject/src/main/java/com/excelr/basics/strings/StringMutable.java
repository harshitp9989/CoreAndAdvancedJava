package com.excelr.basics.strings;

public class StringMutable {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("Student");
		StringBuilder sb2 = new StringBuilder("Teacher");
		
		StringMutable obj = new StringMutable();
		obj.displayStringBuffer(sb1);
		obj.displayStringBuilder(sb2);
	}
	
	private void displayStringBuffer(StringBuffer sb1)
	{
		System.out.println(sb1.append("Is learning java"));
	}
	
	private void displayStringBuilder(StringBuilder sb2)
	{
		System.out.println(sb2.append("is teaching java..."));
	}
	
}
