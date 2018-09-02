package com.kk.fsd;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {

	
	 static List<String> listOfObjects;
	 static StreamAPI Api;
	static  List<String> newList;
	 static Stream stream;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//List<String> listOfObjects = new ArrayList<>();
	 
		
	 Api = new StreamAPI();
	 listOfObjects = Stream.of("Kodanda","Sreenath","Anil").collect(Collectors.toList());
	 newList=new ArrayList<String>();
	
	 listOfObjects.add("Puli");
	 listOfObjects.add("Rajesh");
	 listOfObjects.add("");
	 listOfObjects.add("Venkatesh");
	 listOfObjects.add("");
	 listOfObjects.add("");
	 listOfObjects.add("RamaKrishna");
     
	 System.out.println("No of String whose Length is >5 : "+Api.noOfString(listOfObjects));
     System.out.println("No of Empty String  : "+Api.emptyString(listOfObjects));
     
     System.out.println("Empty String stores in Another List is :"+Api.storeEmptyToStream(listOfObjects)); 

	}
	
	
	int noOfString(List listOfObjects) {
		int count=0;
	for(int i=0;i<listOfObjects.size();i++) {
		Object obj=listOfObjects.get(i);
	    String str=(String) obj;
		if(str.length()>5) {
			count++;
		}
		
	}
		return count;
}
	
	int emptyString(List listOfObjects) {
		int count=0;
		for(int i=0;i<listOfObjects.size();i++) {
			Object obj=listOfObjects.get(i);
		    String str=(String) obj;
			if(str.length()==0) {
				count++;
			}
		}
		
		return count;
	}
	
	List<String> storeEmptyToStream(List listOfObjects) {
		int count=0;
		for(int i=0;i<listOfObjects.size();i++) {
			Object obj=listOfObjects.get(i);
		    String str=(String) obj;
			if(str.length()==0) {
				newList=Stream.of(str).collect(Collectors.toList());
							}
		}
		return newList;
	}
	
}
