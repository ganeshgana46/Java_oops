package com.dl.mutipleInterfaces;

public class MarioGame implements GamingConsole1,GamingConsole2{

	@Override
	public void left() {
		System.out.println("backward");
		
	}

	@Override
	public void right() {
		System.out.println("forward");
	}

	@Override
	public void up() {
		System.out.println("jump");
	}

	@Override
	public void down() {
	System.out.println("fall");
	}

}
