package com.dl.Interface;

public class User {

	public static void main(String[] args) {
		
		MarioGame game = new MarioGame();
		game.up();
		game.down();
		game.left();
		game.right();
		
		GamingConsole game1 = new MarioGame();
		game1.up();//f3 keyword
		game1.down();
		game1.left();
		game1.right();

	}

}
