package com.factory;

public class DotNetTrainer implements Trainer {
	private static int bonous=10000;
	private String name;
	private int salary;
	public DotNetTrainer(String name, int salary) {
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
		return "DotNetTrainer [name=" + name + ", salary=" + salary + "]";
	}
	
	
	
}
