package com.dl.one;

public class Child extends Parent implements GrandParent{

	@Override
	public void m1() {
		System.out.println("m1 method");
	}

	@Override
	public void m2() {
		System.out.println("m2 method");
	}
	
	public void m4() {
		System.out.println("m4 method");
	}
	
	public static void main(String[] args) {
		GrandParent gp = new Child();
		gp.m1();
		gp.m2();
		
		Parent p = new Child();
		p.m3();
		p.m4();
	}

}
