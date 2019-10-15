import java.util.Scanner;

public class TravelTimeCalc {

	public static void main(String[] args) {
		System.out.println("Welcome to the Travel Time Calculator");
		
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {

		System.out.print("\nEnter miles: ");
		double miles = sc.nextDouble();
		
		System.out.print("Enter miles per hour: ");
		double mph = sc.nextDouble();
		
		double hours = miles/mph;
		double minutes = (miles%=mph)*60;
		minutes = minutes / mph;
		
		System.out.println("\nEstimated Travel Time");
		System.out.println("----------------------");
		
		System.out.println("Hours: " + (int) hours);
		System.out.println("Minutes: " + (int) minutes);
		
		System.out.print("\nContinue? (y/n): ");
		
		choice = sc.next();
		
		}
		
		System.out.print("\nGoodbye!");
	}

}
