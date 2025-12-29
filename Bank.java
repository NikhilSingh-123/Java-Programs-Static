package com.static1;

public class Bank {

	static double rateOfInterest = 0.05;
	
	double balance;
	
	Bank(double balance){
		this.balance = balance;
	}
	
	static void ChangedROI(double newROI) {
		rateOfInterest = newROI;
	}
	
	void display() {
		//System.out.println("Account Balance: " + balance);
		System.out.println("Rate Of Interest: " + rateOfInterest + "%");
	}
}
