package ui;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CountriesIOApp {

	public static void main(String[] args) throws IOException {
		String dirString = "C:/repos/java-instruction/chap15_project1/src";
		Path dirPath = Paths.get(dirString);
		if (Files.notExists(dirPath)) {
			//add throws exception... not the correct way, but oh well
			System.out.println("creating directores...");
			Files.createDirectories(dirPath);
		}
		else {
			System.out.println("Directory already exists");
		}

		//pg.463 create a file
		String fileString = "countries.txt";
		Path filePath = Paths.get(dirString, fileString);
		if (Files.notExists(filePath)) {
			System.out.println("Creating new file...");
			Files.createFile(filePath);
		}
		else {
			System.out.println("File already exists, shitbird.");
		}

	}

}
