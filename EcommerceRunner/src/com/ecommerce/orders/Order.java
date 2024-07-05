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
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int theTotalItems(Customer total) {
		orderTotal = total.itemsTotal();//iT.iitemsTotal();
		System.out.println("This is what is contained here: " +orderTotal );
		return orderTotal;
	}
	
	public String cusTomerName(Customer nameField) {
		customerName = nameField.getName();
		//String firsName = customer.setName("Ojo");
		return customerName;
		
	}
	
	public String toString() {
		//System.out.println(customerName + " " + " bought a total of: " + orderTotal);
		
		return customerName + " " + " bought a total of: " + orderTotal + " "+ getProductName()+"\n"+" " ;
	}
	
}

	