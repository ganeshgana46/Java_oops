package com.dl.usingAbstractClass;

public class Client {

	public static void main(String[] args) {
		
//		Child child = new Child();
//		child.m1();
//		child.m2();
//		child.m3();
//		child.m4();
		
		//Hiding implementation here
		GrandParent child = new Child();
		child.m1();//f3
		child.m2();
		child.m3();
		child.m4();
	}

}
