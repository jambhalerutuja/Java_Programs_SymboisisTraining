package com.project1;

import java.util.Scanner;

import com.project1.washingmachine.Panasonic;
import com.project1.washingmachine.Samsung;

public class WashingMachine {
	public static void getPanasonic() {
		System.out.println("Press 1 for Panso12\nPress 2 for Panaso24");
		Scanner sc=new Scanner(System.in);
		int choose_option=sc.nextInt();
		switch(choose_option) {
		case 1:
			Panasonic.getPS01();
			break;
			
		case 2:
			Panasonic.getPS02();
			break;
		}
	}
		
	public static void getSamsung() {
		System.out.println("Press 1 for S01\nPress 2 for S02");
		Scanner sc=new Scanner(System.in);
		int choose_option=sc.nextInt();
		switch(choose_option) {
		case 1:
			Samsung.getS01();
			break;
				
		case 2:
			Samsung.getS02();
			break;
		}// TODO Auto-generated method stub

	}

}
