package com.myshop.home;

import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		while(true) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1 to add product\nPress 2 to see product\nPress 3 to update product\nPress 4 to delete product");
		int ch=sc.nextInt();
		switch(ch) {
		case 1:
			Operations.setData();
			break;
			
		case 2:
			Operations.getData();
			break;
			
		case 3:
			Operations.updateData();
			break;
			
		case 4:
			Operations.deleteData();
		}
		}
		// TODO Auto-generated method stub

	}

}
