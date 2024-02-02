package com.myshop.home;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Operations {

	static Scanner sc=new Scanner(System.in);
	static Appliances ap=new Appliances();
	public static void setData() {
		System.out.println("Enter Product id");
		ap.setProductId(sc.nextInt());
		System.out.println("Enter Product name");
		ap.setProductName(sc.next());
		System.out.println("Enter Price");
		double pp = sc.nextDouble();
		double gst= pp*1.18;
		ap.setPrice(gst);
		//ap.setPrice(sc.nextDouble());
		//double price=sc.nextDouble();
//		double op=sc.nextDouble();
		//double gp=price*1.18;
//		ap.setPrice(gp);
		
//		System.out.println("with gst added"+ap.getGST());
		
		
		System.out.println("**********Product added succesfully*********");
	}
	
	public static void getData() {
		System.out.println("**********Product Info**********");
		System.out.println("Product_Id = "+ap.getProductId());
		System.out.println("Product_Name = "+ap.getProductName());
		System.out.println("Price = "+ap.getPrice());
		System.out.println("Price with gst = "+ap.getGST());
		System.out.println("**********Thank You**********");
	}
	public static void updateData() {
		System.out.println("Press 1 for update id\n Press 2 for update name\n Press 3 for update price");
		int ch=sc.nextInt();
		switch(ch) {
		case 1 :
			System.out.println("Enter new id");
			ap.setProductId(sc.nextInt());
			System.out.println("Id updated at:" +LocalDateTime.now());
			System.out.println("**********Thank You**********");
			break;
		case 2 :
			System.out.println("Enter new name");
			ap.setProductName(sc.next());
			System.out.println("Id updated at:" +LocalDateTime.now());
			System.out.println("**********Thank You**********");
			break;
			
		case 3:
		
			System.out.println("Enter new price");
			ap.setPrice(sc.nextDouble());
			System.out.println("Id updated at:" +LocalDateTime.now());
			System.out.println("**********Thank You**********");
			break;
		}
	}
	public static void deleteData() {
		ap=null;
	}
	

}
