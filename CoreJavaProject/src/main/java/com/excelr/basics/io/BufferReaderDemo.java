package com.excelr.basics.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderDemo {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Name please...");
		String name= reader.readLine();
		
		System.out.println("Age please...");
		int age= Integer.parseInt(reader.readLine());
		
		System.out.println(name);
		System.out.println(age);
		
		reader.close();
	}
}
