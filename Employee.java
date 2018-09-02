package com.kk.fsd;

import java.util.Comparator;

public class Employee{
private int id;
private String name;
private String address;
private int sal;


public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public int getSal() {
	return sal;
}
public void setSal(int sal) {
	this.sal = sal;
}

static int compareBySal(Employee e1,Employee e2) {
	
	if(e1.sal>e2.sal) {
		return e1.sal;
	}
	else 
	return e2.sal;
	
}

@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getId()+" "+getName()+" "+getAddress()+" "+getSal();
	}

}