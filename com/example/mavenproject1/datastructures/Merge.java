package com.example.mavenproject1.datastructures;

import com.example.mavenproject1.p1.Read;

public class Merge {
	Integer arr[];
	public Merge() {
		arr=new Integer[10];
	}
	public Merge(int n) {
		arr=new Integer[n];
	}
	public void  addElements() {
		for(int i=0;i<arr.length;i++) {
			arr[i]=Read.sc.nextInt();
		}
	}
	public void sorting() {
		int c=(arr.length)/2;
		//Mergesort(0,c);
		
	}
	
}
