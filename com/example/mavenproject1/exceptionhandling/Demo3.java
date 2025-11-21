package com.example.mavenproject1.exceptionhandling;

public class Demo3 {
//handling exception centrally example
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("begin");
		int a=10,b=0;
		int c;
		try {c=new Demo3().cal(a, b);
		System.out.println(c);
			//c=a/b;
			
			//return;//when system forcefully exits also finally will get executed actually if u have return satement and down if u write it wont get execute if u keep finally it gets executed
		}catch(ArithmeticException e) {
			System.out.println("i am in main");
		}
		finally{
			System.out.println("end");
		}

	}
	public int cal(int a,int b) throws ArithmeticException{
		return a/b;
		
	}
	

}
