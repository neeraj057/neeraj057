package com.car;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver d1=new Driver(1001,"Mahesh");
		
		//without Driver
		Car c1=new Car(8490,"BMW");
		System.out.println(c1);
		
		//with Driver
		Car c2 = new Car(9067,"Maruti",d1);
		System.out.println(c2);
	}

}
