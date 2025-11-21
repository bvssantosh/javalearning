package com.example.mavenproject1.standardcodestructure;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddDto dto=new AddDto();
		dto.setNum1(23);
		dto.setNum2(45);
		Arithmetic2 obj =new Add();
		obj.setData(dto);
		obj.cal();
		obj.display();
		
		
		obj=new Subtract();
		obj.setData(dto);
		obj.cal();
		obj.display();

	}

}
