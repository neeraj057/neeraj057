package com.thread;

public class MainThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task t=new Task();
		
		ThreadOne one=new ThreadOne(t);
		Thread two =new ThreadTwo(t);
		
		one.start();
		one.setName("Thread-1");
		two.start();
		two.setName("Thread-2");
	}

}
