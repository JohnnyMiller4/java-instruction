import java.util.InputMismatchException;
import java.util.Scanner;

public class DataValidationApp {

	public static void main(String[] args) {
		System.out.println("Welcome!");
		String choice = "y";
		
		int min = 0;
		int max = 1000000;
		
		Scanner sc = new Scanner(System.in);
		
		while (!choice.equalsIgnoreCase("n")) {
		
		int length = getIntWithinRange("Enter length: ", sc, min, max);
		int width = getIntWithinRange("Enter width: ", sc, min, max);
		
		
		int area = length*width;
		int perimeter = ((width*2)+(length*2));
		
		System.out.println("Area: " + area);
		
		System.out.println("Perimeter: " + perimeter);
		
		System.out.print("Continue? (y/n): ");
		choice = sc.next();
	}
		System.out.println("Goodbye!");
	}

	private static int getInt(String string, Scanner sc) {
		boolean isValid = false;
		int i = 0;
		
		while (!isValid) {
			//exception catching
			try {
			System.out.print(string);
			i = sc.nextInt();
			isValid = true;
		}
		catch (InputMismatchException ime) {
			System.out.println("Invalid entry. Try again.");
			sc.nextLine(); //discard input
			continue;
		}
	}
		return i;
	}
	
	private static int getIntWithinRange(String string, Scanner sc, int min, int max) {
		int i = 0;
		boolean isValid = false;
		while (!isValid) {
			i = getInt(string, sc);
			if (i <= min) {
				System.out.println("Error! Number must be greater than " + min + ".");
			}
			else if (i >= max) {
				System.out.println("Error! Number must be less than " + max + ".");
			}
			else {
				isValid = true;
			}
		}
		return i;
	}
	
}