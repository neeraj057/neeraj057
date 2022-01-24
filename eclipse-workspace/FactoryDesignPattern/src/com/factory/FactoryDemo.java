package com.factory;

public class FactoryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trainer java=TrainerFactory.getTrainer("java");
		java.addBonous();
		System.out.println(java);
		
		Trainer dotNet =TrainerFactory.getTrainer("dotnet");
		dotNet.addBonous();
		System.out.println(dotNet);
	}

}
