package com.kk.fsd;

interface Piano{
	default void play(String str) {
		System.out.println("Piano is being played by  : "+str);
	}	
}

interface Guitar{
	default void play(String str) {
		System.out.println("Guitar is being played by  : " +str);
	}
}

public class Instrument implements Piano,Guitar {

	public static void main(String[] args) {
	 // TODO Auto-generated method stub

	System.out.print("defult() of interface in JAVA8 \n");
	Instrument inst=new Instrument();
	inst.play("KK");
	}
	
	@Override
	public void play(String str) {
		// TODO Auto-generated method stub
		Guitar.super.play(str);
		Piano.super.play(str);
	}
	
}





