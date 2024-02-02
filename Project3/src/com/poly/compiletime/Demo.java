package com.poly.compiletime;

public class Demo {
	public static void m1() {
		System.out.println("no paramters");
	}
	public static void m1(int a) {
		System.out.println("int parametes");
	}
	public static void m1(String a) {
		System.out.println("String parameters");
	}
	public static void main(String[] args) {
		Demo.m1();
		Demo.m1(10);
		Demo.m1("rutuja");
	}
}
