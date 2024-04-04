package com.excelr.basics.strings;

public class StringImmutabilityDemo {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = str1;

		System.out.println("Before modification");

		System.out.println("string 1 str1: " + str1);
		System.out.println("string2 str2: " + str2);

		str1 = str1 + "World";

		System.out.println("After modification");

		System.out.println("string 1 str1: " + str1);
		System.out.println("string2 str2: " + str2);

	}
}
