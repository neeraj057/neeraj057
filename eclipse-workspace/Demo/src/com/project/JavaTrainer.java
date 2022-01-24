package com.project;

public class JavaTrainer extends Trainer {

	private int bonous=12000;
	public JavaTrainer(int id, String trainerName,int salary) {
		super(id, trainerName, salary);
		
	}
	
	
	public int getBonous() {
		return bonous;
	}


	public void setBonous(int bonous) {
		this.bonous = bonous;
	}


	public void addBonous() {
		this.setSalary(bonous+super.getSalary());
	}


	@Override
	public String toString() {
		return (super.toString());
	}
	
	

}
