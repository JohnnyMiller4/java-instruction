import java.util.InputMismatchException;
import java.util.Scanner;

public class GuessingGameApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Guess the Number Name\n");
		String choice = "y";
		
		int min = 1;
		int max = 100;
		
		Scanner sc = new Scanner(System.in);
		
		int randNum = generateRandNum(max, min);
		int guessCount = 0;
		int guess;
		
		while (choice.equalsIgnoreCase("y")) {
		
		System.out.println("I'm thinking of a number between " + min +" and " + max +
							".\nTry to guess it.\n");
		System.out.println("RandNum: " + randNum);
		guess = 0;
		
		while (guess!=randNum) {
			guess = getIntWithinRange("Enter number: ", sc, min, max);
			guessCount++;
			int diff = guess - randNum;
			String msg = "";
			if(diff<=-10) {
				msg = "That's why too low!";
		}
			else if (diff<0) {
				msg = "Too low";
			}
			else if (diff>=10) {
				msg = "Way too high!";
			}
			else if (diff>0 ) {
				msg = "Too high";
			}
			else {
				//correct guess
				msg = "You got it in "+guessCount+" tries.\n";
				if (guessCount <= 3) {
					msg += "Great work! You are a mathematical wizard.";
				} else if (guessCount <=7) {
					msg += "Not too bad! You;ve got some potential.";
				}
				else {
					msg += "What took you so long? Maybe you should take some lessons...";
				}
			}
				System.out.println(msg);
			}
		
		choice = getString("\nContinue? (y/n): ", sc);
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
	private static String getString(String prompt, Scanner sc) {
		String s = "";
		//keep prompting until user enters y or n
		boolean isValid = false;
		while (!isValid) {
			System.out.print(prompt);
			s = sc.nextLine();
			//check for empty string
			if (s.equalsIgnoreCase("")) {
				System.out.println("Error... entry is required");
				continue;
			}
			else if (s.equalsIgnoreCase("y")||s.equalsIgnoreCase("n")) {
				isValid=true;
			}
			else {
				System.out.println("Error... only 'y' or 'n' is accepted.");
				continue;
			}
		}
		return s;
	}
	//private = this method is self-contained, will not be called upon in other apps
	private static int generateRandNum(int max, int min) {
		int r = (int)((Math.random()*max)+min);
		return r;
	}

}
