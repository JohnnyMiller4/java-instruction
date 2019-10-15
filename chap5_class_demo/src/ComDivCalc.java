import java.util.InputMismatchException;
import java.util.Scanner;

public class ComDivCalc {

	public static void main(String[] args) {
		System.out.println("Welcome!");
		String choice = "y";
		
		Scanner sc = new Scanner(System.in);
		
		while (!choice.equalsIgnoreCase("n")) {
		
		int y = getInt("First digit: ", sc); //must be larger number
		int x = getInt("Second digit: ", sc); //must be smaller number
		
		//repeat until x = 0
		while (x!=0) {
			//subtract x from y repeatedly until y is less than x
			while (y>=x) {
				y -= x;
			}
				//Swap the values of x and y
				int temp = x;
				x=y;
				y=temp;
		}
		
		System.out.println("GCD is " + y);
		System.out.print("Continue? (y/n): ");
		choice = sc.next();
	}
		System.out.println("Goodbye!");

}
	
	private static int getInt(String prompt, Scanner sc) {
		boolean isValid = false;
		int i = 0;
		
		while (!isValid) {
			//exception catching
			try {
			System.out.print(prompt);
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
		//Alternate input validation can be found on page 165-169
		//This input validation is faster and less resource intensive
		//than error catching
	}
}