//package com.excelr.basics.iostream.fileinputoutputstreamdemo;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.util.Scanner;
//
//public class InputStreamMain {
//
//	public static void main(String[] args) {
//		
//		String output = "D:\\Excelr\\Workspace1\\coreJavaProject\\src\\com\\excelr\\basics\\iostream\\fileinputoutputstreamdemo\\hello.txt";
//		
//		InputStreamMain object = new InputStreamMain();
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Data to be stored in the file below");
//		
//		String data = sc.nextLine();
//		sc.close();
//		
//		object.writeDataToFile(output,data);
//		object.readDataFromFile(output);
//	}
//	
//	
//	private void writeDataToFile(String out, String data)
//	{
//		try(FileOutputStream fileOutputStream = new FileOutputStream(output))
//		{
//			System.out.println("\n converting string to byte[] and writing to File...");
//			
//			char c[] = data.toCharArray();
//			
//			for(int i=0;i<c.length;i++)
//			{
//				fileOutputStream.write(c[i]);
//			}
//			
//			System.out.println("Data saved successfully");
//		} 
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
//	}
//	
//	private void readDataFromFile(String data)
//	{
//		try(FileInputStream fileOutputStream = new FileInputStream(output))
//		{
//			System.out.println("\n reading data from File...");
//			
//			int ch;
//			while((ch = FileInputStream.read())!=-1)
//			{
//				System.out.println((char)ch);
//			}
//			
//		} 
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
//	}
//}
