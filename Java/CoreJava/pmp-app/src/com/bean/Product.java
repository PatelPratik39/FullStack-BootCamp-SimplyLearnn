package com.bean;

public class Product {
	
	private int pid;
	private String pName;
	private float price;
	
	

	public Product(int pid, String pName, float price) {
		super();
		this.pid = pid;
		this.pName = pName;
		this.price = price;
	}
	


	public int getPid() {
		return pid;
	}





	public void setPid(int pid) {
		this.pid = pid;
	}





	public String getpName() {
		return pName;
	}





	public void setpName(String pName) {
		this.pName = pName;
	}





	public float getPrice() {
		return price;
	}





	public void setPrice(float price) {
		this.price = price;
	}


}
