import java.util.Scanner;

public class GradeConverter {

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		
		System.out.println("Welcome to the Letter Grade Converter");
		
		//do {
		while (choice.equalsIgnoreCase("y")) {
		
		System.out.print("Enter numerical grade: ");
		String st_grade = sc.nextLine();
			
		int grade = Integer.parseInt(st_grade);
		
		if (grade > 100) {
			System.out.println("Error");
							}
		else if (grade < 0) {
			System.out.println("Error");
							}
		else if (grade >= 88) {
			System.out.println("Letter grade: A");
								}
		else if (grade >= 80) {
			System.out.println("Letter grade: B");
								}
		else if (grade >= 67) {
			System.out.println("Letter grade: C");
								}
		else if (grade >= 60) {
			System.out.println("Letter grade: D");
								}
		else if (grade < 60) {
			System.out.println("Letter grade: F");
								}
		
		System.out.print("Continue? (y/n): ");
		
		choice = sc.nextLine();
												}
	
		//while (choice.equalsIgnoreCase("y"));
		
		sc.close();
		
		System.out.println("Goodbye!");
	}
}
