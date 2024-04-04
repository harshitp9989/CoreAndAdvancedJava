package com.excelr.basics.String;

public class StringCreation {

	public static void main(String[] args) {
		
		String str1 = "Hello, World";
		
		String str2 = new String("Java Programming");
		
		char[] charArray = {'H','E','L','L','O'};
		String str3 = new String(charArray);
		
		byte[] byteArray = {65,66,67,68};
		String str4 = new String(byteArray);
		
		String firstName = "John";
		String lastName = "Doe";
		String fullName = firstName + " " + lastName;
		
		long age = 30;
		double height = 5.9;
		String formatted = String.format("Age: %d, Height: %f",age,height);
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(fullName);
		System.out.println(formatted);
		
		
		
	}
	

}
