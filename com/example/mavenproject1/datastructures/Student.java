package com.example.mavenproject1.datastructures;

import java.util.Date;

public class Student {
	int sid;
	String name;
	Date dob;
	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", dob=" + dob + "]";
	}

	Student next = null;
	
}
