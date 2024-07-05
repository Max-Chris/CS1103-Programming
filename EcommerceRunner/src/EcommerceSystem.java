import java.util.ArrayList;
import java.util.HashMap;

import com.ecommerce.Customer;
import com.ecommerce.Product;
import com.ecommerce.orders.Order;

public class EcommerceSystem {
	
	
	
	public static void main(String[] args) {
		
		Product [] product = new Product[3];
		product[0] = new Product (100, "PalmWine");
		product[1] = new Product (1001, "Ogogoro");
		product[2] = new Product (1003, "DryGin");
		
		//babies.name ="biscuit";
		ArrayList<String> shoppingCart;
		Order newCustomerOrder = new Order(1001) ;
		
		Product wineProd = new Product(assortedWines);
		// + "Customer ID: " +
		//String[] productDisplay = wineProd.getProductName();
		
		//System.out.println("The product's name is: " +productDisplay);
		
		//System.out.println("What is this: " + wineProd.uniqueWords(productDisplay));
		
		Customer cCustomer = new Customer(newCustomerOrder, wineProd, "Mr Man", 3);
		
		cCustomer.getName();
		newCustomerOrder.cusTomerName(cCustomer);
		
		//int torderTotal = cCustomer.orderToal();
		//String customerName = cCustomer.setName("Ojo");
		//String customerfirstName = cCustomer.getName();
		//int overAllTotal = cCustomer.itemsTotal();
		
		// TODO Auto-generated method stub
		//Creating instances of products, customers, and orders
		//final ArrayList<String> shoppingCart = new ArrayList<String>();
		//shoppingCart.add("ball");
		//Product p1 = new Product(1001, "mango", 2.0);

		//Customer mrMax = new Customer();
		//mrMax.add("Ball");
		double downPay = cCustomer.costOfEach();
		System.out.println("The product's price is: " + downPay);
		//System.out.println("The remaining produc is: " + wineProd.remove("DryGin"));
		
		
		System.out.println("what do we have in shooping cart? " + wineProd.removeItemIfInShoopingCart(cCustomer));
		//ArrayList<String> nameOfProduct = wineProd.removeItemIfInShoopingCart(cCustomer);
		newCustomerOrder.theTotalItems(cCustomer);
		//newCustomerOrder.setProductName(nameOfProduct.get(0));

		System.out.println("the summary of activity is: "  + newCustomerOrder.toString());
		
		

	}

}
