package com.excelr.basics.java8.functionalinterface.basics;

interface FunctionalInterfaceWithoutAnnotation{
	double product(double num1, double num2);
}

public class FunctionalInterfaceWithoutAnnotationMain {

	public static void main(String[] args) {
		FunctionalInterfaceWithoutAnnotation lamda = (num1, num2) -> {
			return num1*num2;
		};
		double product = lamda.product(10.00, 20.00);
		System.out.println(product);
	}
}
