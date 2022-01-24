package com.strategy;

public class Multiplication implements StrategyInterface {

	@Override
	public int action(int num1, int num2) {
		return num1*num2;
	}

}
