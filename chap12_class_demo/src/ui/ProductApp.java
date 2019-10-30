package ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import business.Product;
import util.Console;

public class ProductApp {

	public static void main(String[] args) {
		System.out.println("Hello!");
		
		Product p1 = new Product("java", "Murach's Java", 59.50);
		Product p2 = new Product("jsp", "Murach's Java Servlets and JSP", 55.50);
		Product p3 = new Product("mysql", "Murach's MySQL", 54.25);
		Product p4 = new Product("C#", "Murach's C#", 58);
		Product p5 = new Product("andr", "Murach's Android", 61.50);
		
		List<Product> products = new ArrayList<>();
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		products.add(p5);
		
		String code = Console.getString("Enter a code: ");
		
		//retieve the product that matches the code entered
		Product pdt = null;
		for (Product p: products) {
			if (p.getCode().equalsIgnoreCase(code)) {
				//thats my product
				pdt = p;
			}
		}
		
		System.out.println("Your product is: " + pdt);
		
			//same thing but with for loop
	//		for (int i = 0; i <products.size(); i++) {
	//			Product p = products.get(i);
	//			if (p.getCode().equalsIgnoreCase(code)) {
	//				pdt = p;
	//			}
	//		}
		
		//same thing, but with a HashMap
		System.out.println("\nGet product from map");		
		Map<String, Product> productsMap = new HashMap<>();
		productsMap.put("java", p1);
		productsMap.put("jsp", p2);
		productsMap.put("mysql", p3);
		productsMap.put("c#", p4);
		productsMap.put("andr", p5);
		
		System.out.println("Product selected: " +productsMap.get(code));
		
		//the key difference between an Array and a HashMap is that
		//you don't need to use the for-loop, but it's more difficult to
		//retrieve specific values
		
		
		System.out.println("Bye!");
	}

}
