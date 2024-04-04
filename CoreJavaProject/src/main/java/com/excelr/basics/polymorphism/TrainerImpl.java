package com.excelr.basics.polymorphism;

public class TrainerImpl implements ITrainer{

	@Override
	public void trains(Animal aa) {
		// TODO Auto-generated method stub
		System.out.println("Trainer trained the animal to move");
		aa.move();
	}
}
