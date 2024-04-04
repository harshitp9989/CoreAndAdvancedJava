package com.excelr.basics.recursion;

import java.util.Scanner;

public class Print1n {
	
	private static void Print1ton(int n)
	{
		if(n==1)
		{
			System.out.println(1);
			return;
		}
		Print1ton(n-1);
		System.out.println(n);
	}
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter n");
			int n = sc.nextInt();
			Print1ton(n);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
