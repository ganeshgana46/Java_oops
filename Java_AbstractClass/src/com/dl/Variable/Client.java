package com.dl.Variable;

//In abstract class we have instance variables,static variables and local variables,
//but static variables and local variables are executed in 
//abstract class but not instance variables.

public abstract class Client {
	
	int i = 10;
	int j = 20;
	
	static int a = 30;
	static int b = 40;
	
	public static void main(String[] args) {
		
		int x = 50;
		int y = 60;
		
//		System.out.println(new Client().i);
//		System.out.println(new Client().b);//can't instantiate
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(x);
		System.out.println(y);
	}

}
