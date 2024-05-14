package com.excelr.basics.annotations;


class Parent{
	void display()
	{
		System.out.println("Inside Parent class");
	}
}

class Child extends Parent{
	
	@Override
	void display()
	{
		System.out.println("Inside Child class");
	}
	
	@Deprecated
	void oldMethod()
	{
		System.out.println("This method is depricated and should not be used");
	}
	
	@SuppressWarnings("Unchecked")
	void supressWarningExample()
	{
		java.util.List <String> myList = new java.util.ArrayList<>();
		
		myList.add("Item 1");
		myList.add("Item 2");
		
		System.out.println("List: "+myList);
	}
}

public class AnnotationExample {
	public static void main(String[] args) {
		Child child = new Child();
		
		child.display();
		
		child.oldMethod();
		
		child.supressWarningExample();
	}
}
