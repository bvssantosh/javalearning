package com.example.mavenproject1.objectserializable;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//serializable
		try {
			 FileOutputStream fo=new FileOutputStream("x.rm");
			 Addtest ob=new Addtest();
			 ob.setData(32, 42);
			 ob.cal();
			 new ObjectOutputStream(fo).writeObject(ob);
			 fo.close();
			 System.out.println("serialization over");
			 
			
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
