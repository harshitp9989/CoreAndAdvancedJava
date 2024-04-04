package com.excelr.basics.String;

public class StringDemo {

	public static void main(String[] args) {
		String str1 ="Hello";
		String str2 = "World!";
		String text = "  Hello World!    ";
		
		String result = str1 + str2;
		System.out.println(result);
		
		
		int length = result.length();
		System.out.println("Length: "+length);
		
		char firstChar = result.charAt(0);
		char lastChar = result.charAt(result.length()-1);
		
		System.out.println("FirstChar : "+ firstChar);
		System.out.println("LastChar : "+ lastChar);

		String substring = result.substring(7,9);
		System.out.println("Substring: "+ substring);
		
		int index = result.indexOf(",");
		System.out.println("Index of , is :"+ index);
		
		String upperCase = result.toUpperCase();
		String lowerCase = result.toLowerCase();
		System.out.println("Uppercase"+upperCase);
		System.out.println("Lowercase"+lowerCase);

		boolean equal = str1.equals(str2);
		boolean ignoreCase = str1.equalsIgnoreCase(str2);
		System.out.println("Equal"+ equal+ ", Ignore case"+ ignoreCase);
		
		System.out.println("--------");
		String trimmed = text.trim();
		System.out.println("Trimmed :"+ trimmed);
		boolean startsWithHello = text.startsWith("Hello");
		boolean endsWithcomma = text.endsWith("World");
		
		System.out.println(startsWithHello);
		System.out.println(endsWithcomma);
	}
}
