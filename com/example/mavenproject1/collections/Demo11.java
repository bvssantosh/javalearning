package com.example.mavenproject1.collections;

import java.util.LinkedHashMap;
import java.util.Map;

import com.example.mavenproject1.p1.Read;
//accept the sentence and display each word how many times it is going to display
public class Demo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String sentence;
		 Map<String,Integer> mp=new LinkedHashMap<>();//here use linked hashmap because we need order
		 System.out.println("enter sentence");
		 sentence=Read.sc.nextLine();
		 String arr[]=sentence.split(" ");//splitting regex
		 for(String x:arr) {
			 int y=mp.getOrDefault(x,0);
			 y++;
			 mp.put(x,y);
			 
		 }
		 System.out.println(mp);
		 
	
	}

}
