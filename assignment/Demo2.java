package assignment;

import com.example.mavenproject1.p1.Read;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter day of week");
		String n=Read.sc.next();
		try {
			DayOfTheWeek ob=DayOfTheWeek.valueOf(n);
			ob.display();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
