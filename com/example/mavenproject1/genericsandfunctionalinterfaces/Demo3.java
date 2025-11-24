package com.example.mavenproject1.genericsandfunctionalinterfaces;
//generics using classes
public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Generics -generic template i.e class created without data type
		Temp1<Integer> ob=new Temp1<>();
		ob.setData(100, 400);
		ob.display();
		Temp1<String> ob1=new Temp1<>();
		ob1.setData("santosh", "narasaraopet");
		ob1.display();
		Temp2<Integer,String> ob2=new Temp2<>();
		ob2.setData(123,"santosh");
		ob2.display();
		
	}

}
class Temp1<P>{
	P a,b;
	public void setData(P x, P y) {
		a=x;
		b=y;
		
	}
	public void display() {
		System.out.println(a+" "+b);
	}
}

class Temp2<T1,T2>{
	T1 a;
	T2 b;
	public void setData(T1 x, T2 y) {
		a=x;
		b=y;
		
	}
	public void display() {
		System.out.println(a+" "+b);
	}
}