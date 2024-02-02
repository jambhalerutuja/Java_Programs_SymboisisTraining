package com.project1;

import java.util.Scanner;

import com.project1.fridge.LG;
import com.project1.fridge.Sony;

public class Fridge {

	public static void getSony() {
		System.out.println("Press 1 for S1\nPress 2 for S2");
		Scanner sc=new Scanner(System.in);
		int ch_op=sc.nextInt();
		switch(ch_op) {
		case 1:
			Sony.getS1();
			break;
		
		case 2:
			Sony.getS2();
			break;
		}
	}
	
	public static void getLG() {
		System.out.println("Press 1 for L1\nPress 2 for L2");
		Scanner sc=new Scanner(System.in);
		int ch_op=sc.nextInt();
		switch(ch_op) {
		case 1:
			LG.getL1();
			break;
			
		case 2:
			LG.getL2();
			break;
		}
	}


}
