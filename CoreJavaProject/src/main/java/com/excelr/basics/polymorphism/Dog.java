package com.excelr.basics.polymorphism;

public class Dog implements Animal{

	@Override
	public void move()
	{
		System.out.println("Dog runs");
	}
}
