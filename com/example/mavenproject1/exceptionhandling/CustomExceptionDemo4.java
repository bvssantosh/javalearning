package com.example.mavenproject1.exceptionhandling;

import java.util.Scanner;

public class CustomExceptionDemo4 {
 
 
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		// TODO Auto-generated method stub
		int balance=25000;
		try {
			System.out.println("enter amount to withdraw");
			int amt=sc.nextInt();
			if(amt>balance) {
				throw new InsufficientBal();
				
			}
			System.out.println("please wait, your transaction is in process ");
			
		}catch(InsufficientBal e) {
			System.out.println(e.getMessage());
		}

	}

}
