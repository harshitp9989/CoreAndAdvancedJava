package com.excelr.basics.methods;

public class Methods {

	public static void iceCream()
	{
		System.out.println("Icecream");
		chocolate();
		Methods obj = new Methods(); // Create an instance of the Methods class
		obj.pulihora(); // Call the non-static method pulihora() using the instance
	}
	
	public static void chocolate()
	{
		System.out.println("Chocolate");
	}
	
	public void pulihora()
	{
		System.out.println("I like Pulihora");
		dosa();
		Methods.chocolate();
	}
	
	public void dosa()
	{
		System.out.println("I like dosa");
	}
	
	public static void main(String[] args) {
		{
			Methods obj1 = new Methods();
			iceCream();
			System.out.println("-----------------");
			chocolate();
			System.out.println("-----------------");
			obj1.pulihora();
			System.out.println("-----------------");
			obj1.dosa();
			System.out.println("-----------------");
			
		}
	}
}
