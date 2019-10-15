package chap7_projects3;

public class Console {
	public static void displayWelcome(int limit) {
		System.out.println("Guess the number!");
		System.out.println("I'm thinking of a number from 1 to " + limit);
		System.out.println();
	}

	public static int getRandomInt(int limit) {
		double d = Math.random() * limit; // d is >= 0.0 and < limit
		int randomInt = (int) d; // convert double to int
		randomInt++; // int is >= 1 and <= limit
		return randomInt;
	}
}