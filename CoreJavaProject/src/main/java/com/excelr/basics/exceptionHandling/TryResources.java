package com.excelr.basics.exceptionHandling;

import java.util.Scanner;

public class TryResources {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in))
		{
			System.out.println("Enter a long value");
			long longValue = sc.nextLong();
			System.out.println("Long Value:"+ longValue);
		}
		catch(Exception e)
		{
			System.out.println("Invalid input or error occured: "+e.getMessage());
		}
	}
}
