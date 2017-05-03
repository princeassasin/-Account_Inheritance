package com.example.account.java;

import java.util.Scanner;


public class fixedaccount extends account {

	double Ammount;
	double cal1;
	double cal;
	int numtime;
	public void calculate(){
		Scanner sc = new Scanner(System.in);
		super.getDetail();
		System.out.println("Eneter numer of time the compound interest per year: ");
		numtime = sc.nextInt();
		cal1 = (1+ super.annual /numtime)*cal;
		cal=Math.exp(numtime*super.year);
		Ammount= super.principle*cal1;
		System.out.println(Ammount);
		sc.close();
	}
	
}
