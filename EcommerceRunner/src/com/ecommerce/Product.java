package com.ecommerce;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Product {
	
	int index =0;
Product [] product = new Product [3];
private int productID;
private String productName;
private static double productPrice =2.0;
private List<String> list = new ArrayList<String>();

public Product(int ID, String name) {
	this.productID = ID;
	this.productName = name;
}

public ArrayList<String> shoop(Customer cart) {
	ArrayList<String> inCart = cart.shoppingCart();
	System.out.println("What is the number of products in the shooping Cart at Product class?: " + inCart.size());
	return inCart;
}

public int getProductID() {
	return productID;
}

public void setProductID(int productID) {
	this.productID = productID;
}

public String[] getProductName() {
	return productName;
}

public void setProductName(String name) {
	this.productName[index] = name;
	index++;
}

public double getPrice() {
	return productPrice;
}

public void setPrice(double price) {
	productPrice = price;
}

public String[] uniqueWords(String[] productDisplay) {
	// TODO Auto-generated method stub
		//Transforming the input string into an array
		
		//String[] parts = productDisplay;//.trim().strip().split(" ");
		//Creating an object of the hashmap class
		HashMap<String,Integer> hashmap = new HashMap<String,Integer>();   
         
	        //use for loop to pull the elements of array to hashmap's key  
	        for (int j = 0; j < productDisplay.length; j++) {   
	            hashmap.put(productDisplay[j], j);   
	        }   
	        // use hashmap.keySet() for printing all keys of hashmap using it's keySet() method   
	        System.out.println("hash map key " + hashmap.keySet());   
	        return productDisplay;
	    } 

/*public int remove(String st) {
	
	HashMap<String,Integer> remainingProducts = new HashMap<String,Integer>();   
    
    //use for loop to pull the elements of array to hashmap's key  
	
	
	for(int i=0; i<this.productName.length; i++ ) {
		if(st == this.productName[i] || this.productName[i].equalsIgnoreCase(st)) {
			this.productName[i] = null;
			
		}else {
		    list.add(st);

		}
		
		
	}
	return list.size();
	
}*/
public ArrayList<String> removeItemIfInShoopingCart(Customer cart) {
	
	ArrayList<String> inCart = cart.shoppingCart();

	System.out.println("Please browse throth the products and add to the cart for payment");
	System.out.println();
	HashMap<String,Integer> hashmap = new HashMap<String,Integer>();   
    
    //use for loop to pull the elements of array to hashmap's key  
    for (int j = 0; j < productDisplay.length; j++) {   
        hashmap.put(productDisplay[j], j);   
    }   
    // use hashmap.keySet() for printing all keys of hashmap using it's keySet() method   
    System.out.println("hash map key " + hashmap.keySet());   
    return productDisplay;
	Scanner scanner = new Scanner(System.in);
	
	String st = scanner.nextLine();
	cart.add1(st);
	
	
	for(int i=0; i<cart.shoppingCart().size(); i++ ) {
		System.out.println("what is in here please: " + cart.shoppingCart().size());
		if(st == cart.shoppingCart().get(i) || cart.shoppingCart().get(i).equalsIgnoreCase(st)) {
			this.productName[i] = null;
			
		}else {
		    list.add(st);

		}
		
		System.out.println("What is the number of products in the shooping Cart at Product class?: " + cart.shoppingCart().size());
		
	}
	return inCart;
}
}
