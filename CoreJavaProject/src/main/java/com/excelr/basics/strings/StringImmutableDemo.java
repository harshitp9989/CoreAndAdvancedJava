package com.excelr.basics.strings;

public class StringImmutableDemo {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = str1.concat("World");
		
		System.out.println("string 1 str1: "+ str1);
		System.out.println("string2 str2: "+str2);
		
		//reassigning
		str1="Goodbye";
		
		System.out.println("string 1 str1: "+ str1);
		System.out.println("string2 str2: "+str2);
		
	}
}
