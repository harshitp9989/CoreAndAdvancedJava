package com.corejavaprojects.basics.generics.uppervslowerbounds;

import java.util.ArrayList;
import java.util.List;

import org.openxmlformats.schemas.spreadsheetml.x2006.main.STSourceType;

class Fruit {
	public void showInfo() {
		System.out.println("This is fruit");
	}
}

class Apple extends Fruit {
	@Override
	public void showInfo() {
		System.out.println("This is an apple");
	}
}

class Orange extends Fruit{
	@Override
	public void showInfo()
	{
		System.out.println("This is an orange");
	}
}

public class UpperVsLowerBoundMain {

	public static void printFruits(List<? extends Fruit> fruits)
	{
		for(Fruit fruit : fruits)
		{
			fruit.showInfo();
		}
	}
	
	public static void addApple(List<? super Apple> apples)
	{
		apples.add(new Apple());
		System.out.println("Added in apple");
	}
	
	public static void main(String[] args) {
		List<Apple> appleList = new ArrayList<>();
		appleList.add(new Apple());
		
		List<Orange> orangeList = new ArrayList<>();
		orangeList.add(new Orange());
		
		List<Fruit> fruitList = new ArrayList<>();
		fruitList.add(new Fruit());
		
		System.out.println("Printing fruits using upper bound:");
		printFruits(appleList);
		printFruits(orangeList);
		printFruits(fruitList);
		
		List<Fruit> mixedFruits = new ArrayList<>();
		mixedFruits.add(new Fruit());
		
		System.out.println("\nAdding an apple using lower bound");
		addApple(mixedFruits);
		for(Object fruit: mixedFruits)
		{
			((Fruit)fruit).showInfo();
		}
	}
}
