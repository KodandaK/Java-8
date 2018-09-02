package com.kk.fsd;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
//import java.time.temporal.ChronoUnit;

public class Experience {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		LocalDate today=LocalDate.now();
		LocalDate FromJoined=LocalDate.of(2015,Month.MARCH,28);
		
	//Calculation using Period Class
		Period intervals=Period.between(FromJoined, today);
		System.out.println("Experience in Wipro : "+ intervals.getYears()+" Year "+intervals.getMonths()+" Month "+intervals.getDays()+" Days");
		
		
		
	//Calculation using ChronoUnit 	Class
/*		long years=ChronoUnit.YEARS.between(FromJoined,today);
		long months=ChronoUnit.MONTHS.between(FromJoined,today);
		long days=ChronoUnit.DAYS.between(FromJoined, today);		
		System.out.println("No of year experience in Wipro"+years);
		System.out.println(" No of months experience in Wipro "+months);
		System.out.println("No of Days Experience in Wipro"+days);*/
                     
	}

}
