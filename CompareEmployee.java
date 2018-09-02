package com.kk.fsd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class CompareEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	List<Employee> emp = new ArrayList<>();
		
	    Employee e1=new Employee();
	    Employee e2=new Employee();
	   
	    //setting values to employee 1
	    e1.setId(7234);
	    e1.setName("Kodanda");
	    e1.setAddress("AndhraPradesh");
	    e1.setSal(70000);
	    
	    //setting values to Employee 2 
	    e2.setId(9321);
	    e2.setName("Imran");
	    e2.setAddress("Bhihar");
	    e2.setSal(60000);
    		
	    emp.add(e1);
	    emp.add(e2);
		
		System.out.println("1. High salary  from the both of the Employee earning from the company is  :"+Employee.compareBySal(e1, e2));
		
		System.out.println("2. Before Sorting :"+emp);
		
	    Collections.sort(emp,new CompareObj());
	    
	    System.out.println("2. After Sorting based on the ID :"+emp);
	    
	    Collections.sort(emp, Employee::compareBySal);
	    
	    System.out.println("3. Invoking method by using sort() :"+emp);
	   
	}


}
