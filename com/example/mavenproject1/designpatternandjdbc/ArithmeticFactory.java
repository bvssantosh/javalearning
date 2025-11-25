package com.example.mavenproject1.designpatternandjdbc;

import com.example.mavenproject1.p1.Arithmetic;
import com.example.mavenproject1.p1.*;

//factory design pattern
public class ArithmeticFactory {
	private static Arithmetic arr[]=new Arithmetic[] {
			new Add(),new Subtract()};
	
	public static  Arithmetic getarithmetic(int i) {
		return arr[i];
		
	}
}
