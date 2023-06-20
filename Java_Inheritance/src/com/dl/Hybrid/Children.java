package com.dl.Hybrid;

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

class Child extends Parent{
	public void m3() {
		System.out.println("M3 method");
	}
}

public class Children extends GrandParent{
	
	public void m4() {
		System.out.println("M4 method");
	}

	public static void main(String[] args) {
		
		Child child = new Child();
		child.m1();
		child.m2();
		child.m3();
		
		Children children = new Children();
		children.m4();
		children.m1();

	}

}
