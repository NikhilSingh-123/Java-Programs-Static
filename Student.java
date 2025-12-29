package com.static1;

public class Student {
	static String collegeName = "RJSPM";
	int id;
	String name;
	
	Student(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	void display() {
		System.out.println("The ID is " + id);
		System.out.println("The name is " + name);
		System.out.println("The college name is " + collegeName);
		
	}

}
