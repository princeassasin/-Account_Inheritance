package com.example.account.java;

public class savingsacount extends account {

	double savingsammount;
	
	public void calculate() {
		super.getDetail();
		
		savingsammount = super.principle * super.annual * super.year;
		System.out.println(savingsammount);
	
	}

}
