package com.addition;

import java.util.Scanner;

public class Calculations {
	
	public void add(int a, int b) {
		int c=a+b;
		System.out.println("Addition= "+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculations cl=new Calculations();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st number");
		int num1=sc.nextInt();
		
		System.out.println("Enter 2nd number");
		int num2=sc.nextInt();
		
		cl.add(num1, num2);
	}

}
