package com.thread;

public class ThreadOne extends Thread{
	Task t;
	
	public ThreadOne(Task t) {
		super();
		this.t = t;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		t.print(3);
	}

}
