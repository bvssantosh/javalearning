package com.example.mavenproject1.p1;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Addition obj=new Addition();
      obj.setData(20,30);
      obj.compute();
      obj.display();
//      obj=null;
      obj=new Addition(3); //manually deferencing
     // obj.setData(22,30);
//      obj.compute();
      obj.display();
      obj=null;
    System.out.println(Addition.num3);
    Addition obj2=new Addition();
    obj2.setData(20,30);
    Addition obj1=new Addition(obj2);  
    System.gc();
      
      
      
	}

}
