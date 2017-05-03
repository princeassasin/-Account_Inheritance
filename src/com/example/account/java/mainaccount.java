package com.example.account.java;

import java.util.Scanner;

public class mainaccount {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Menu:");
		System.out.println("Enter 1 for fixed or 2 for savings:");
		System.out.println("Enter the Choice:");
		int a = sc.nextInt();
		switch(a){
		
		case 1:
			fixedaccount fx = new fixedaccount();
			fx.calculate();;
			break;
			
		case 2:
			savingsacount sp = new savingsacount();
			sp.calculate();
		}
sc.close();
	}

}
