package com.project;

public class PythonTrainer extends Trainer {
	private int bonous=10000;
	

	public PythonTrainer(int id, String trainerName,int salary) {
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
