package com.customer;

public class RegCustomer extends Customer {

	private double splDiscount;
	
	public RegCustomer(String name, double disc) {
		super(name);
		splDiscount=disc;
	}
	public double getSplDiscount() {
		return splDiscount;
	}
	public void setSplDiscount(double splDiscount) {
		this.splDiscount = splDiscount;
	}
	public double getTotalAmountForCustomer(){
		double total=0.0;
		total=super.getTotalAmountForCustomer();
		total-=(total*splDiscount/100);
		return total;
	}
}
