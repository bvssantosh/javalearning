package com.example.mavenproject1.multithreading;

public class Rummyplayer extends Thread {
	Rummygame ob;
	public Rummyplayer(Rummygame ob) {
		this.ob=ob;
		
	}
	public void run() {
		for(int i=0;i<3;i++) {
			ob.f1(i);
			
		}
	}
}
