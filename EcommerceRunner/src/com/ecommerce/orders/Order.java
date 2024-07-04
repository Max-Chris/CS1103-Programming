package com.ecommerce.orders;

import java.util.ArrayList;

import com.ecommerce.Customer;
import com.ecommerce.Product;

public class Order {
	private int orderID;
	private int orderTotal; 
	private String customerName;
	private String productName;
	
	
	public Order(int orderID) {
		this.orderID = orderID;
	}
	public int theTotalItems(Customer total) {
		orderTotal = total.itemsTotal();//iT.iitemsTotal();
		return orderTotal;
	}
	
	public String cusTomerName(Customer nameField) {
		customerName = nameField.getName();
		//String firsName = customer.setName("Ojo");
		return customerName;
		
	}
	
	public String toString() {
		//System.out.println(customerName + " " + " bought a total of: " + orderTotal);
		
		return customerName + " " + " bought a total of: " + orderTotal + " "+ "items";
	}
}

	