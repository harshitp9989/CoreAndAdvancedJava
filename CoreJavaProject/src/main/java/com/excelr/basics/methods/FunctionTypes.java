package com.excelr.basics.methods;

public class FunctionTypes {

	public void fun1()
	{
		System.out.println("Non Static - non Parametrized No Return Type");
	}
	
	public void fun2(String varr)
	{
		System.out.println("Non Static - Parametrized No Return Type"+" "+varr);
	}
	
	public int fun3()
	{
		System.out.println("Non static - non Parametrized Return Type");
		return (100);
	}
	
	public static void main(String[] args) {
		FunctionTypes obj = new FunctionTypes();
		obj.fun1();
		obj.fun2("Excelr");
		int result = obj.fun3();
		System.out.println("The result is "+result);
		
	}
	
}
