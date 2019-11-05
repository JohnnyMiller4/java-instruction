package ui;

import business.JUnitTesting;
import util.Console;

public class JUnitTestingApp {

	public static void main(String[] args) {
		System.out.println("Welcome!");

		JUnitTesting ju = new JUnitTesting();
		
		String command = "";
		
		while (!command.equalsIgnoreCase("3")) {
			command = Console.getString(getDisplayMenu());
		
			switch (command.toLowerCase()) {
			case "1":
			int nbr = Console.getInt("Enter a number: ");
			System.out.println(ju.square(nbr));
			break;
			case "2":
			String str = Console.getString("Type String: ");
			System.out.println("Number of A's in string: " + ju.countA(str));
			break;
			case "3":
			break;
			}
		}
		System.out.println("Goodbye!");
	}

	private static String getDisplayMenu() {
		String menu = "\nCOMMAND MENU\n" + 
				"1 - Square a number\n" + 
				"2 - Count A's\n" + 
				"3 - Exit\n" + 
				"\n" +
				"Command: \r";

		return menu;
	}
}
