package com.example.mavenproject1.localdate;

import java.util.*;

import com.example.mavenproject1.p1.Read;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Demo2 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Date dt=new Date();
		System.out.println(dt);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MMM-dd");//M-months,m-minutes
		System.out.println(sdf.format(dt));
		System.out.println("enter the date");
		dt=sdf.parse(Read.sc.nextLine());
		System.out.println(dt);//it will give like this output Tue Dec 23 00:00:00 IST 2025 is you dont use simpledateformat
		System.out.println(sdf.format(dt));
		
		
		

	}

}
