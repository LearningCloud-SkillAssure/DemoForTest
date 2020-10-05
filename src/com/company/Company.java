package com.company;

import java.util.*;
import com.customer.Customer;
import com.items.Items;

public class Company {

	private String name;
	private List<Items> itemList=new ArrayList<Items>();
	private List<Customer> custList=new ArrayList<Customer>();
	
	public Company(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void addItems(Items item){
		itemList.add(item);
	}
	public void addCustomer(Customer c){
		custList.add(c);
	}
	public List<Items> getItems(){
		return itemList;
	}
	public List<Customer> getCustomers(){
		return custList;
	}
	public double getTotalWorthOfOrderPlaced(){
		double value=0.0;
		for(Customer c: custList){
			value+=c.getTotalAmountForCustomer();
		}
		return value;
		}
}
