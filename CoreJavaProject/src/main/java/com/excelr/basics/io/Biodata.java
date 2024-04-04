package com.excelr.basics.io;
import java.util.Scanner;

public class Biodata {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.next();
		
		System.out.println("Enter your age");
		int age = sc.nextInt();
		
		System.out.println("Name:"+name+"\n"+"age:"+age);
		
		sc.close();

	}
	
}
