package com.example.account.java;


public class fixedaccount extends account {

	double Ammount;
	double cal1;
	double cal;
	public void calculate(){
		
		super.getDetail();
		cal1 = (1+ super.annual /super.numtime)*cal;
		cal=Math.exp(super.numtime*super.year);
		Ammount= super.principle*cal1;
		System.out.println(Ammount);
	}
	
}
