package ui;

import util.Console;

public class BattingStatsApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Batting Average Calculator");
		
		String answer = "y";
		
		while (answer.equalsIgnoreCase("y")) {
		
		int atBat = Console.getInt("\nEnter number of \ntimes up to bat: ", 0, 30);
		double batTotal = 0;
		int batsEarned = 0;
		
		System.out.println("\n0 = out, 1 = single, 2 = double, \n3 = triple, 4 = home run\n");
		
		double[] atBatResults = new double[atBat];
		
		for (int i=0; i<atBatResults.length; i++) {
			int m = Console.getInt("Results for at-bat " + (i+1) + ": ", -1, 5);
			batTotal += m;
			atBatResults[i] = m;
		}
		
		for(int x = 0; x < atBatResults.length; x++) {
			   if(atBatResults[x] > 0){
			      batsEarned += 1;
			   }
			}
		
		double batAv = (double) batsEarned / (double) atBat;
		double slug = batTotal / (double) atBat;
		
		System.out.println("\nBatting average: " + batAv);
		System.out.println("Slugging percent: " + slug);
		
		answer = Console.getString("\nNew player? (y/n): ");
		}
		System.out.println("\nGoodbye!");
	}

}
