package com.ecommerce;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Customer {
	
	private int customerID;
	private String name;
	private ArrayList<String> shoppingCart;
	private int totalItems = 0;
	private double totalCost;
	

		//Implement methods to add and remove products from the shopping cart, 
		//calculate the total cost, and place orders.
	
	public double costOfEach(Product p) {
		p.getPrice();
		return p.getPrice();
	} 
	public int add(String ty) {
		shoppingCart.add(ty);
		//Stream<String> items = shoppingCart.stream()
		
		this.totalItems = this.totalItems + shoppingCart.size();
											
		return this.totalItems;
	}
	
	public ArrayList<String> remove(String ty) {
		shoppingCart.remove(ty);
		return shoppingCart;
	}

	public double totalCostMain(double pay) {
	this.totalCost = this.totalCost + pay;
	return this.totalCost;
}
}
