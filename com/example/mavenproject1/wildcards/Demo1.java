package com.example.mavenproject1.wildcards;

import java.util.ArrayList;
import java.util.List;
import com.example.mavenproject1.collections.EmployeeDTO;



//wild cards
public class Demo1 {

	public static void main (String[] args) {
		// TODO Auto-generated method stub
		List<EmployeeDTO> ob= new ArrayList<>();
		ob.add(new EmployeeDTO(1011,"Ramesh"));
		ob.add(new EmployeeDTO(1012,"Suresh"));
		Display ob1=new Display();
		ob1.f1(ob);	
		
		
	}

}

class Display {
    
    public void f1(List<? extends Object> ob){//you can use like this also public void f1(List<?> ob)
        ob.forEach(System.out::println);

	}
}
interface Display1{
	public void f2(List<? extends Object> ob);
	
}
//create a student dto check whether 
//create a class which extends student dto and try with the same class
