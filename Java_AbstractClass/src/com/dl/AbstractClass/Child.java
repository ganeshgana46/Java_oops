package com.dl.AbstractClass;

public class Child extends Parent{

	@Override
	public void m1() {
		System.out.println("abstarct class");
		
	}
	
	public static void main(String[] args) {
		
		Parent parent = new Child();
		parent.m1();
		parent.m2();

	}

}
