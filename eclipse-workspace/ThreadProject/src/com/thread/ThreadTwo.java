package com.thread;

public class ThreadTwo extends Thread{
	Task t;
	
	public ThreadTwo(Task t) {
		super();
		this.t = t;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		t.print(4);
	}

}
