package ui;

import java.sql.SQLException;
import java.util.List;

import business.Hero;
import db.HeroDB;
import util.Console;

public class HeroFightApp {
	private static HeroDB hdb = new HeroDB();

	public static void main(String[] args) throws SQLException {
		System.out.println("Welcome to the Hero Fight App!");
		
		//Version 2.0 notes:
		//Change the order of the if/else in the Fight option so that the DRAW! is at the bottom
		//Don't store the average in a database. Calculate the math in the HeroDB
		//Add a random number variable for the "storytelling margin of error." ->
		//-> Have each hero fight 100 times, and show the percentage of times each hero wins the battle.
		
		//new instance of Hero
		int command = 0;
				
		while (command != 7) {
			command = Console.getInt(getMenu(), 0, 8);
			
			switch (command) {
				case 1:
					//List
					List<Hero> hero = hdb.getAll();
					System.out.println("\nList of Heroes:");
					for (Hero h: hero) {
						System.out.println(h);
					}
					break;
				case 2:
					//Get
					System.out.println("\nGet Hero by ID");
					int id = Console.getInt("ID: ");
					Hero h = getHero(id);
					break;
				case 3:
					//Add - prompt user for hero values
					System.out.println("\nAdd a Hero");
					String name = Console.getString("Hero Name: ");
					String secretID = Console.getString("Secret Identity: ");
					double intelligence = Console.getDouble("Intelligence: ", 0, 8);
					double strength = Console.getDouble("Strength: ", 0, 8);
					double durability = Console.getDouble("Durability: ", 0, 8);
					double speed = Console.getDouble("Speed: ", 0, 8);
					double energyPro = Console.getDouble("Energy Projection: ", 0, 8);
					double fightSkill = Console.getDouble("Fighting Skills: ", 0, 8);
					double avg = ((intelligence + strength + durability + speed + energyPro + fightSkill)/6);
					
					h = new Hero(name, secretID, (double) intelligence, (double) strength, (double) durability, (double) speed, (double) energyPro, (double) fightSkill, avg);
					int rowCount = hdb.add(h);
					System.out.println(rowCount+" rows affected.");
					break;
				case 4:
					//Edit
					System.out.println("\nHero Editor");
					id = Console.getInt("ID: ");
					
					name = Console.getString("Hero Name: ");
					secretID = Console.getString("Secret Identity: ");
					intelligence = Console.getDouble("Intelligence: ", 0, 8);
					strength = Console.getDouble("Strength: ", 0, 8);
					durability = Console.getDouble("Durability: ", 0, 8);
					speed = Console.getDouble("Speed: ", 0, 8);
					energyPro = Console.getDouble("Energy Projection: ", 0, 8);
					fightSkill = Console.getDouble("Fighting Skills: ", 0, 8);
					avg = ((intelligence + strength + durability + speed + energyPro + fightSkill)/6);
					
					h = new Hero(id, name, secretID, (double) intelligence, (double) strength, (double) durability, (double) speed, (double) energyPro, (double) fightSkill, avg);
					rowCount = hdb.update(h);
					System.out.println(rowCount+" rows affected.");
					break;
				case 5:
					//Delete
					System.out.println("Hero Deleter");
					id = Console.getInt("ID: ");
					h = getHero(id);
					rowCount = hdb.delete(h);
					if (h!=null) {
						System.out.println("The hero " + h.getHeroName() + " was Thanos'd.");
					}
					else {
						System.out.println("No hero exists for ID: "+id);
					}
					
					break;
				case 6:
					//Hero Fight!
					int id1 = Console.getInt("\nID for Hero 1: ");
					String hero1 = getHeroName(id1);
					System.out.println("Hero 1 is " + hero1);
					
					int id2 = Console.getInt("\nID for Hero 2: ");
					String hero2 = getHeroName(id2);
					System.out.println("Hero 2 is " + hero2);
					
					double avg1 = getHeroAvg(id1);
					double avg2 = getHeroAvg(id2);
					
					System.out.println("\n"+hero1+"'s Average: "+avg1);
					System.out.println(hero2+"'s Average: "+avg2);
					
					if (avg1 > avg2) {
						System.out.println("\n" + hero1 + " defeats " + hero2 + "!");
					} else if (avg1 == avg2) {
						System.out.println("\nDraw!");
					}
					else {
						System.out.println("\n" + hero2 + " defeats " + hero1 +"!");
					}
				break;
				case 7:
					//exit
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
				"6 - Hero Fight\n" +
				"7 - Exit\n" +
				"\nEnter Command Number: ";
		return menu;
	}
	
	private static Hero getHero(int id) {
		Hero h = hdb.get(id);
		if (h!=null) {
			System.out.println("Hero: ");
			System.out.println(h);
		}
		else {
			System.out.println("No hero exists for ID: "+id);
		}
		return h;
	}
	
	private static String getHeroName(int id) {
		Hero h = hdb.get(id);
		String hName = null;
		if (h!=null) {
			hName = hdb.getHeroName(id);
		}
		else {
			System.out.println("No hero exists for ID: "+id);
		}
		return hName;
	}
	
	private static double getHeroAvg(int id) {
		Hero h = hdb.get(id);
		double hAvg = 0;
		if (h!=null) {
			hAvg = hdb.getAvg(id);
		}
		else {
			System.out.println("No hero exists for ID: "+id);
		}
		return hAvg;
	}

}
