package com.example.mavenproject1.multithreading;

public class Rummyplayer1 extends Thread {
	Rummygame ob;
	public Rummyplayer1(Rummygame ob) {
		this.ob=ob;
		
	}
	public void run() {
		for(int i=0;i<3;i++) {
			if(i<3) {
				
				try {
					sleep(300);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			ob.f2(i);
}
	}
}

	
