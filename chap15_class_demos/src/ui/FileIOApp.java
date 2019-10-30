package ui;

import java.io.IOException;
import java.nio.file.*;

public class FileIOApp {

	public static void main(String[] args) throws IOException {
		//p.463 create directory
		String dirString = "c:/temp/sub1/sub2";
		Path dirPath = Paths.get(dirString);
		if (Files.notExists(dirPath)) {
			//add throws exception... not the correct way, but oh well
			Files.createDirectories(dirPath);
		}
		else {
			System.out.println("Directory already exists");
		}

		//pg.463 create a file
		String fileString = "temp.txt";
		Path filePath = Paths.get(dirString, fileString);
		if (Files.notExists(filePath)) {
			Files.createFile(filePath);
		}
		else {
			System.out.println("File already exists, shitbird.");
		}
		
		System.out.println(filePath.getNameCount());	//number of steps in path. See the for-statement below
		System.out.println(filePath.toString());		//shows path
		System.out.println(filePath.toAbsolutePath()); //shows path
		System.out.println(Files.isWritable(filePath)); //is true
		System.out.println(Files.isHidden(filePath)); //is false
		
		System.out.println(filePath.getRoot());
		
		System.out.println("");
		
		for (int i=0; i < filePath.getNameCount(); i++) {
			System.out.println((i+1) +". " + filePath.getName(i));
		}
		
		System.out.println();
		
		//p.463 display files in a directory
		System.out.println("Directory " + dirPath.toAbsolutePath());
		System.out.println("Files: ");
		DirectoryStream<Path> dirStream = Files.newDirectoryStream(dirPath);
		for (Path p: dirStream) {
			if (Files.isRegularFile(p));
				System.out.println("\t"+p.getFileName());
		}
		
		
		
	}

}
