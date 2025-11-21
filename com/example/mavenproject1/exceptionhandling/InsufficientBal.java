package com.example.mavenproject1.exceptionhandling;
//creating custom exception
public class InsufficientBal extends Exception {
	public InsufficientBal() {
		super("the transaction is cancelled");
		
		
	}
	
}
