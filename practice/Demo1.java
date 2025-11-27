package practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import com.example.mavenproject1.p1.Read;

public class Demo1 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
//		Date d=new Date();
//		//String s="2004-07-24";
//		
//		System.out.println(d);
//		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
//		Date dob=sdf.parse(Read.sc.next());
//		System.out.println(dob);
//		String s=sdf.format(dob);
//		System.out.println(s);
//		
		LocalDate d=LocalDate.now();
		LocalDate dateofbirth;
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy-MM-dd");
		//dateofbirth.format(dtf);
		dateofbirth=(LocalDate) dtf.parse(Read.sc.next());
		//System.out.println(dtf.parse(Read.sc.next()));
		System.out.println(d);
		d=d.plusDays(23);
		System.out.println(d);
		
		

	}

}
