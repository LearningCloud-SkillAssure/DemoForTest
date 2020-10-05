package com.orders;

import com.items.Items;

public class OrderItem {

	private int qty;
	private Items item;
	
	public OrderItem(int quantity, Items item) {
		this.qty=quantity;
		this.item=item;
	}

	public int getQty() {
		return qty;
	}

	public Items getItem() {
		return item;
	}
	public double getAmountForItem(){
		return (item.getRate()*qty);
	}
}
