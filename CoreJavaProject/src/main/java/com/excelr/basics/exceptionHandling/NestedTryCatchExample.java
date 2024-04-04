package com.excelr.basics.exceptionHandling;

public class NestedTryCatchExample {
	public static void main(String[] args) {
		try {
			String str1 = "Hello";
			String str2 = null;
			
			int length = str2.length();
			System.out.println("Length of str2"+ length);
		}catch(NullPointerException e)
	{
			System.out.println("Error: The string is null");
	}
		try {
			String str3 = "123";
			int num = Integer.parseInt(str3);
			System.out.println("Parsed integer value"+ num);
		}catch(NumberFormatException e2)
		{
			System.out.println("Finally block executed.");
		}finally {
			System.out.println("Finally block executed");
		}
		
		System.out.println("Outside try-catch block");
		
	}
	}


