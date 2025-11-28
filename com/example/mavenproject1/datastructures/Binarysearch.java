package com.example.mavenproject1.datastructures;

import java.util.Arrays;

import com.example.mavenproject1.p1.Read;

public class Binarysearch {
	public static void main(String args[]) {	
	Integer[] arr=new Integer[] {20,35,12,55,89,198,2};
	Arrays.sort(arr);
	int key;
	key=Read.sc.nextInt();
	int x=binarysearch( key,arr,0,arr.length-1);
	if(x==-1) {
		System.out.println("key is not present");
	}else
	{
		System.out.println("key is present at index"+x);
	}
	}
	public static int binarysearch(int key,Integer arr[],int low,int high) {
		if(low>high) { return -1;}
		int mid=low+(high-low)/2;
		if(arr[mid]==key) { return mid;}
		else if(arr[mid]<key) {
			return binarysearch(key,arr,mid+1,high);
		}else {
			return binarysearch(key,arr,low,mid-1);
			
		}		
	}
}
