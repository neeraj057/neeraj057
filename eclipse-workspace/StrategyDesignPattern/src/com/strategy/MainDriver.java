package com.strategy;

public class MainDriver {

	public static void main(String [] args) {
		
		
		//Addition
		Context context =new Context(new Addtion());
		System.out.println("Addition of Two Number= "+context.operation(10, 10));
		
		//Multiplication
		Context m =new Context(new Multiplication());
		System.out.println("Multiplication of Two Number= "+m.operation(2, 2));
		
		
		//Subtraction
		Context s= new Context(new Subtraction());
		System.out.println("Subtraction of Two Number= "+s.operation(50, 25));
		
		
	}
}
