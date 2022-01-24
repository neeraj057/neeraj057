package com.factory;

public class TrainerFactory {
		
	public static Trainer getTrainer(String language) {
		if(language.equalsIgnoreCase("java")){
			return new JavaTrainer("aman",10000);
		}else if(language.equalsIgnoreCase("dotnet")) {
			return new DotNetTrainer("snehal",18000);
		}else {
			return new PythonTrainer("karan",20000);
		}
	}
}
