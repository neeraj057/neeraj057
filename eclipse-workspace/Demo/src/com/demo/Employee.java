package com.demo;

public class Employee {
	private int id;
	private String name;
	private Address address;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, Address address) {
		this(name);
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public Employee(String name) {
		
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
}
