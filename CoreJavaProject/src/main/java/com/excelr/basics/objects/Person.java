package com.excelr.basics.objects;

public class Person {
	String name = "Harshit"; // non static/Instance/Object level variable
	static int age = 22; // static//class level variable

	public static void main(String[] args) {
		Person obj1 = new Person();
		System.out.println(obj1.name);
//		System.out.println(name);
		System.out.println(age);
		System.out.println(obj1.age);
		System.out.println(Person.age);

//		Invoking functions
		wish();
		obj1.wish();
		Person.wish();
		obj1.greet();

	}

//	 static function
	public static void wish() {
		System.out.println("Hello...");
	}

//	Non Static Function
	public void greet() {
		System.out.println("Ho Ho Ho...");
	}

}
