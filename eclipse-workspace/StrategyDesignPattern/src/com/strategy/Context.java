package com.strategy;

public class Context {
	StrategyInterface strategy;

	public Context(StrategyInterface strategy) {
		super();
		this.strategy = strategy;
	}
	
	public int operation(int num1,int num2) {
		return strategy.action(num1,num2);
	}
}
