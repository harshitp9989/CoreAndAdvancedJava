package com.excelr.basics.innerClass;

public class LocalInnerClass {
	private int outerVar = 10;
	
	public void print()
	{
		class Inner{
			private int innerVar =20;
			
			public void print()
			{
				System.out.println("Outer variable: "+ outerVar);
				System.out.println("Inner variable: "+ innerVar);
			}
		}
		
		Inner inner = new Inner();
		
		inner.print();
	}
	
	public static void main(String[] args) {
		LocalInnerClass outer = new LocalInnerClass();
		outer.print();
	}
}
