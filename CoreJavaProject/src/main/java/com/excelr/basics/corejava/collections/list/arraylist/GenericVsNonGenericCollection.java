package com.excelr.basics.corejava.collections.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class GenericVsNonGenericCollection {

	public static void main(String[] args) {
		List nonGenericList = new ArrayList();
		nonGenericList.add(1);
		nonGenericList.add("Hello");
		nonGenericList.add(3.14);
		
		System.out.println("Non generic list:");
		for(Object obj:nonGenericList)
		{
			System.out.println(obj);
		}
	}
}
 