package com.dl.Variables;

public class Child implements Parent{

	public static void main(String[] args) {
		
		System.out.println(Parent.x);//20
		System.out.println(Parent.y);//30
		
		System.out.println(Child.x);
		System.out.println(Child.y);

	}

}
