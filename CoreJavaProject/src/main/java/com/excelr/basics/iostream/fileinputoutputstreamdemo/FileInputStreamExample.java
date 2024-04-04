package com.excelr.basics.iostream.fileinputoutputstreamdemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamExample {

	public static void main(String[] args) {
		String targetFile = "target_Uday.txt";
		
		try(FileOutputStream fos = new FileOutputStream(targetFile))
		{
			String data = "Hello, get well soon....";
			fos.write(data.getBytes());
			System.out.println("Target file created");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		
		
		try(FileInputStream fis = new FileInputStream(targetFile))
		{
			int byteData;
			System.out.println("Data read from target file");
			while((byteData = fis.read())!= -1)
			{
				System.out.print((char)byteData);
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		
	}
}
