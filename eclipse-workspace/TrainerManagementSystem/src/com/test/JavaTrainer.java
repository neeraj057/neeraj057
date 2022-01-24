package com.test;

 class JavaTrainer implements TrainerInterface {
	 
	 private int id;
	 private String name;
	 private int exp;
	 
	 

	public JavaTrainer(int id, String name, int exp) {
		super();
		this.id = id;
		this.name = name;
		this.exp = exp;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getExp() {
		return exp;
	}


	public void setExp(int exp) {
		this.exp = exp;
	}


	@Override
	public void checkEligible() {
		// TODO Auto-generated method stub
		if(this.getExp()>=TrainerInterface.exp) {
		System.out.println("I am java Trainer");
		}else {
			System.out.println("Opps You are not Eligible");
		}
	}

}
