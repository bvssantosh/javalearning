package com.example.mavenproject1.multithreading;

public class Player extends Thread {
	Game ob;
	public Player(Game ob) {
		this.ob=ob;
		
	}
	public void run() {
		for(int i=0;i<10;i++) {
			ob.f1();
			
		}
	}

}
