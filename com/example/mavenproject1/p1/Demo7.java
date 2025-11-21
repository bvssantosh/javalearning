package com.example.mavenproject1.p1;

public class Demo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Arithmetic array of obj
		Arithmetic ob2[]=new Arithmetic[4];
		ob2[0]=new Add();
		ob2[1]=new Subtract();
		ob2[2]=new Multiply();
		ob2[3]=new Divide();
		System.out.println("enter1 for Add, enter 2 subtract, enter 3 for multiply ,enter 4 for divide ");
		int ch=Read.sc.nextInt();
		System.out.println("enter two numbers");
		ob2[ch-1].setData(Read.sc.nextInt(),Read.sc.nextInt());
		ob2[ch-1].cal();
		ob2[ch-1].display();
	}

}
