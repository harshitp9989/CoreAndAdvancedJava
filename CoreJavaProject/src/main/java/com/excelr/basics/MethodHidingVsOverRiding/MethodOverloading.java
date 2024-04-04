package com.excelr.basics.MethodHidingVsOverRiding;

class Parent{
	public void vehicle()
	{
		System.out.println("Bike");
	}
}

class Child extends Parent{
	@Override
	public void vehicle()
	{
		System.out.println("Car");
	}
}

public class MethodOverloading{
	public static void main(String[] args) {
		Parent pp = new Parent();
		pp.vehicle();
		
		Child cc = new Child();
		cc.vehicle();
		
		Parent pc = new Child();
		pc.vehicle();
	}
}



