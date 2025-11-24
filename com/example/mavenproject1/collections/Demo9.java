package com.example.mavenproject1.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Demo9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<Integer> qu=new ArrayDeque<Integer>();
		qu.add(100);
		qu.push(150);
		qu.add(300);
	    System.out.println(qu);
		System.out.println(qu.remove());
		System.out.println(qu.pop());
		System.out.println(qu);
		//write a java pgm to store city population give the population for request city 

	}

}
