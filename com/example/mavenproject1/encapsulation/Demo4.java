package com.example.mavenproject1.encapsulation;

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapsulationDemo ob=new EncapsulationDemo();
		//System.out.println(ob.a);//error because another class private member
		System.out.println(ob.b);
		System.out.println(ob.c);
		System.out.println(ob.d);
		//ob.f1(); error because private daata member
		ob.f2();
		ob.f3();
		ob.f4();
		
		
	}

}
