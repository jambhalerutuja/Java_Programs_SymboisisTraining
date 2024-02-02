package com.project1;

import java.util.Scanner;

public class App {
	static {
		System.out.println("**** X ELECTRONICS ****");
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1 for MOBILES\nPress 2 for TV\nPress 3 for REFRIGERATOR\nPress 4 for WASHING MACHINE");
		int choose_option=sc.nextInt();
		switch(choose_option) {
		case 1:
			Operations.getMobilesInfo();
			break;
			
		case 2:
			Operations.getTVInfo();
			break;
		
		case 3:
			Operations.getFridgeInfo();
			break;
			
		case 4:
			Operations.getWashMachineInfo();
			break;
		}

	}

}
