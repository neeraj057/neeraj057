package com.strategy;

public class Addtion implements StrategyInterface{

	@Override
	public int action(int num1,int num2) {
		return num1+num2;
	}

}
