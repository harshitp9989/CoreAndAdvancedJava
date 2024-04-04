package com.excelr.basics.exceptionHandling;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {

		Example1 obj = new Example1();
		System.out.println("++++++++++Exception Handling using throw and throws demo+++++++++++");

		System.out.println("Enter 1st number");
		int firstNumber = obj.getUserInput();

		System.out.println("Enter 2nd number");
		int secondNumber = obj.getUserInput();

		try {
			System.out.println("Division using throws kewword demo: " + obj.divisionWithThrow(firstNumber, secondNumber));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			System.out.println(
					"Division using throws kewword demo: " + obj.divisionWithThrowsKeyword(firstNumber, secondNumber));
		} catch (ApllicationException e) {
			e.printStackTrace();
		}
	}

	private int divisionWithThrowsKeyword(int firstNumber, int secondNumber) throws ApllicationException {
		int result = 0;
		if (secondNumber == 0) {
			throw new ApllicationException(" Fool! you are dividing by 0!!!");
		} else {
			result = firstNumber / secondNumber;
		}
		return result;
	}

	private int divisionWithThrow(int firstNumber, int secondNumber)  throws Exception{
		int result = 0;
		try {
			if (secondNumber == 0) {
				throw new ApllicationException(" Fool! you are dividing by 0!!!");
			} else {
				result = firstNumber / secondNumber;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		return result;
	}

	private int getUserInput() {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
}
