package com.excelr.basics.fileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelLaptopDetails {

	private static final String FILE_NAME = "laptop.xlsx";
	private static final String SHEET_NAME = "LaptopSheet";

	public static void main(String[] args) {
		try {
			// Writing data to Excel file
			writeDataToExcel();

			// Reading data from Excel file
			readDataFromExcel();

		} catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
		}
	}

	// Method to write data to Excel
	private static void writeDataToExcel() {
		try (Workbook workbook = new XSSFWorkbook(); FileOutputStream fileOut = new FileOutputStream(FILE_NAME)) {

			Sheet sheet = workbook.createSheet(SHEET_NAME);

			// Set column titles
			Row titleRow = sheet.createRow(0);
			titleRow.createCell(0).setCellValue("Laptop Name");
			titleRow.createCell(1).setCellValue("Processor");
			titleRow.createCell(2).setCellValue("RAM");
			titleRow.createCell(3).setCellValue("Storage");
			titleRow.createCell(4).setCellValue("Price");

			// Prompt user for data
			Scanner scanner = new Scanner(System.in);

			for (int i = 0; i < 2; i++) {
				System.out.println("Enter details for Laptop " + (i + 1) + ":");

				System.out.print("Enter Laptop Name: ");
				String laptopName = scanner.nextLine();

				System.out.print("Enter Processor: ");
				String processor = scanner.nextLine();

				System.out.print("Enter RAM: ");
				String ram = scanner.nextLine();

				System.out.print("Enter Storage: ");
				String storage = scanner.nextLine();

				System.out.print("Enter Price: ");
				String price = scanner.nextLine();

				Row row = sheet.createRow(i + 1); // Starting from the second row for data
				row.createCell(0).setCellValue(laptopName);
				row.createCell(1).setCellValue(processor);
				row.createCell(2).setCellValue(ram);
				row.createCell(3).setCellValue(storage);
				row.createCell(4).setCellValue(price);
			}

			workbook.write(fileOut);
			System.out.println("Laptop details written to Excel successfully.");

		} catch (Exception e) {
			System.err.println("Error writing data to Excel: " + e.getMessage());
		}
	}

	// Method to read data from Excel
	private static void readDataFromExcel() {
		try (Workbook workbook = new XSSFWorkbook(new FileInputStream(FILE_NAME))) {

			Sheet sheet = workbook.getSheet(SHEET_NAME);

			System.out.println("\nReading data from Excel:");

			for (Row row : sheet) {
				Cell laptopNameCell = row.getCell(0);
				Cell processorCell = row.getCell(1);
				Cell ramCell = row.getCell(2);
				Cell storageCell = row.getCell(3);
				Cell priceCell = row.getCell(4);

				String laptopName = laptopNameCell.getStringCellValue();
				String processor = processorCell.getStringCellValue();
				String ram = ramCell.getStringCellValue();
				String storage = storageCell.getStringCellValue();
				String price = priceCell.getStringCellValue();

				System.out.println("Laptop Name: " + laptopName + ", Processor: " + processor + ", RAM: " + ram
						+ ", Storage: " + storage + ", Price: " + price);
			}

		} catch (Exception e) {
			System.err.println("Error reading data from Excel: " + e.getMessage());
		}
	}
}

/*
 * Notes: - The program allows the user to enter details for two laptops, writes
 * the data to an Excel file, and then reads and prints the data. - The Excel
 * file is created in the project directory with the name "Laptops.xlsx" and
 * contains a sheet named "LaptopSheet". - The program uses the Apache POI
 * library to handle Excel operations.
 */
