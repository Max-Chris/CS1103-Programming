package com.in28minutes.oops.leve2;

public class CustomerRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address homeAddress = new Address("line1","city","40000");
		Customer customer = new Customer("Bingo", homeAddress);
		Address workAddress = new Address("line12","city","40000");

		customer.setWorkAddress(workAddress);
		System.out.println(customer);

	}

}
