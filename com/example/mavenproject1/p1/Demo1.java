package com.example.mavenproject1.p1;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int sum=0;
        for (String x:args) {
        	sum=sum+Integer.parseInt(x);      	
        }
        System.out.println("the sum is"+sum);
        
	}

}
