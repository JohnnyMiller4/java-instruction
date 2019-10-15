import java.util.Scanner;

public class GradeConverterApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		
		System.out.println("Welcome to the Letter Grade Converter");
		
		//do {
		while (choice.equalsIgnoreCase("y")) {
		
		System.out.print("Enter numerical grade: ");
		String grade = sc.next();
		
		
		Console.getInt(grade);
		
		Grade letterGrade = new Grade();
		
		letterGrade.getLetter();
		
		System.out.print("Continue? (y/n): ");
		
		choice = sc.nextLine();
												}
	
		//while (choice.equalsIgnoreCase("y"));
		
		sc.close();
		
		System.out.println("\nGoodbye!");

	}

}
