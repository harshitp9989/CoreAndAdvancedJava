package com.excelr.basics.java8.functionalinterface.basics;

@FunctionalInterface
interface ArithmeticOperation{
	int operate(int a, int b);
	
	default int add(int a, int b)
	{
		return a+b;
	}
	
	static int subtract(int a, int b)
	{
		return a-b;
	}
}


public class InterviewQuestion {
public static void main(String[] args) {
	ArithmeticOperation addition = (a,b) -> a+b;
	System.out.println("Addition: " + addition.operate(10, 5));
	
	System.out.println("Default Method (Add): " + addition.add(23, 12));
	
	System.out.println("Static Method(Subtract): "+ ArithmeticOperation.subtract(12, 2));
}
}
