package com.project;

public class Trainer {
	private int id;
	private String trainerName;
	private int salary;
	public Trainer(int id, String trainerName,int salary) {
		super();
		this.id = id;
		this.trainerName = trainerName;
		this.salary=salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTrainerName() {
		return trainerName;
	}
	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Trainer [id=" + id + ", trainerName=" + trainerName + ", salary=" + salary + "]";
	}
	
	
}
