package com.dl.MethodOverload;

//Method Overloading : {single class, method name must be same, Arguments can be different}

public class Eg1 {
	
	public void m1(int a,int b) {
		System.out.println(a+b);
	}
	
	public void m2(float a,float b) {
		System.out.println(a+b);
	}
	
	public void m3(double a,double b) {
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		
		Eg1 eg1 = new Eg1(); 
		eg1.m1(2, 3);
		eg1.m2(1.0f, 2.0f);
		eg1.m3(2.00, 3.00);
	}

}
