package com.corejavaprojects.basics.generics.boundedtype;

public class BoundedGenericsExample {

	public static void main(String[] args) {
		Box<Integer> intBox = new Box<>(10);
		intBox.display();
		 
		Box<Double> doubleBox = new Box<>(3.14);
		doubleBox.display();
	}
}
