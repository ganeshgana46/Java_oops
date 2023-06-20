package com.dl.mutipleInterfaces;

public class User {

	public static void main(String[] args) {
		
		GamingConsole1 game = new MarioGame();
		
		game.up();
		game.down();
		
		GamingConsole2 game1 = new MarioGame();
		game1.left();
		game1.right();
		
	}

}
