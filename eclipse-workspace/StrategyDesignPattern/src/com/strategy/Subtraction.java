package com.strategy;

public class Subtraction implements StrategyInterface{

	@Override
	public int action(int num1, int num2) {
		
		if(num1>num2) {
			return num1-num2;
		}
		return num2-num1;
	}

}
