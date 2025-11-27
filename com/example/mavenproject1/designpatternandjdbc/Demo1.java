package com.example.mavenproject1.designpatternandjdbc;

public class Demo1 extends Templatedesign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void header() {
		// TODO Auto-generated method stub
		//17 th linethis column will be allocated 10 left spaces and anothr column 30 spaces
		String h1="""
				ml mini project
				%s
				%-10s %-30s %s
				%s
				
				""";
		System.out.println(h1.format("=".repeat(60),"StudId","StudentName","dateofBirth","=".repeat(60)));
		
	}

	@Override
	public void printdata() {
		// TODO Auto-generated method stub
		display(root);
		
	}

	@Override
	public void footer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void consolidation() {
		// TODO Auto-generated method stub
		
	}

}
