package com.excelr.basics.java8.functionalinterface.basics;

public class MyFunctionalMain {
	public static void main(String[] args) {
		MyFunctionalInterface lamda = () -> {
			System.out.println("Lamda running");
			System.out.println("Performing some operations.....");
		};
		lamda.execute();
	}
}
