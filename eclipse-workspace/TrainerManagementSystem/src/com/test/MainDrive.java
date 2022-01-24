package com.test;

public class MainDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		TrainerInterface j= new JavaTrainer(1,"J1",9);
//		j.checkEligible();
//		TrainerInterface d =new DotNetTrainer(2,"D",10);
//		d.checkEligible();
//		TrainerInterface p =new PythonTrainer(3,"P",13);
//		p.checkEligible();
	
		check();
	}
	
	public static void check() {
		System.out.println("i am inside");
		System.exit(5);
		System.out.println("after exit");
		int x=10;
		
		try {
			int z=x/0;
		}
		catch(NullPointerException e) {
			System.out.println("exception");
		}
	}

}


