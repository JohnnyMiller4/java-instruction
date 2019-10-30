package ui;

import java.sql.SQLException;
import java.util.List;

import business.Stuffy;
import db.StuffyDB;
import util.Console;

public class StuffyDispenserApp {
	private static StuffyDB sdb = new StuffyDB();

	public static void main(String[] args) throws SQLException {
		System.out.println("Welcome to the Stuffy Dispenser App");
		
		//new instance of stuffy
		int command = 0;
		
		while (command != 6) {
			command = Console.getInt(getMenu(), 0, 7);
			
			switch (command) {
				case 1:
					//List
					List<Stuffy> stuffy = sdb.getAll();
					System.out.println("List of movies:");
					for (Stuffy s: stuffy) {
						System.out.println(s);
					}
					break;
				case 2:
					//Get
					int id = Console.getInt("ID: ");
					Stuffy s = getStuffy(id);
					break;
				case 3:
					//Add - prompt user for stuffy values
					String type = Console.getString("Type: ");
					String color = Console.getString("Color: ");
					String size = Console.getString("Size: ");
					int limbs = Console.getInt("Limbs: ");
					
					s = new Stuffy(type, color, size, limbs);
					int rowCount = sdb.add(s);
					System.out.println(rowCount+" rows affected.");
					break;
				case 4:
					//Edit
					id = Console.getInt("ID: ");
					
					type = Console.getString("Type: ");
					color = Console.getString("Color: ");
					size = Console.getString("Size: ");
					limbs = Console.getInt("Limbs: ");
					
					s = new Stuffy(id, type, color, size, limbs);
					rowCount = sdb.update(s);
					System.out.println(rowCount+" rows affected.");
					break;
				case 5:
					//Delete
					id = Console.getInt("ID: ");
					s = getStuffy(id);
					rowCount = sdb.delete(s);
					if (s!=null) {
						System.out.println("The stuffy " + s.getType() + " was removed.");
					}
					else {
						System.out.println("No stuffy exists for ID: "+id);
					}
					
					break;
				case 6:
					//Exit
					
					break;
				default:
					//Error
					System.out.println("Invalid command!");
					break;
			}
		}
		System.out.println("\nGoodbye!");
	}
	
	private static String getMenu() {
		String menu = "\nCOMMAND MENU\n" + 
				"1 - List\n" + 
				"2 - Get\n" + 
				"3 - Add\n" +
				"4 - Edit\n" +
				"5 - Delete\n" +
				"6 - Exit\n" +
				"\nEnter Command Number: ";
		return menu;
	}
	
	private static Stuffy getStuffy(int id) {
		Stuffy s = sdb.get(id);
		if (s!=null) {
			System.out.println("Stuffy: ");
			System.out.println(s);
		}
		else {
			System.out.println("No stuffy exists for ID: "+id);
		}
		return s;
	}
	
}
