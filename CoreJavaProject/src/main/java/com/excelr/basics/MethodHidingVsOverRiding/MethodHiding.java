package com.excelr.basics.MethodHidingVsOverRiding;



class Parent1{
	public static void vehicle()
	{
		System.out.println("Bike");
	}
}

class Child1 extends Parent1{
	public static void vehicle()
	{
		System.out.println("Car");
	}
}

public class MethodHiding{
	public static void main(String[] args) {
		Parent1 pp = new Parent1();
		pp.vehicle();
		
		Parent1.vehicle();
		
		Child1 cc = new Child1();
		cc.vehicle();
		
		Child1.vehicle();
		
		Parent1 pc = new Child1();
		pc.vehicle();
	}
}

