package com.example.mavenproject1.localdate;

import java.time.LocalDate;

public class Festival {
	LocalDate l;
	public Festival() {
		l=LocalDate.now();
		
	}
	public void setData(String dt) {
		this.l=LocalDate.of(Integer.parseInt(dt.substring(0,4)),Integer.parseInt(dt.substring(5,7)),Integer.parseInt(dt.substring(8,10)));
	
	}
	public void display() {
		System.out.println(l);
	}
	public void ramzanCalculate() {
		int days=(int)(12*29.5f);
		System.out.println("ramzan for next 12 yrs");
		for(int i=0;i<12;i++) {
			l=l.plusDays(days);
			display();
		}

	}
	int flag=3;
	public void diwaliCalculate() {
		int days=(int)(12*29.5);
		System.out.println("diwali for next 12 yrs");
		for(int i=0;i<12;i++) {
			if(flag%3==0) {
				l=l.plusDays(29);
				flag=0;
			}
			l.plusDays(days);
			display();
			flag++;
			
		}
	}
	

}
