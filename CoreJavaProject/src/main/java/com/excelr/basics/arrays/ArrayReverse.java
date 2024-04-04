package com.excelr.basics.arrays;
import java.util.Arrays;
public class ArrayReverse {

	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5};
		int start = 0;
		int end = numbers.length -1;
		
		System.out.println("Original array:"+ Arrays.toString(numbers));
		
		while(start<end)
		{
			int temp = numbers[start];
			numbers[start]= numbers[end];
			numbers[end] = temp;
			
			start++;
			end--;
		} 
		
		
		System.out.println("Original array:"+ Arrays.toString(numbers));
	}
}
