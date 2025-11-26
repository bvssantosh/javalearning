package com.example.mavenproject1.multithreading;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Rummygame g1= new Rummygame();
		
		Rummyplayer p1=new Rummyplayer(g1);
		p1.start();
		Rummyplayer1 p2=new Rummyplayer1(g1);
		p2.start();
		p1.join();
		p2.join();
		//System.gc();
		System.out.println("game completed");

	}

}
