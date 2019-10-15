import java.util.Scanner;

public class FactCalcApp {

	public static void main(String[] args) {
		System.out.print("Welcome to the Factorial Calculator\n");
		
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		
		while (!choice.equalsIgnoreCase("n")) {
		
		System.out.print("\nEnter an integer \nbetween 0 and 10: ");
		int n = sc.nextInt();
		int a = 1;
		int fact = 1;
		
		while (a<=n) {
			fact*=a;
			a++;
		}
		
		System.out.println("\nThe factorial of " + n + " is " + fact + ".");
		
		System.out.print("\nContinue? (y/n): ");
		choice = sc.next();
		
		}
		
		System.out.print("\nGoodbye!");
	}

}
