package com.excelr.basics.datatypes;

public class FunctionDemo {
	String name = "Animal";
	 String friend1 = "Tommy";
	 static String friend2 = "Jerry";
	
	public void greet1()
	{
		String name = "Arjun Reddy";
		System.out.println("My name is "+ name );
	}
	
	public static void greet2()
	{
		String name = "Kabir Singh";
		System.out.println("My name is "+ name );
	}
	
	public static void main(String Args[]) 
	{
		FunctionDemo fd = new FunctionDemo();
		fd.greet1();
		greet2();
		System.out.println(fd.friend1);
		System.out.println(friend2);
		
	}
}
