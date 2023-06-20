package com.dl.Block;

public abstract class Client {
	
	static {
		System.out.println("static block");
	}
	
	{
		System.out.println("instance block");
	}

	public static void main(String[] args) {
		
		
	}

}
