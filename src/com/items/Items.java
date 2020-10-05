package com.items;

import com.utility.IDGenerator;

public class Items {

	private String desc;
	private double rate;
	private int itemId;
	
	public Items(String desc, double rate) {
		this.desc = desc;
		this.rate = rate;
		itemId=IDGenerator.IDGen();
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}
	public int getItemId(){
		return itemId;
	}
}
