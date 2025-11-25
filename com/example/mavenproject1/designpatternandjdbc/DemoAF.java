package com.example.mavenproject1.designpatternandjdbc;

import com.example.mavenproject1.p1.Arithmetic;

public class DemoAF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arithmetic obj=ArithmeticFactory.getarithmetic(0);
		obj.setData(20, 89);
		obj.cal();
		obj.display();

	}

}
