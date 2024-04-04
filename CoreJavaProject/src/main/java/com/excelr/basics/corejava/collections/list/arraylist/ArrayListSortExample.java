package com.excelr.basics.corejava.collections.list.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSortExample {

	public static void main(String[] args) {
		ArrayList<Integer> bobo = new ArrayList<>();

		for(int i=10; i>0;i--)
		{
			bobo.add(i);
		}
		
		System.out.println(bobo);
		
		Collections.sort(bobo);
		
		System.out.println(bobo);
			
	}
}
