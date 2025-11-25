package com.example.mavenproject1.designpatternandjdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class Dbconnector {
	public static Connection co=null;
	public static Connection getConnection() throws Exception{
		//here we handling through throws because resourses are central
		//single ton only one connection should be there 
		if(co==null) {
			Class.forName("com.mysql.cj.jdbc.Driver");//this jdbc driver name for mysql type4
			co=DriverManager.getConnection("jdbc:mysql://localhost:3306/learning","root","root@39");//give url where jdbc is present
		}
		
		return co;
		
	}

}
