package com.excelr.basics.constructor;

public class ConstructorExample {
	int age;
	String name;
	
	public ConstructorExample(int age,String name)
	{
		this.age = age;
		this.name = name;
	}
	
	public void getDetails()
	{
		System.out.println("The value of age : "+ age);
		System.out.println("The value of name : "+ this.name);

	}

	public static void main(String[] args) {
		ConstructorExample ob = new ConstructorExample(32, "Henry");
		ob.getDetails();
	}
}
