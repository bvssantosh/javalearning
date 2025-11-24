package com.example.mavenproject1.genericsandfunctionalinterfaces;
//generics using intefaces so that we can make some computations
interface Test1<T,T1>{
	public T1 f1(T x,T y);

}
public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Test1<String,Integer> ob=(x,y)->(x.length()+y.length());
		System.out.println(ob.f1("santosh","boddu"));
	}

}
