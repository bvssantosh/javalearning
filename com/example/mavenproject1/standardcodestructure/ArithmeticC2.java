package com.example.mavenproject1.standardcodestructure;

public abstract class ArithmeticC2 implements Arithmetic2 {
	AddDto ob;

	@Override
	public void setData(AddDto ob) {
		// TODO Auto-generated method stub
		this.ob=ob;
		
	}

	

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("num1 ="+ob.getNum1()+"num2="+ob.getNum2()+" num3"+ob.getNum3());
	}
	
	
	
}
