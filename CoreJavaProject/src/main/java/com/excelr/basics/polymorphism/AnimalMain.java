package com.excelr.basics.polymorphism;

public class AnimalMain {

	public static void main(String[] args) {
		Animal bowbow = new Dog();
		Animal busbus = new Snake();
		Animal shhshh = new Fish();
		
		ITrainer Harshit = new TrainerImpl();
		Harshit.trains(shhshh);
		Harshit.trains(busbus);
		Harshit.trains(bowbow);
	}
}
