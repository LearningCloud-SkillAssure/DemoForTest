package com.orders;

import java.util.*;

import com.utility.IDGenerator;

public class Orders {

	private List<OrderItem> list=new ArrayList<OrderItem>();
	private int orderId;

	public Orders(){
		orderId=IDGenerator.IDGen();
	}
	public void addOrderItems(OrderItem o){
		list.add(o);
	}
	public List<OrderItem> getOrderItems(){
		return list;
	}
	public int getOrderId(){
		return orderId;
	}
	public double getAmountForOrders(){
		double total=0.0;
		for(OrderItem o:list){
			total+=o.getAmountForItem();
		}
		return total;
	}
}
