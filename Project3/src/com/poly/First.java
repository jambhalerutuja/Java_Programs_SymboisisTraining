package com.poly;

public class First {
	public void m1() {
		System.out.println("no parameters");
		
	}
	
	public void m1(int a) {
		System.out.println("parametrs with int");
	}
	
	public void m1(int a,int b) {
		System.out.println("parametrs with int1 and int2");
		
	}
	public void m1(String a) {
		System.out.println("String parametrs");
	}
	public static void main(String[] args) {
		First ft=new First();
		ft.m1("KBP");
		ft.m1(10);
		ft.m1(1,2);
	}
	
	

}
