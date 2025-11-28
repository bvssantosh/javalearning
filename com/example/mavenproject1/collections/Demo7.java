//package com.example.mavenproject1.collections;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
//import java.util.TreeSet;
//import java.util.stream.Collectors;
//public class Demo7 {
////related to tree set
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//				// TODO Auto-generated method stub
//				Set<EmployeeDTO> obj =new TreeSet<EmployeeDTO>();
//				obj.add(new EmployeeDTO(1005,"Ram"));
//				EmployeeDTO dto=new EmployeeDTO();
//				dto.setEmpid(1006);
//				dto.setEmpname("shyam");
//				obj.add(dto);
//				obj.add(dto);//it wont take duplicates
//				
//				obj.add(new EmployeeDTO(1007,"Rohan"));
//				obj.add(new EmployeeDTO(1008,"jack"));
//				obj.add(new EmployeeDTO(1009,"koushik"));
//				System.out.println(obj);
//				obj.forEach(System.out::println);
//				System.out.println("printing only even ids");
//				obj.stream().filter((ob)->(ob.getEmpid()%2==0)).forEach(System.out::println);
//				System.out.println("printing only names");
//				obj.stream().map((ob)->(ob.getEmpname())).forEach(System.out::println);
//				System.out.println("printing names whose names start with 'R'");
//				obj.stream().filter((ob)->ob.getEmpname().charAt(0)=='R').map((ob)->(ob.getEmpname())).forEach(System.out::println);
//				System.out.println("printing names whose names start with 'R' using regular exp");
//				obj.stream().filter((ob)->ob.getEmpname().matches("[Rr].*")).map((ob)->(ob.getEmpname())).forEach(System.out::println);
//				
//			int c=(int)	obj.stream().filter((ob)->ob.getEmpname().matches("[Rr].*")).map((ob)->(ob.getEmpname())).count();//count is an supplier
//			System.out.println("the number of persons starting with letter R"+c);
//			System.out.println("//create seperate arraylist of emp whose name is between  a to m;");
//		     //create seperate arraylist of emp whose name is between  a to m;
//			Set<EmployeeDTO> obj1=	(Set<EmployeeDTO>)obj.stream().filter((ob)->ob.getEmpname().matches("[A-Ma-m].*")).collect(Collectors.toList());
//			System.out.println(obj1);
//			System.out.println("using comparator sorting based on names");
//			Collections.sort(obj,(x,y)->(x.getEmpname().compareTo(y.getEmpname())));
//			System.out.println(obj);
//			System.out.println("using comparable sorting based on names");
//			Collections.sort(obj);
//			System.out.println(obj);//because hash set in unordered so we cannot use comparator or comparable
//			}
//
//		
//
//
//	}
//
//
