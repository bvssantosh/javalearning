package com.example.mavenproject1.p1;

public class Addition {
    int num1,num2;
    static int num3;
    public Addition() {
    	System.out.println("i am no argument constructor");
    	
    }
    public Addition(int a) {
    	System.out.println("called parameterised constructor");
    	
    }
    public Addition(Addition c) {
    	System.out.println("copy constructor");
    	System.out.println("copy cunstructor num1"+c.num1);
    	System.out.println("copy cunstructor num2"+c.num2);
    	System.out.println("copy cunstructor num3"+c.num3);
    	
    }
    public void readData() {
    	System.out.println("enter two numbers");
    	num1=Read.sc.nextInt();
    	num2=Read.sc.nextInt(); 	
    }
    public void setData(int num1,int num2) {
    	this.num1=num1;
    	this.num2=num2;
    	
    }
    public void compute() {
    	this.num3=this.num2+this.num1;
    	
    }
    public void display() {
    	System.out.println("num 1="+this.num1);
    	System.out.println("num 2="+this.num2);
    	System.out.println("Addition is="+this.num3);
    }
    public void finalize() {
    	System.out.println("i am destructor");
    	
    }
    {
    	System.out.println("anonymus block");
    }
    static{
    	System.out.println(" static anonymus block");
    }
}
