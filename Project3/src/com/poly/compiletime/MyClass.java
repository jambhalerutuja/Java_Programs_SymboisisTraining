package com.poly.compiletime;

public class MyClass {
	MyClass(){
		System.out.println("Default");
	}
	
	MyClass(int a,int b){
		System.out.println("int Parameters");
	}
	
	MyClass(String a){
		System.out.println("string parameters");
	}
	
	public static void main(String[] args) {
		MyClass obj=new MyClass(10,20);
		MyClass obj1=new MyClass("abc");
	}

}
