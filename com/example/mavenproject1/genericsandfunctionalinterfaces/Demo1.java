package com.example.mavenproject1.genericsandfunctionalinterfaces;
public class Demo1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IsMath obj=(x,y)->(x+y);
		IsMath obj1=(x,y)->{int z=x-y;
		return z;//if {flower bracket is there definately we need return statement
};
		System.out.println(obj.cal(10,20));
		System.out.println(obj1.cal(20,20));
		add((x,y)->(x/y),10,2);
		add((x,y)->(x*y),10,2);
		
		}
	public static void add( IsMath obj,int  a,int  b) {
		System.out.println(obj.cal(a, b));
	}
			
		}
@FunctionalInterface
interface IsMath{
	public int cal(int a,int b);
	//public void cal1(int a,int b);//it shows error because in functional interface we cannot have two abstract methods
	
}
