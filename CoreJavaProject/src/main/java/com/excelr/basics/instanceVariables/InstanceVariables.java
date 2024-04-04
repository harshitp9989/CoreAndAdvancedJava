package com.excelr.basics.instanceVariables;

public class InstanceVariables {

	int a = 100;
	
	void method1()
	{
		System.out.println(a);
		a++;
		System.out.println(a);
	}
	
	void method2()
	{
		System.out.println(a);
		a--;
		System.out.println(a);
	}
	
	public static void main(String[] args) {

		InstanceVariables iv = new InstanceVariables();
		iv.method1();
		iv.method2();
	}
}
