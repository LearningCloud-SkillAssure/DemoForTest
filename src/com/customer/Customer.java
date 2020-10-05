package com.customer;

import java.util.*;

import com.orders.Orders;
import com.utility.IDGenerator;

public class Customer {

	private String name;
	private int custId;
	private List<Orders> orderList=new ArrayList<Orders>();
	
	public Customer(String name){
		this.name=name;
		custId=IDGenerator.IDGen();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}
	public List<Orders> getOrders(){
		return orderList;
	}
	public void placeOrder(Orders order){
		orderList.add(order);
	}
	public double getSplDiscount() {
		return 0;
	}
	public double getTotalAmountForCustomer(){
		double total=0.0;
		for(Orders o:orderList){
			total+=o.getAmountForOrders();
		}
		return total;
	}
}
