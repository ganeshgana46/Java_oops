package com.dl.hierarhical;

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

public class Child extends GrandParent{
	public void m3() {
		System.out.println("M3 method");
	}

	public static void main(String[] args) {
		
		Child child = new Child();
		child.m1();
		child.m3();
		
		Parent parent = new Parent();
		parent.m1();
		parent.m2();
	}

}
