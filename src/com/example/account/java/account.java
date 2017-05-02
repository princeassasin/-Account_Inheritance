package com.example.account.java;

import java.util.Scanner;

public class account {

	int principle ;
	float annual;
	int numtime;
	int year;
	
	public void  getDetail() {
		System.out.println("Enter the details for calculating simple or compound interest: ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter inital principle amount: ");
		principle = sc.nextInt();
		System.out.println("Eneter annual amount: ");
		annual = sc.nextFloat();
		System.out.println("Eneter numer of time the compound interest per year: ");
		numtime = sc.nextInt();
		System.out.println("Eneter year: ");
		year = sc.nextInt();
		sc.close();
		
	}
}
