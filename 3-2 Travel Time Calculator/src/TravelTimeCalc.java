import java.util.Scanner;

public class TravelTimeCalc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		
		System.out.println("Welcome to the Travel Time Calculator");
		
		while (choice.equalsIgnoreCase("y")) {

		System.out.print("\nEnter miles: ");
		String st_miles = sc.nextLine();
		
		int miles = Integer.parseInt(st_miles);
		
		System.out.print("Enter miles per hour: ");
		String st_mph = sc.nextLine();
		
		int mph = Integer.parseInt(st_mph);
		
		int travelHours = miles/mph;
		double travelMinutes = (miles%=mph)*60;
		double minutes = travelMinutes / mph;
		
		System.out.println("\nEstimated Travel Time");
		System.out.println("----------------------");
		
		System.out.println("Hours: " + travelHours);
		System.out.println("Minutes: " + (int) minutes);
		
		System.out.print("\nContinue? (y/n): ");
		
		choice = sc.nextLine();
		
		}
		
		System.out.print("\nGoodbye!");
	}

}
