package com.excelr.basics.iostream.fileinputoutputstreamdemo;
//This is the most important example
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderWriterExample {

	public static void main(String[] args) {
		String sourceFileName = "D:\\Excelr\\Workspace1\\coreJavaProject\\src\\com\\excelr\\basics\\iostream\\fileinputoutputstreamdemo\\hello.txt";
		String targetFileName = "D:\\Excelr\\Workspace1\\coreJavaProject\\src\\com\\excelr\\basics\\iostream\\fileinputoutputstreamdemo\\hello.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileName)))
		{
			String dataToWrite = "Hello Hw r you?";
			bw.write(dataToWrite);
			System.out.println("Data written to the file using BufferWriter successfully");
		}
		catch(IOException e)
		{
			System.out.println("Error writing to the file using BufferWriter"+e.getMessage());
		}
		
		try(BufferedReader br = new BufferedReader(new FileReader(sourceFileName)))
		{
			String line;
			
			System.out.println("Data read from the file using BufferedReader");
			while((line=br.readLine())!=null)
			{
				System.out.println(line);
			}
		}catch(IOException e)
		{
			System.out.println("Error reading from the file using BufferedReader:" + e.getMessage());
		}
	}
}
