package com.example.mavenproject1.reverseqla;

import java.util.Scanner;

public class Reverse {
	String output="";
	Scanner sc=new Scanner(System.in);	
	public void reverse1() {
		System.out.println("enter the integer");
		int a=sc.nextInt();
		while(a>0){
			int b=a%10;
			output+=b;
			a=a/10;	
		}
		System.out.println(output);
	}
	public void reversestring() {
		System.out.println("enter the string");
		String s=sc.next();
		for(int i=s.length()-1;i>=0;i--) {
			output+=s.charAt(i);
		}
		System.out.println(output);
	}	
	public static void main(String args[]) {
		System.out.println("enter 1 for number, enter 2 for string");
		Reverse r=new Reverse();
		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();
		if(ch==1) {
			r.reverse1();
		}else {
			r.reversestring();
			
		}

	}

}

