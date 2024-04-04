package com.excelr.basics.recursion;

public class Power {

	static int i=0;
	public static void main(String[] args) {
	
		int yoyo = 	basePow(2,4);
		System.out.println(yoyo);
		System.out.println(i);
	}
	
	public static int basePow(int b, int p)
	{
		while(p>0)
		{
			i++;
			return b*basePow(b,p-1);
		}
		return(1);
		
	}
}
