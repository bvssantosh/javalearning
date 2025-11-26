package com.example.mavenproject1.localdate;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Festival f1=new Festival();
		try {
			f1.setData("2025-03-31");
			f1.ramzanCalculate();
			f1.setData("2025-10-20");
			f1.diwaliCalculate();
			
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		
		

	}

}
