package com.car;

public class Driver {
	private int licenceNo;
	private String driverName;
	public Driver() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Driver(int licenceNo, String driverName) {
		super();
		this.licenceNo = licenceNo;
		this.driverName = driverName;
	}
	public Driver(int licenceNo) {
		super();
		this.licenceNo = licenceNo;
	}
	@Override
	public String toString() {
		return "Driver [licenceNo=" + licenceNo + ", driverName=" + driverName + "]";
	}
	
}
