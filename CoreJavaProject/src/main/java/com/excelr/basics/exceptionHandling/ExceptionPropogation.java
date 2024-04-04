package com.excelr.basics.exceptionHandling;

public class ExceptionPropogation {

	void m()
	{
		int data = 80/0;
	}
	
	void n()
	{
		m();
	}
	
	void p()
	{
		System.out.println("before try catch");
		try {
			n();
		}
		catch(Exception e){
			System.out.println("The exception is handled");
		}
		System.out.println("after try catch");
	}
	
	public static void main(String[] args) {
		ExceptionPropogation obj = new ExceptionPropogation();
		obj.p();
		System.out.println("Normal flow");
	}
}

