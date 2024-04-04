
package com.excelr.basics.exceptionHandling;

	public class MultipleCatchWithBarExample {
		public static void main(String[] args) {
			String[] fruits = {"apple","banana","Orange"};
			int[] numbers = {10,20,30,40,50};
	 	
		
		try {
			System.out.println("Fruit: "+fruits[5]);
			System.out.println("Number: "+ numbers[10]);
		}catch(ArrayIndexOutOfBoundsException | NullPointerException e)
		{
			System.out.println("Array index out of bound:"+ e.getMessage());
		}finally
		{
			System.out.println("Finally block executedddddd");
		}
		
		System.out.println("Program continues after try catch...........");

	}
	}
