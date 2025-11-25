package com.example.mavenproject1.filesystemadvance;
//this code converts small a to A in the file
import java.io.File;
import java.io.RandomAccessFile;

import com.example.mavenproject1.p1.Read;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String fname;
			System.out.println("enter filename withpath and extension");
			fname=Read.sc.nextLine();
			File f1=new File(fname);
			RandomAccessFile rm=new RandomAccessFile(f1,"rw");
			long fp =0L;//filepointer
			int ch;
			while((ch=rm.read())!=-1) {
				if(ch==97) {
					rm.seek(fp);//file pointer red and moved one byte so you need to come back
					rm.write(65);
					
				}
				fp++;
				
			}
			rm.close();
			System.out.println("file processing is successful");
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
