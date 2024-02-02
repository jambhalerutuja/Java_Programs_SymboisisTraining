package com.myshop.home;

public class Appliances {
	private int product_id;
	private String product_name;
	private double price;
	private double gst;
	
	
	public void setProductId(int product_id) {
		this.product_id=product_id;
	}
	public int getProductId() {
		return product_id;
	}
	
	public void setProductName(String product_name) {
		this.product_name=product_name;
	}
	public String getProductName() {
		return product_name;
	}
	
	public void setPrice(double price) {
		this.price=price;
	}
	public double getPrice() {
		return price;
	}
	
	public void setGst(double gst) {
		this.gst=gst;
	}
	public double getGST() {
		
		return gst;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
