package com.thread;

public class Task {

	public void print(int n) {
		synchronized (this) {
			String name=Thread.currentThread().getName();
			for (int i = 1; i <= 10; i++) {
				System.out.println(name+" "+ n * i);
			}
		}
	}
}
