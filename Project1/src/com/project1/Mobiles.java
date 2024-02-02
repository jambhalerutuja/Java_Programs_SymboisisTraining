package com.project1;

import java.util.Scanner;

import com.project1.mobiles.Apple;
import com.project1.mobiles.Samsung;

public class Mobiles {

	public static void getApple() {
		System.out.println("Press 1 for IPHONE12\nPress 2 for IPHONE13");
		Scanner sc=new Scanner(System.in);
		int choose_option=sc.nextInt();
		switch(choose_option) {
		case 1:
			Apple.getIPHONE12();
			break;
			
		case 2:
			Apple.getIPHONE13();
			break;
		}
	}
		
	public static void getSamsung() {
		System.out.println("Press 1 for S21\nPress 2 for S23");
		Scanner sc=new Scanner(System.in);
		int choose_option=sc.nextInt();
		switch(choose_option) {
		case 1:
			Samsung.getS21();
			break;
				
		case 2:
			Samsung.getS23();
			break;
		}// TODO Auto-generated method stub

	}
	

	
	
}


