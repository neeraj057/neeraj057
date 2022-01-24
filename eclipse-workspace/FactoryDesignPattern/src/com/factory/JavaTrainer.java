package com.factory;

public class JavaTrainer implements Trainer{
	private static int bonous=12000;
	private String name;
	private int salary;
	
	

	public JavaTrainer(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}



	@Override
	public void addBonous() {
		this.salary=this.salary+bonous;
	}



	@Override
	public String toString() {
		return "JavaTrainer [name=" + name + ", salary=" + salary + "]";
	}
	
		
}
