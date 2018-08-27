package com.kk.fsd;

interface WordCount{
	 int count(String str);
}


public class MyClassWithLamda {
	public static void main(String[] args) {
		// implementing WordCount interface by using Lambda expression
		WordCount word=(String str)->{
			
			int wordCount=1;
			
			for(int i=0;i<str.length();i++) {
				if(str.charAt(i)==' ')
					wordCount++;
			}
			return wordCount;
		};
		
		 int info=word.count("Spririt of wipro should be followed by every employee of Wipro");
		 
		 System.out.println("The Count of the given String is  : "+info);
	}



}
