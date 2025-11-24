package com.example.mavenproject1.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1=new ArrayList<>();
		l1.add(100);
		l1.add(200);
		l1.add(23);
		l1.add(678);
		l1.add(7);
		l1.add(99);
		System.out.println(l1);
		for(int i=0;i<l1.size();i++) {
			System.out.print(l1.get(5)+" ");
		}
		System.out.println("...using for loop index");
		for(Integer x:l1) {
			System.out.print(x+" ");
			
		}
		System.out.println("...using for each loop");
		//by using inbuilt for each loop
		l1.forEach((x)-> System.out.print(x+" "));
		System.out.println("...for each consumer ");
		l1.forEach(System.out::print);//method reference is consumer
		System.out.print("\n... using for each consumer and method reference");
		l1.forEach(Demo4::psv);
		System.out.print("\n... using for each consumer and user static method reference");
		Demo4 obj=new Demo4();//because p1 method is not static
		l1.forEach(obj::p1);
		System.out.print("\n... using for each consumer and user instance method reference");
		//by iterator
	    Iterator<Integer> it=l1.iterator();
	    while(it.hasNext()) {
	    	System.out.println(it.next()+"by using iterator traversal");	    	
	    }
	    //particular value
	    System.out.println(l1.get(4)+"getting particular value by index");
	    //remove element(for this give index)
	    l1.remove(4);
	    System.out.println(l1+"removed by passing index");
	    //removing particular data whith out index
	    l1.remove(new Integer(200));//depricated and when ever if you want to delete by element then remove takes object as parameter
	    System.out.println(l1);
	  //arrays will be converted to arraylist
	    List<Integer> l2=new ArrayList<Integer>(Arrays.asList(new Integer[] {10,3,56,2,7,99}));
	    System.out.println(l2);
	    //l1.addAll(l2);//adding collection
	   // l1.retainAll(l2);//common all elements will come
	   // System.out.println(l1+"hi");
	   // l1.removeAll(l2);//it will remove common elements
	  //  Collections.sort(l1);//will get sorted
	    Collections.shuffle(l2);//it will shuffle
	    System.out.println(l2);
	    l1.clear();//it clears all the elements
	    
	    System.out.println(l1+"hii");
	    
	    
		
	}
	public static void psv(Integer x) {
		System.out.println(x+"-->"+(x*x)+"...");
		
	}
	public void  p1(Integer x) {
		System.out.println(x+"-->"+(Math.sqrt(x))+"...");
	}

}
