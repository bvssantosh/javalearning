package com.example.mavenproject1.flesystem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
		
		FileInputStream f1=new FileInputStream("C:\\Users\\boddu.v\\eclipse-workspace\\mavenproject1\\src\\main\\java\\com\\example\\mavenproject1\\flesystem\\picture.bmp");
		FileOutputStream f2=new FileOutputStream("C:\\Users\\boddu.v\\eclipse-workspace\\mavenproject1\\src\\main\\java\\com\\example\\mavenproject1\\flesystem\\picture2.bmp");
		int ch=0,i=0;
		while((ch=f1.read())!=-1){
			if(i<=500) {	//UPTO 500 IT IS  meta data like name,x axis ,y-axis
				f2.write(ch);
				i++;
				
			}
			else {
				f2.write(ch);
				f2.write(ch);
				f2.write(ch);
				f1.read();
				f1.read();
				
			}
		}
		f1.close();
		f2.close();
		System.out.println("file processed successfuly");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
