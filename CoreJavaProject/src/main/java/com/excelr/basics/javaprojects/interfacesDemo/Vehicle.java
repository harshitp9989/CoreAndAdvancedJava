package com.excelr.basics.javaprojects.interfacesDemo;

public interface Vehicle {
	public void engine();
	public default void drivers()
	{
		System.out.println("Displaying driver details...");
	}
	
	public static void battery()
	{
		System.out.println("Displaying battery details...");
	}
}
