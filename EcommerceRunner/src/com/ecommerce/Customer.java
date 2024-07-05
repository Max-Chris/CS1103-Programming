package com.ecommerce;

import java.util.ArrayList;
import java.util.stream.Stream;

import com.ecommerce.orders.Order;

public class Customer {
	
	private Order order;
	private Product product;
	private int customerID;
	private String name;
	public ArrayList<String> shoppingCart;
	private int totalItems = 0;
	private double totalCost;
	
	public Customer(Order order,Product product, String name, int totalItems) {
		this.order = order;
		this.product = product;
		this.customerID = customerID;
		this.name = name;
		this.totalItems = totalItems;
				
		this.shoppingCart = new ArrayList<>();
	}
		//Implement methods to add and remove products from the shopping cart, 
		//calculate the total cost, and place orders.
	
	public double costOfEach() {
		
		return product.getPrice();
	} 
	public int add1(String ty) {
		shoppingCart.add(ty);
		//Stream<String> items = shoppingCart.stream()
								
		return this.shoppingCart.size();
	}
	public int itemsTotal() {
		int inShoopingCart = shoppingCart.size();//this.totalItems + 
		return inShoopingCart;
		
	}
	
	/*public ArrayList<String> remove(String ty) {
		shoppingCart.remove(ty);
		return shoppingCart;
	}*/
	
	public double totalCostMain(double pay) {
	this.totalCost = this.totalCost + pay;
	return this.totalCost;
}
	public int orderToal() {
		return this.totalItems;
	}
	public String getName() {
		return name;
	}
	
	

	public ArrayList<String> shoppingCart() {
		// TODO Auto-generated method stub
		return shoppingCart;	
	}
}
