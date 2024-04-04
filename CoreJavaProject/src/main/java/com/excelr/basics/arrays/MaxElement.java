package com.excelr.basics.arrays;

public class MaxElement {
	public static void main(String[] args) {
		int[] numbers = {10,20,30,40,20,50,20};
		int max;
		max = numbers[0];
		
		for(int i = 0; i< numbers.length-1;i++)
		{
			if (numbers[i]>max)
			{
				max = numbers[i];
			}
		}
		
		System.out.println(max);
	}
}
