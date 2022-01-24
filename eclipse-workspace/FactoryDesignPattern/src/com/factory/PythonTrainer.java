package com.factory;

public class PythonTrainer implements Trainer {
	private static int bonous=14000;
	private String name;
	private int salary;
	
	
	public PythonTrainer(String name, int salary) {
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
		return "PythonTrainer [name=" + name + ", salary=" + salary + "]";
	}
	
	

}
