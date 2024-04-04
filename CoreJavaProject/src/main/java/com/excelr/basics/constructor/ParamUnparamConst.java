package com.excelr.basics.constructor;

public class ParamUnparamConst {
	
//	ParamUnparamConst()
//	{
//		System.out.println("This is a unparametrised constructor");
//	}
//	
	ParamUnparamConst(int a)
	{
		System.out.println("This is a parametrised constructor and the parameter is "+a);
	}

	public static void main(String[] args) {
//		ParamUnparamConst obj1 = new ParamUnparamConst();
		ParamUnparamConst obj2 = new ParamUnparamConst(55);
	}
}
