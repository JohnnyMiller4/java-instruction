import java.util.Scanner;

public class DiceRollApp {

	public static void main(String[] args) {
		System.out.print("Dice Roller\n");
		
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		
		System.out.print("\nRoll the dice? (y/n): ");
		choice = sc.next();
		
		while (!choice.equalsIgnoreCase("n")) {
			double die1 = diceRoll();
			double die2 = diceRoll();
			int total = (int) die1 + (int) die2;
			
			System.out.println("Die 1: " + (int) die1);
			System.out.println("Die 2: " + (int) die2);
			System.out.println("Total: " + (int) total);
			
			if (((int) die1==1)&&((int) die2==1)) {
				System.out.println("Snake eyes!");
			}
			else if (((int) die1==6)&&((int) die2==6)) {
				System.out.println("Boxcars!");
			}
			
			System.out.print("\nRoll again? (y/n): ");
			choice = sc.next();
		
		}

	}
	//diceRoll static method
	private static double diceRoll() {
		double diceNum = ((Math.random() * 6) + 1);
		return diceNum;
	}}
