package com.example.mavenproject1.polymorphism;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolymorphismDemo obj=new PolymorphismDemo();
		System.out.println(obj.add(10.2f,30));//compile time binding
		System.out.println(obj.add(10,30));
	}

}
