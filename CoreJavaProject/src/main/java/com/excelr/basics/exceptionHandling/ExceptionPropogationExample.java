package com.excelr.basics.exceptionHandling;

public class ExceptionPropogationExample {

	public void methodA()
	{
		System.out.println("Inside A before B");
		methodB();
		System.out.println("Inside A after B");

	}
	
	public void methodB()
	{
		System.out.println("Inside B before C");
		methodC();
		System.out.println("Inside B after C");

	}
	
	public void methodC()
	{
		System.out.println("Inside C before EXCEPTIONNNNNN");
		int result = 10/0;
		System.out.println("Inside C after EXCEPTIONNNNNN");

	}
	
	public static void main(String[] args) {
		ExceptionPropogationExample example = new ExceptionPropogationExample();
		
		try {
			example.methodA();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Caught arithmetic exception"+ e.getMessage());
		}
		finally
		{
			System.out.println("finallyyyyyyyyy");
		}
		
		System.out.println("outside method a ");
	}
}
