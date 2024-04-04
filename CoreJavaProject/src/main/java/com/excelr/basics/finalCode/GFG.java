package com.excelr.basics.finalCode;

//Java Program to demonstrate Different
//Ways of Initializing a final Variable

//Main class 
public class GFG {

	// a final variable
	// direct initialize
	final int THRESHOLD = 5;
	
	// a blank final variable
	final int CAPACITY;
	
	// another blank final variable
	final int MINIMUM;
	
	// a final static variable PI
	// direct initialize
	static final double PI = 3.141592653589793;
	
	// a blank final static variable
	static final double EULERCONSTANT;
	
	// instance initializer block for 
	// initializing CAPACITY
	{
		CAPACITY = 25;
	}
	
	// static initializer block for 
	// initializing EULERCONSTANT
	static{
		EULERCONSTANT = 2.3;
	}
	
	// constructor for initializing MINIMUM
	// Note that if there are more than one
	// constructor, you must initialize MINIMUM
	// in them also
	public GFG() 
	{
		MINIMUM = -1;
	}
	
	public static void main(String[] args) {
		GFG obj = new GFG();
		System.out.println(obj.THRESHOLD);
		System.out.println(obj.CAPACITY);
		System.out.println(obj.MINIMUM);
		System.out.println(PI);
		System.out.println(EULERCONSTANT);
		}
		
}

