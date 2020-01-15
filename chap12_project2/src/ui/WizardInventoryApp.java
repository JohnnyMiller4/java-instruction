package ui;

import java.util.ArrayList;
import java.util.List;

import util.Console;

public class WizardInventoryApp {
	
private static List<String> items = new ArrayList<>();
	
	public static void main(String[] args) {
		items.add("wooden staff");
		items.add("wizard hat");
		items.add("cloth shoes");
		
		System.out.println("The Wizard Inventory game");
		String command = "";
		
		while (!command.equalsIgnoreCase("exit")) {
			command = Console.getString(getDisplayMenu());
			
			switch (command.toLowerCase()) {
			case "show":	
				//list items
				//each item on its own line
				//prefix with (index number + 1)
				for (int i=0; i < items.size(); i++) {
					System.out.println((i+1)+". "+items.get(i));
				}
				break;
			case "grab":
				//add an item
				if (items.size()>3) {
					System.out.println("You can't carry any more items.");
				}
				else {
				String addItem = Console.getString("Item name: ");
				items.add(addItem);
				System.out.println(addItem + " was added");
				}
				break;
			case "edit":
				//edit an item
				String item = getItem();
				String updItem = Console.getString("Updated name: ");
				int idx = items.indexOf(item);
				items.set(idx, updItem);
				System.out.println("Item number "+(idx+1)+" was updated.");
				break;
			case "drop":
				//delete an item
				item = getItem();
				items.remove(item);
				System.out.println(item + " was dropped.");
				break;
			case "exist":
				//exit the app
				break;
			default:
				System.out.println("Invalid command. Try again.");
				break;
				
				
			}
		
		}
		
		System.out.println("\nGoodbye!");
	}

	//prompt use for an item number and return item
	private static String getItem() {
		int itemNbr = Console.getInt("Number: ", 0, items.size()+1);	
		String str = items.get(itemNbr-1);
		return str;
	}
	
	private static String getDisplayMenu() {
		String menu = "\nCOMMAND MENU\n" + 
						"show - Show all items\n" + 
						"grab - Grab an item\n" + 
						"edit - Edit an item\n" + 
						"drop - Drop an item\n" + 
						"exit - Exit program" +
						"\n" +
						"\nCommand: \r";
		
		return menu;
	}
	
}
