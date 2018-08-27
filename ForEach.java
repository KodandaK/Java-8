package com.java8.fsd;

import java.util.ArrayList;
import java.util.List;

public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Object> emp = new ArrayList<>();
		
	    Employee record=new Employee();
	    record.setId(1234);
	    record.setName("Kodanda");
	    record.setAddress("India");
	    record.setSal(40000);
	    
	    emp.add(record.getId());
		emp.add(record.getName());
		emp.add(record.getAddress());
		emp.add(record.getSal());
		
	
		System.out.println("Objects of an Employee are :");
		
		
		emp.forEach(info -> System.out.println(info));
		

	}

}
