package com.example.mavenproject1.interfaces;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArithmeticInterface ob=new Add();
		ob.setData(30, 90);
		ob.cal();
		ob.display();
	}

}
