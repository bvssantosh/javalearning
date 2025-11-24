package com.example.mavenproject1.collections;

import java.util.LinkedList;
import java.util.Queue;

public class Demo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> qu=new LinkedList<>();
		qu.add(100);
		qu.add(200);
		qu.add(250);
		
		System.out.println(qu);
		System.out.println(qu.remove());
		System.out.println(qu.remove());
		

	}

}
