package com.excelr.basics.arrays;

public class ElementCount {

	public static void main(String[] args) {
		int[] numbers = {10,20,30,40,20,50,20};
		int target = 20;
		int count = 0;
		
		for(int i =0; i< numbers.length; i++)
		{
			if(numbers[i] == target)
			{
				count++;
			}
		}
		
		System.out.println("Occurences of element "+target+" is "+count+" times.");
			
	}
}
