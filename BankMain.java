package com.static1;

public class BankMain {

	public static void main(String[] args) {
		
		Bank b1 = new Bank(10000);
		Bank b2 = new Bank(200000);
		
		System.out.println("Before Changing ROI : ");
		
		b1.display();
		System.out.print("\n");
		b2.display();
		
		System.out.print("\n");
		Bank.ChangedROI(7.5);
		
		System.out.print("Changed ROI : ");
		
		b1.display();
		System.out.print("\n");
		b2.display();
	}
}
