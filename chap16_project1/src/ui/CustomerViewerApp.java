package ui;

import business.Customer;
import db.CustomerDB;
import db.NoSuchCustomerException;
import util.Console;

public class CustomerViewerApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Customer Viewer App!\n");

		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			int custNbr = Console.getInt("\nEnter a customer number: ");
			
			Customer c;
			try {
				c = CustomerDB.getCustomer(custNbr);
				System.out.println();
			System.out.println(c.getNameAndAddress());
			} catch (NoSuchCustomerException e) {
				System.out.println(e.getMessage());
			}
			
			choice = Console.getString("\nDisplay another customer? (y/n): ");
		}
		
		System.out.println("\nGoodbye!");
	}

}
