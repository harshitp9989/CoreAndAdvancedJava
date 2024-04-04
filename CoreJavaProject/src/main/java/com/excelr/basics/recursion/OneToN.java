package com.excelr.basics.recursion;

import java.util.Scanner;

public class OneToN {

	private static int FinalRes(int n)
	{
		if(n==1)
		{
			return 1;
		}
		else
		{
			while(n>=1)
				return(n*FinalRes(n-1));
		}
		return -1;
		
	}
	
	public static void main(String[] args) {
	
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter n");
			int n = sc.nextInt();
			System.out.println(FinalRes(n));
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
