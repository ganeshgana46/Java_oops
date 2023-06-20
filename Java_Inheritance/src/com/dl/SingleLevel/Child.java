package com.dl.SingleLevel;

public class Child extends Parent{
	
	public void m3() {
		System.out.println("M3 method");
	}

	public static void main(String[] args) {
		
		Child child = new Child();
		child.m1();
		m2();
		child.m3();
	}

}
