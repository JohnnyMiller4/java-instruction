import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class TipCalcApp {

	public static void main(String[] args) {
		System.out.print("Welcome to the Tip Calculator\n");
		
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		
		while (!choice.equalsIgnoreCase("n")) {
			System.out.print("\nCost of meal: $");
			BigDecimal meal = sc.nextBigDecimal();
			
			final BigDecimal tipPer1 = new BigDecimal(".15");
			BigDecimal tip1 = meal.multiply(tipPer1).setScale(2, RoundingMode.HALF_UP);
			BigDecimal totalTip1 = tip1.add(meal);
			System.out.println("\nTip amount: $" + tip1);
			System.out.println("Total amount: $" + totalTip1);
			
			final BigDecimal tipPer2 = new BigDecimal(".20");
			BigDecimal tip2 = meal.multiply(tipPer2).setScale(2, RoundingMode.HALF_UP);
			BigDecimal totalTip2 = tip2.add(meal);
			System.out.println("\nTip amount: $" + tip2);
			System.out.println("Total amount: $" + totalTip2);
			
			final BigDecimal tipPer3 = new BigDecimal(".25");
			BigDecimal tip3 = meal.multiply(tipPer3).setScale(2, RoundingMode.HALF_UP);
			BigDecimal totalTip3 = tip3.add(meal);
			System.out.println("\nTip amount: $" + tip3);
			System.out.println("Total amount: $" + totalTip3);
			
			System.out.print("\nContinue? (y/n): ");
			choice = sc.next();
			
			}
			
			System.out.print("\nGoodbye!");
	}
}
