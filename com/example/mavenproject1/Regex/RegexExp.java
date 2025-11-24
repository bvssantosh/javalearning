package com.example.mavenproject1.Regex;

import com.example.mavenproject1.p1.Read;

public class RegexExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String email="santoshboddu24@gmail.com";
		String regex = "^[A-Za-z].*[A-Za-z0-9]{3}@.+\\.com$";
		String out=Read.sc.next();
		System.out.println(out.matches(regex));

	}

}
