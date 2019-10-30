package ui;

import java.io.*;

import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

import business.Country;
import util.Console;

public class CountriesListManagerApp {
	private static List<Country> cntry = new ArrayList<>();
	private static File countriesFile;
	
	

	public static void main(String[] args) throws IOException {
		System.out.println("Welcome!");
		String command = "";
		
		//establish a file path
		Path countriesPath = Paths.get("countries.txt");
		if (Files.notExists(countriesPath)) {
			//add throws exception... not the correct way, but oh well
			Files.createFile(countriesPath);
		}
		//create an instance of a file
		countriesFile = countriesPath.toFile();
		loadCountriesFile();
		
		while (!command.equalsIgnoreCase("3")) {
			
			command = Console.getString(getDisplayMenu());
			
			switch (command.toLowerCase()) {
			case "1":
				System.out.println("Countries:");
				for (Country c: cntry) {
					System.out.println(c.getName());
				}
			break;
			case "2":
				//add new country
				String cntryName = Console.getString("\nEnter country: ");
				Country c = new Country(cntryName);
				cntry.add(c);
				//save all products to file
				saveAll();
				System.out.println("New country was added.");
			break;
			case "3":
			//exit the app
			break;
			default:
			System.out.println("\nInvalid command. Try again.");
			break;
			}
		}
		System.out.println("\nGoodbye!");
	}

	private static void loadCountriesFile() throws FileNotFoundException, IOException {
		//read data from an input file
		BufferedReader in = new BufferedReader(
				new FileReader(countriesFile));
		String line = in.readLine();
		while (line != null) {
			System.out.println(line); //prints String line
			Country c = new Country(line);
			cntry.add(c);
			line = in.readLine();
		}
		
		in.close();
	}
	
	private static boolean saveAll() {
		try (PrintWriter out = 	new PrintWriter(
				new BufferedWriter(
				new FileWriter(countriesFile/*, true*/)))) {
							//append = true, overwrite = blank)
			for (Country c: cntry) {
				out.print(c.getName()+"\n");
			}
			return true;
			
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}

	private static String getDisplayMenu() {
		String menu = "\nCOMMAND MENU\n" + 
				"1 - List countries\n" + 
				"2 - Add a country\n" + 
				"3 - Exit\n" + 
				"\nEnter menu number: ";
		return menu;
	}

//	public ArrayList<String> getCountries() {
//		//add new country
//		String cntryName = Console.getString("\nEnter country: ");
//		Countries pdt = new Countries(cntryName);
//		Country.add(pdt);
//		//save all products to file
//		saveAll();
//		return cntryName;
//	}
}
