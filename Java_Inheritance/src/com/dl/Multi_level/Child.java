package com.dl.Multi_level;

//chain of inheritance is called multilevel inheritance
class GrandParent{
	public void m1() {
		System.out.println("M1 method");
	}
}

class Parent extends GrandParent{
	public void m2() {
		System.out.println("M2 method");
	}
}

public class Child extends Parent{
	
	public static void m3() {
		System.out.println("M3 method");
	}

	public static void main(String[] args) {
		
		
		Child child = new Child();
		child.m1();
		child.m2();
		m3();
		
		
	}

}
