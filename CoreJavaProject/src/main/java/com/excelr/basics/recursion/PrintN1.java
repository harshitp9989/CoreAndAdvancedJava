package com.excelr.basics.recursion;

import java.util.Scanner;

public class PrintN1 {

	private static void PrintNto1(int n)
	{
		if(n==1)
		{
			System.out.println(1);
			return ;
		}
		else
		{
			System.out.println(n);
			PrintNto1(n-1);	
		}
		
	}
	
	public static void main(String[] args) {
	
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter n");
			int n = sc.nextInt();
			PrintNto1(n);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
