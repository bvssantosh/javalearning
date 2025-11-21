package assignment;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Matrix ob1=new Matrix(2,2);
		ob1.readMatrix();
		Matrix ob2=new Matrix(ob1);
		Matrix ob3=ob1.add(ob2);
		System.out.println("the first matrix");
		ob1.display();
		System.out.println("the second matrix");
		ob2.display();
		System.out.println("the addition is");
		ob3.display();
		
	}

}
