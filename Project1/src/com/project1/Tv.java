package com.project1;

import java.util.Scanner;

import com.project1.tv.LG;
import com.project1.tv.Sony;

public class Tv {

	public static void getSony() {
		System.out.println("Press 1 for S01\nPress 2 for S02");
		Scanner sc=new Scanner(System.in);
		int ch_op=sc.nextInt();
		switch(ch_op) {
		case 1:
			Sony.getS01();
			break;
		
		case 2:
			Sony.getS02();
			break;
		}
	}
	
	public static void getLG() {
		System.out.println("Press 1 for L898\nPress 2 for L954");
		Scanner sc=new Scanner(System.in);
		int ch_op=sc.nextInt();
		switch(ch_op) {
		case 1:
			LG.getL898();
			break;
			
		case 2:
			LG.getL954();
			break;
		}
	}

}
