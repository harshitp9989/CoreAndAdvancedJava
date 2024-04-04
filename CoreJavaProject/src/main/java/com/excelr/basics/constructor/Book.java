//package com.excelr.basics.constructor;
//
//public class Book {
//	private String title;
//	private String author;
//	private int publicationYear;
//	
//	//constructor1: Default const
//	public Book()
//	{
//		this("Unknown Title","Unknown Author",2022);
//	}
//	
////	Constructor2: Parameterised const
//	public Book(String title, String author, int publicationYear)
//	{
////		setting instance variables using this
//		this.title=title;
//		this.author=author;
//		this.publicationYear=publicationYear;
//	}
//	
////	Method to set title 
//	public void setTitle(String title)
//	{
//		this.title=title;
//	}
//	
////	Method to set author without "this"
//	public void setAuthor(String author)
//	{
//		this.author=author;
//	}
//	
////	Method to set publication year without "this"
//	public void setPublicationYear(String publicationYear)
//	{
//		this.publicationYear=publicationYear;
//	}	
//	
////	Method to get title
//	public String getTitle()
//	{
//		return title;
//	}
////	Method to get author
//	public String getAuthor()
//	{
//		return author;
//	}
//	
////	Method to get publication year
//	public String getPublicationYear()
//	{
//		return PublicationYear;
//	}
//	
////	Method to display book information
//	public void displayInfo()
//	{
//		System.out.println("Title:"+this.title+",Author:"+this.author+",PublicationYear:"+this.publicationYear);
//	}
//	
//	public static void main(String[] args) {
//		Book book1 = new Book();
//		Book book2 = new Book("Java Programming","JohnSmith",2020);
//	}
//	
//	//Display information
//	
//}
