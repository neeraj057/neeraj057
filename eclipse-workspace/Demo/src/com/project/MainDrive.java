package com.project;

public class MainDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			JavaTrainer t1=new JavaTrainer(101,"tushar",100000);
			PythonTrainer p1=new PythonTrainer(102,"Bhatt",150000);
			
			t1.addBonous();
			p1.addBonous();
			
			System.out.println(t1);
			System.out.println(p1);
	}

}
