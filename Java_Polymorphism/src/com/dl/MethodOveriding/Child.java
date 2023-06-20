package com.dl.MethodOveriding;



public class Child extends Parent{
	
	public void m1() {
		System.out.println("M1 method Child");
	}

	public static void main(String[] args) {
		
//		Parent parent = new Parent();
//		parent.m1();
		
//		Child child = new Child();
//		child.m1();//overriding happened but we need super class reference,not sub class reference
		
		Parent parent = new Child();
		parent.m1();
		//right way to maintain overriding
	}

}
