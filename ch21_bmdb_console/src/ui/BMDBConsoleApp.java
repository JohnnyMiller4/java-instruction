package ui;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

import business.Actor;
import business.Movie;
import db.ActorDB;
import db.MovieDB;
import util.Console;

public class BMDBConsoleApp {
	
	private static MovieDB movieDB = new MovieDB();
	private static ActorDB actorDB = new ActorDB();
	private static DateTimeFormatter formatter =
								DateTimeFormatter.ofPattern("yyyy-MM-d");

	public static void main(String[] args) {
		System.out.println("Welcome to the BMDB Console App!\n");

		int choice = 0;
		
		while (choice != 99) {
			
			choice = Console.getInt(getMenu(), 0, 100);
			switch (choice) {
			case 1:
				//list movies
				System.out.println("");
				List<Movie> movies = movieDB.list();
				System.out.println("List of movies:");
				for (Movie m: movies) {
					System.out.println(m);
				}
				break;
			case 2:
				//list actors
				List<Actor> actors = actorDB.list();
				System.out.println("List of actors:");
				for (Actor a: actors) {
					System.out.println(a);
				}
				break;
			case 3:
				//add movie
				System.out.println("Add a movie: ");
				String title = Console.getString("Title: ");
				String rating = Console.getString("Rating: ");
				int year = Console.getInt("Release Year: ");
				String director = Console.getString("Director: ");
				
				Movie m = new Movie(title, rating, year, director);
				int rc = movieDB.add(m);
				if (rc == 1) {
					System.out.println("\nMovie added successfully.");
				}
				else {
				System.out.println("Error");
				}
				break;
			case 4:
				//add actor
				System.out.println("Add an actor: ");
				String firstName = Console.getString("First Name: ");
				String lastName = Console.getString("Last Name: ");
				String gender = Console.getString("Gender (M/F): ");
				String bd_str = Console.getString("Enter Birthdate (YYYY-MM-DD): ");
				
				LocalDate bd = LocalDate.parse(bd_str, formatter);
				
				Actor a = new Actor(firstName, lastName, gender, bd);
				rc = actorDB.add(a);
				if (rc == 1) {
					System.out.println("\nActor added successfully.");
				}
				else {
					System.out.println("Error");
				}
				break;
			case 5:
				//update movie year
				m = getMovie();
				if (m!= null) {
					year = Console.getInt("Update movie year: ");
					m.setYear(year);
					rc = movieDB.update(m);
					if (rc==1) {
						System.out.println("Movie year updated successfully!");
					}
					else {
						System.out.println("Error updating movie year");
					}
				}
				else {
					System.out.println("Error... movie id doesn't exist");
				}
				break;
			case 6:
			//update actor birthdate
			a = getActor();
			if (a!= null) {
				bd_str = Console.getString("Update actor birthdate (YYYY-MM-DD): ");
				bd = LocalDate.parse(bd_str, formatter);
				a.setBirthdate(bd);
				rc = actorDB.update(a);
				if (rc==1) {
					System.out.println("Actor birthdate updated successfully!");
				}
				else {
					System.out.println("Error updating actor birthdate");
				}
			}
			else {
				System.out.println("Error... actor id doesn't exist");
			}
			break;
			case 7:
				//delete movie
				m = getMovie();
				if (m!= null) {
					rc = movieDB.delete(m);
					if (rc==1) {
						System.out.println("Movie deletion successfully!");
					}
					else {
						System.out.println("Error deleting movie");
					}
				}
				else {
					System.out.println("Error... movie id doesn't exist");
				}
				break;
			case 8:
				//delete movie
				a = getActor();
				if (a!= null) {
					rc = actorDB.delete(a);
					if (rc==1) {
						System.out.println("Actor deletion successfully!");
					}
					else {
						System.out.println("Error deleting actor");
					}
				}
				else {
					System.out.println("Error... actor id doesn't exist");
				}
				break;
			case 9:
				//get movie
				m = getMovie();
				if (m!=null) {
					System.out.println("Movie: ");
					System.out.println(m);
				} else {
					System.out.println("Error... movie id doesn't exist");
				}
				break;
			case 10:
				//get actor
				a = getActor();
				if (a!=null) {
					System.out.println("Actor: ");
					System.out.println(a);
				} else {
					System.out.println("Error... actor id doesn't exist");
				}
				break;
			case 99:
				//exit
				break;
			default:
				System.out.println("Invalid command.");
				break;
			}
		}
		
		System.out.println("\nGoodbye!");
	}
	
	private static String getMenu() {
		String menu = "\nCOMMAND MENU\n" + 
				"1  - List Movies\n" + 
				"2  - List Actors\n" + 
				"3  - Add Movie\n" +
				"4  - Add Actors\n" +
				"5  - Update Movie\n" +
				"6  - Update Actors\n" +
				"7  - Delete Movie\n" +
				"8  - Delete Actors\n" +
				"9  - Get Movie\n" +
				"10 - Get Actors\n" +
				"99 - Exit\n" +
				"\nEnter Command Number: ";
		return menu;
	}
	
	private static Movie getMovie() {
		int id = Console.getInt("Movie ID?: ", 0 , Integer.MAX_VALUE);
		Movie m = movieDB.get(id);
		return m;
	}
	
	private static Actor getActor() {
		int id = Console.getInt("Actor ID?: ", 0 , Integer.MAX_VALUE);
		Actor a = actorDB.get(id);
		return a;
	}

}
