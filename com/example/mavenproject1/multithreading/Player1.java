package com.example.mavenproject1.multithreading;

public class Player1 extends Thread {
	Game ob;
	public Player1(Game ob) {
		this.ob=ob;
		
	}
	public void run() {
		for(int i=0;i<10;i++) {
			if(i<10) {
				
				try {
					sleep(300);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			ob.f2(i);
//			if(i==9) {
//				ob.finalize();
//			}
			
			
		}
	}
}
