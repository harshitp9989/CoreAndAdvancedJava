package com.excelr.basics.innerClass;

import com.excelr.basics.innerClass.NonStaticInnerClass.InnerClass;

public class StaticInnerClass {
	private int outerVariable;
	private static int outerStaticVariable = 50;
	
	public StaticInnerClass(int outerVariable)
	{
		this.outerVariable = outerVariable;
	}
	
	
	public void outerMethod()
	{
		System.out.println("Inside outer method");
	}
	
	public static class InnerClass{
		private int innerVariable;
		
		public InnerClass(int innerVariable)
		{
			this.innerVariable = innerVariable;
		}
		
		public void innerMethod()
		{
			System.out.println("Inside InnerMethod");
						
			System.out.println("Static outer variable value: "+outerStaticVariable);
			

		}
	}
	
	public static void main(String[] args) {
				
		StaticInnerClass.InnerClass InnerObject = new StaticInnerClass.InnerClass(20);
		
		InnerObject.innerMethod();
	}
}
