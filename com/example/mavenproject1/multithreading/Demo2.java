package com.example.mavenproject1.multithreading;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Game g1= new Game();
		
		Player p1=new Player(g1);
		p1.start();
		Player1 p2=new Player1(g1);
		p2.start();
		p1.join();
		p2.join();
		//System.gc();
		System.out.println("game completed");
	}

}
