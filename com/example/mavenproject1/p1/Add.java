package com.example.mavenproject1.p1;
//if u extend and get properties na then it is is-a relation
public class Add extends Arithmetic {
		
		public void cal() {
			num3=num1+num2;
			
		}
		//overriding
		public void display() {
			System.out.println("sum=");
			super.display();
		}
		
}
