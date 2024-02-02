package com.project1;

import java.util.Scanner;

public class Operations {
	static Scanner sc=new Scanner(System.in);
	public static void getMobilesInfo(){
		System.out.println("Press 1 for APPLE\nPress 2 for SAMSUNG");
		int choose_option=sc.nextInt();
		switch(choose_option) {
		case 1:
			Mobiles.getApple();
			break;
			
		case 2:
			Mobiles.getSamsung();
			break;
		}
		

	}
	public static void getTVInfo(){
		System.out.println("Press 1 for SONY\nPress 2 for LG");
		int choose_option=sc.nextInt();
		switch(choose_option) {
		case 1:
			Tv.getSony();
			break;
			
		case 2:
			Tv.getLG();
			break;
		}
		

	}
	
	public static void getFridgeInfo(){
		System.out.println("Press 1 for SONY\nPress 2 for LG");
		int choose_option=sc.nextInt();
		switch(choose_option) {
		case 1:
			Fridge.getSony();
			break;
			
		case 2:
			Fridge.getLG();
			break;
		}
		

	}
	
	public static void getWashMachineInfo(){
		System.out.println("Press 1 for PANASONIC\nPress 2 for SAMSUNG");
		int choose_option=sc.nextInt();
		switch(choose_option) {
		case 1:
			WashingMachine.getPanasonic();
			break;
			
		case 2:
			WashingMachine.getSamsung();
			break;
		}
		

	}

}
