package com.car;

public class Car {
	private int carId;
	private String carName;
	private Driver driver;
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(int carId, String carName, Driver driver) {
		super();
		this.carId = carId;
		this.carName = carName;
		this.driver = driver;
	}
	public Car(int carId, String carName) {
		super();
		this.carId = carId;
		this.carName = carName;
	}
	@Override
	public String toString() {
		return "Car [carId=" + carId + ", carName=" + carName + ", driver=" + driver + "]";
	}
	
	
}
