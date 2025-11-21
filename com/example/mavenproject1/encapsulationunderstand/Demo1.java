package com.example.mavenproject1.encapsulationunderstand;

import com.example.mavenproject1.encapsulation.EncapsulationDemo;

public class Demo1 extends EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapsulationDemo ob=new EncapsulationDemo();
		//System.out.println(ob.a);//error because another class private member
		//System.out.println(ob.b);not allowed because it is default inanother package
		//System.out.println(ob.c);// not allowed because it is protected in another package
		System.out.println(ob.d);
		//ob.f1(); error because private data member
	//	ob.f2(); it will not work default method outside package
		//ob.f3();//it will not work protected method outside package
		ob.f4();//public member
	}
	public void test() {
		
		//System.out.println(a);//not allowed as private (here we inherited)
		//System.out.println(b);//not allowed as a default(here we inherited)
		System.out.println(c);//protected data
		System.out.println(d);//public data
		f3();		
	}
}
