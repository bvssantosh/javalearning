package com.example.mavenproject1.builderdesignpattern;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 ob=new Employee1(1015,"ram","ayodya","hr",102);
		System.out.println(ob);
		Employee1 ob1 =new Employee1.Builder()
				.empId(1010)
				.empName("shyam")
				.city("nrt")
				.designation("hr").build();
		System.out.println(ob1);
		

	}

}
