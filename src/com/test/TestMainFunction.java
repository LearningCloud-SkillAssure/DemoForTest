package com.test;

import com.company.*;
import com.customer.*;
import com.items.Items;
import com.orders.OrderItem;
import com.orders.Orders;

public class TestMainFunction {

	
	public static void main(String[] args) {

		//Company
		Company comp=new Company("SPENCERS");
		
		//Items
		Items t1=new Items("COMPUTER", 25000);
		Items t2=new Items("LAPTOP", 50000);
		Items t3=new Items("MACHINE", 30000);
		Items t4=new Items("FRIDGE", 20000);
		Items t5=new Items("AC", 15000);
		
		//Customers
		Customer c1=new Customer("Ankush");
		Customer c2=new Customer("Ashish");
		Customer c3=new Customer("Ankit");
		RegCustomer c4=new RegCustomer("Susan", 10);
		
		// add Customers
		comp.addCustomer(c1);
		comp.addCustomer(c2);
		comp.addCustomer(c3);
		comp.addCustomer(c4);
		
		//customer chooses item for order
		OrderItem oi1=new OrderItem(1,t1);
		OrderItem oi2=new OrderItem(2,t2);
		OrderItem oi3=new OrderItem(3,t3);
		OrderItem oi4=new OrderItem(1,t4);
		OrderItem oi5=new OrderItem(2,t5);
		OrderItem oi6=new OrderItem(4,t5);
		
		//customer chooses Order
		Orders order1=new Orders();
		order1.addOrderItems(oi1);
		order1.addOrderItems(oi2);
		
		Orders order2=new Orders();
		order2.addOrderItems(oi3);
		
		Orders order3=new Orders();
		order3.addOrderItems(oi4);
		order3.addOrderItems(oi5);
		
		Orders order4=new Orders();
		order4.addOrderItems(oi6);
		
		//customer places order
		c1.placeOrder(order1);
		c2.placeOrder(order2);
		c3.placeOrder(order3);
		c4.placeOrder(order4);
		
		//Display Details
		
		System.out.println("Company: "+comp.getName());
		for(Customer cust : comp.getCustomers()){
			System.out.println("\nCustomer ID: "+cust.getCustId()+"\nCustomer Name: "+cust.getName());
			for(Orders o: cust.getOrders()){
				System.out.println("Order List: ");
				for(OrderItem oi:o.getOrderItems()){
						System.out.println("\t\t Item: "+oi.getItem().getDesc()+"\tRate: "+oi.getItem().getRate()+" Quantity: "+oi.getQty()+" Total: Rs."+oi.getAmountForItem()+" (Excl. Discount)");
				}
			}
		}
		System.out.println("\n=============================================================================");
		System.out.println("\t\t\t\t\t       OrderValue Total: Rs."+comp.getTotalWorthOfOrderPlaced()+" (Incl. Discount)");
	}

}
