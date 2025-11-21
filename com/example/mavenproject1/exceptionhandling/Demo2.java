package com.example.mavenproject1.exceptionhandling;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("begin");
		int a=10,b=0;
		int c;
		try {
			c=a/b;
			System.out.println(c);
			return;//when system forcefully exits also finally will get executed actually if u have return satement and down if u write it wont get execute if u keep finally it gets executed
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		finally{
			System.out.println("end");
		}
		
		
		
		
	}
	public int cal(int a,int b) throws ArithmeticException{
		return a/b;
		
	}

}
