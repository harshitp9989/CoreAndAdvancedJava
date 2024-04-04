package com.excelr.basics.exceptionHandling;

public class SimpleThrowsErrorExample {

	public static void main(String[] args)
	{
		try {
			doSomething();
		}
		catch(Error e){
			System.out.println("Caught error"+e.getMessage());
		}
	}
	
	public static void doSomething() throws VirtualMachineError{
		throw new OutOfMemoryError(" Baaaam Crash");
	}
}
