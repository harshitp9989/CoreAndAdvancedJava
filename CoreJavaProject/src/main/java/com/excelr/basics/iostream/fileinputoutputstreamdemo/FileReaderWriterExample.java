package com.excelr.basics.iostream.fileinputoutputstreamdemo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterExample {

	public static void main(String[] args) {
		String targetFile = "ReaderWriterExample.txt";
		
		try(FileWriter writer = new FileWriter(targetFile))
		{
			String data = "Hello, How are youuuuuuuuuu....";
			writer.write(data);
			System.out.println("Target file created");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		
		
		try(FileReader reader = new FileReader(targetFile))
		{
			int character;
			System.out.println("Data read from target file");
			while((character = reader.read())!= -1)
			{
				System.out.print((char)character);
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		
	}
}