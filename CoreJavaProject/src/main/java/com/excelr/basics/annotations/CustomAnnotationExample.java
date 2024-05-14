package com.excelr.basics.annotations;


import java.lang.annotation.*;

//Define custom annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface CustomAnnotation{
	String Value();
}

class MyClass{
	@CustomAnnotation(Value = "Hello, Custom Annotation")
	public void annotatedMethod()
	{
		System.out.println("Inside annotatedMethod()");
	}
}

public class CustomAnnotationExample {

	public static void main(String[] args)
	{
		MyClass myClass = new MyClass();
		
		//Call the annotated method
		myClass.annotatedMethod();
	}
}
