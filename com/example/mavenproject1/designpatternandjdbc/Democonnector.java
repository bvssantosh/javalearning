package com.example.mavenproject1.designpatternandjdbc;

import java.sql.Connection;

public class Democonnector {
	public static void main(String args[]) {
		try {
			Connection con=Dbconnector.getConnection();
			System.out.println("connection successful");
			
		}catch(Exception e) {
			System.out.println("connection failed"+e.getMessage());
		}
	}
}
