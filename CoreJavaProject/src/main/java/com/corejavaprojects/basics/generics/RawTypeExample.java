package com.corejavaprojects.basics.generics;

class Box<T> {
	private T value;
	
	public Box(T value)
	{
		this.value = value;
	}
	
	public T getValue()
	{
		return value;
	}
}

public class RawTypeExample {

	public static void main(String[] args) {
		Box box1 = new Box("Hello");
		System.out.println("Raw Value: "+ box1);
		
		Object value = box1.getValue();
		System.out.println("Value: "+ value);
		
		String stringValue = (String)box1.getValue();
		System.out.println("String Value: "+stringValue);
		
	}
}
