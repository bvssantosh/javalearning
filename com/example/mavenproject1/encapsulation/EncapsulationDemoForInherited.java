package com.example.mavenproject1.encapsulation;

public class EncapsulationDemoForInherited extends EncapsulationDemo{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapsulationDemo ob=new EncapsulationDemo();
		//System.out.println(ob.a);//error because another class private member
		System.out.println(ob.b);//default
		System.out.println(ob.c);//protected
		System.out.println(ob.d);//public
		//ob.f1(); error because private data member
		ob.f2();//default 
		ob.f3();//protected
		ob.f4();//public member
	}
}
