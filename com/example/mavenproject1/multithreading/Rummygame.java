package com.example.mavenproject1.multithreading;

import java.util.Arrays;
import java.util.List;
import java.util.*;


public class Rummygame {
	List<String> l1=new Vector<String>(Arrays.asList(new String[] {"jack","queen","diamond","ace","2","3"}));
	List<String> p1=new Vector<String>();
	
	List<String> p2=new Vector<String>();
	
	public Rummygame() {
		Collections.shuffle(l1);
		for(int i=0;i<l1.size();i++) {
			if(i%2==0) {
				p1.add(l1.get(i));
				
			}else {
				p2.add(l1.get(i));
				
			}
			
		}
	}
	public synchronized void f1(int x) {
		try {
			notify();
			System.out.println(p1.get(x));
			wait();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public synchronized void f2(int x) {
		try {
			notify();
			System.out.println(p2.get(x));
			if(x!=9) {wait();}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
