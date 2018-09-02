package com.kk.fsd;

import java.util.Comparator;

public class CompareObj implements Comparator<Employee>{

	
	 public int compare(Employee e1, Employee e2) {
	        return e1.getName().compareTo(e2.getName());
		 //return e1.getId()-e2.getId();
	    }
}


