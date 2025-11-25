package com.example.mavenproject1.designpatternandjdbc;

import java.sql.Connection;
import java.util.List;

import com.example.mavenproject1.p1.Read;

public class Democonnectorstudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			StudentDAO s1=new StudentDAO();
			int ch=0;
			do {
				System.out.println("enter 0 for exit and 1 for display and 2 for getting by id and 3 for insert and 4 for delete");
				ch=Read.sc.nextInt();
				switch(ch) {
				case 0:
					System.out.println("thank you for using this service");
					s1=null;
					break;
				case 1:
					List<StudentDTO> l1=s1.getallStudent();
					l1.forEach(System.out::println);
					break;
				case 2:
					StudentDTO ob=new StudentDTO();
					System.out.println("enter the roll number");
					ob.setSroll(Read.sc.nextInt());
					System.out.println(s1.getbyid(ob));
					break;
				case 3:
					StudentDTO ob1=new StudentDTO();
					System.out.println("enter the details to add");
					ob1.setSroll(Read.sc.nextInt());
					ob1.setFirstname(Read.sc.next());
					ob1.setLname(Read.sc.next());
					ob1.setDob(Read.sc.next());
					ob1.setGender(Read.sc.next());
					s1.insert(ob1);
					System.out.println("details entered successfully");
					break;
				case 4:
					StudentDTO ob2=new StudentDTO();
					System.out.println("enter the sroll to delete");
					ob2.setSroll((Read.sc.nextInt()));
					s1.deletebyid(ob2);
					System.out.println("student details deleted successfully");
					break;				
				default:
					System.out.println("please enter the correct input");
					break;	
				}
			}while(ch!=0);			
		}catch(Exception e) {
			System.out.println("connection failed"+e.getMessage());
		}
	}
}
