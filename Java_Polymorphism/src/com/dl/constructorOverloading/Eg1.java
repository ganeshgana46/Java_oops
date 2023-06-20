package com.dl.constructorOverloading;

//A class contain more than one constructor, and all these constructors having
//having same name but different Arguments.

public class Eg1 {
	
	public Eg1() {
		System.out.println("Default Constructor");
	}
	
	public Eg1(int a,int b) {
		System.out.println(a+b);
	}
	
	public Eg1(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	
	public Eg1(float a,float b) {
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		
		new Eg1();
		new Eg1(2,3);
		new Eg1(2,3,2);
		new Eg1(2.0f,3.0f);

	}

}
