
public class NumberCheckerApp {

	public static void main(String[] args) {
		String choice = "y";
		
		System.out.println("Welcome to the Odd/Even Checker!");
		
		MyConsole con = new MyConsole();
		
		while (choice.equalsIgnoreCase("y")) {
		int num = con.getInt("\nEnter an integer: ");

		if((num%2)==0) {
			System.out.println("The number " + num + " is even.");	
		} else {
			System.out.println("The number " + num + " is odd.");
		}
		
		choice = con.getString("\nContinue? (y/n): ");
		
		}
		System.out.println("Goodbye!");
	}
}
