package chap7_projects3;

import java.util.Scanner;

public class GuessNumberApp {

	public static void main(String[] args) {
		final int LIMIT = 10;
		
		Console console = new Console(LIMIT);
		
		console.displayWelcome(LIMIT);
		int number = console.getRandomInt(LIMIT);

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int count = 1;
		int guess = 0;

		while (true) {

			System.out.print("Your guess: ");


			if (sc.hasNextInt()) {
				guess = sc.nextInt();
				sc.nextLine(); // discard input
			} else {
				System.out.println("Invalid entry. Try again.");
				sc.nextLine(); // discard input
				continue;
			}

			if (guess < 1 || guess > LIMIT) {
				System.out.println("Invalid guess. Try again.");
				continue;
			}

			if (guess < number) {
				System.out.println("Too low.");
			} else if (guess > number) {
				System.out.println("Too high.");
			} else {
				System.out.println("You guessed it in " + count + " tries.\n");
				break;
			}
			count++;
		}
		System.out.println("Bye!");

	}

}
