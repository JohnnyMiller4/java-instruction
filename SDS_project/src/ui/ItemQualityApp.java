package ui;

import java.util.List;

import business.Item;
import db.ItemDB;
import util.Console;

public class ItemQualityApp {

	public static void main(String[] args) {
		String answer = "y";
		
		//initialize stuff
		ItemDB idb = new ItemDB();
		idb.add(new Item("+5 Dexterity Vest", 10, 20));
		idb.add(new Item("Aged Brie", 2, 0));
		idb.add(new Item("Elixir of the Mongoose", 5, 7));
		idb.add(new Item("Sulfuras", 0, 80));
		idb.add(new Item("Backstage passes", 15, 20));
		idb.add(new Item("Conjured", 3, 6));
		
		while (answer.equalsIgnoreCase("y")) {
			System.out.println("Items:");
			System.out.println("----------------------");
			printItemsToConsole(idb.getItemList());
				
			answer = Console.getString("\nAdvance day? (y/n): ");
			
			idb.advanceDay();
			System.out.println();
		}
	}
	
	public static void printItemsToConsole(List<Item> itemList) {
		itemList.stream().forEach(i -> System.out.println(i));
	}

}
