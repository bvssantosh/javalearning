package com.example.mavenproject1.p1;

public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Add a=new Add(); tightly coupled
		Arithmetic obj=new Add();//loosely coupled
		
		obj.setData(12, 5);
		obj.cal();//in loosely coupled we need to declare sub classes methods in super class
		obj.display();
		obj=new Subtract();
		obj.setData(30, 5);
		obj.cal();
		obj.display();
//		Subtract s=new Subtract();
//		s.cal();
//		s.display();
//		Multiply m=new Multiply();
//		m.cal();
//		m.display();
//		Divide d=new Divide();
//		d.cal();
//		d.display();
		
	}

}
