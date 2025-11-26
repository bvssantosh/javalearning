package com.example.mavenproject1.multithreading;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("i 'm in main company thread t1");
		Compthread t1=new Compthread("google",15);
		Compthread t2=new Compthread("vds solutions",10);
		Compthread t3=new Compthread("hero",25);
		t1.start();
		t1.join();
		t2.start();
		t2.join();	
		t3.start();
		
			
		t3.join();
		System.out.println("program over");
	
	}

}
