package com.dl.MethodOverload;

public class Eg2 {
	
	public static void gasStation(int petrolCost,int dieselCost) {
		System.out.println("Petrol Cost : " + petrolCost);
		System.out.println("Diesel Cost : " + dieselCost );
	}

	public void gasStation(float petrolCost,float dieselCost) {
		System.out.println("Petrol cost " + petrolCost);
		System.out.println("Diesel cost " + dieselCost);
	}
	public static void main(String[] args) {
		
		Eg2 eg2 = new Eg2();
		eg2.gasStation(100,120);
		eg2.gasStation(100.00f, 120.00f);
	}

}
