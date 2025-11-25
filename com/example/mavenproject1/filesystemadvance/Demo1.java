package com.example.mavenproject1.filesystemadvance;

import java.io.File;
//opening file from the file system 
import com.example.mavenproject1.p1.Read;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String fname;
			System.out.println("enter filename withpath and extension");
			fname=Read.sc.nextLine();
			File f1=new File(fname);
			if(f1.exists()) {
				if(f1.isDirectory()) {
					System.out.println("given is a directory");
					String arr[]=f1.list();//gives files present in the directory
					for(String x:arr){
						System.out.println(x);
					}
				}else {
					System.out.println("given is a file");
				}
			}else {
				System.out.println("file does not exist");
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	} 
}
