package com.excelr.basics.innerClass;

public class NonStaticInnerClass {
	private int outerVariable;
	private static int outerStaticVariable = 50;
	
	public NonStaticInnerClass(int outerVariable)
	{
		this.outerVariable = outerVariable;
	}
	
	
	public void outerMethod()
	{
		System.out.println("Inside outer method");
	}
	
	public class InnerClass{
		private int innerVariable;
		
		public InnerClass(int innerVariable)
		{
			this.innerVariable = innerVariable;
		}
		
		public void innerMethod()
		{
			System.out.println("Inside InnerMethod");
			
			System.out.println("Outer variable value: "+outerVariable);
			
			System.out.println("Static outer variable value: "+outerStaticVariable);
			
			outerMethod();
		}
	}
	
	public static void main(String[] args) {
		
		NonStaticInnerClass outerObject = new NonStaticInnerClass(10);
		
		NonStaticInnerClass.InnerClass InnerObject = outerObject.new InnerClass(20);
		
		InnerObject.innerMethod();
	}
}
