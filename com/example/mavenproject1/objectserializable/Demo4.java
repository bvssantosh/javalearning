package com.example.mavenproject1.objectserializable;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//deserialization
		try {
			FileInputStream f1=new FileInputStream("x.rm");
			Addtest ob=(Addtest)new ObjectInputStream(f1).readObject();//when you say read u need type casting
			ob.display();
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
