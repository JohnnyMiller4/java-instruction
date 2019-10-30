package ui;

import java.util.Arrays;

import business.Product;

public class ArraysDemoApp {

	public static void main(String[] args) {
		double[] prices = new double[4];
		prices[0] = 4.99;
		prices[1] = 7.99;
		prices[2] = 25.99;
		prices[3] = 1.99;
		//prices[4] = .99; exception error; elements out of bounds
		
		//System.out.println(prices[3]); Displays 25.99
		
		for (int i = 0; i < prices.length; i++) {
			System.out.println(prices[i]);
		}
		
		String[] names = {"Sean", "Johnny", "Matt", "Chea", "John", "Erin"};
		
		for (int i=0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		//get inputs in array
//		String firstName = null;
//		String lastName = null;
//		Double gradeDouble = 0;
//		String grade = null
//		
//		String[] student = new String[500];
//		student[i]= new String(firstName, lastName, grade);
//		use the for-loop to increment student[i]
//		first/lastName = Console.getString("Enter [first/last] name: ");,
//		grade = Console.getDouble("Enter grade: ");, then convert double to String
		
		int[] nbrs = new int[10];
		for(int i=0; i < 10; i++) {
			nbrs[i] = i*10;
		}
		for (int i=0; i<10; i++) {
			System.out.println(nbrs[i]);
		}
		
		Product p1 = new Product("java", "Murach's Java Programming", 59.50);
		Product p2 = new Product("andr", "Murach's Android Programming", 58.50);
		
		Product[] pdts = {p1, p2};
		
		for (int i=0; i<pdts.length; i++) {
			System.out.println(pdts[i]);
		}
		

		//Magic Math!
		double sum = 0;
		for (int i = 0; i < prices.length; i++) {
			sum += prices[i];
		}
		System.out.println("sum = "+sum);
		System.out.println("avg = "+sum/prices.length);
		
		//Enhanced for-loop
		for (int n: nbrs) {
			System.out.println(n);
		}
		//You do NOT want to do this when the index position is important
		
		//binary search on nbrs
		int idx = Arrays.binarySearch(nbrs, 40);
		System.out.println("Position of 40 in nbrs = "+idx); //nbrs[4]
		
		//sort the array of prices
		Arrays.parallelSort(prices);
		for (double d: prices) {
			System.out.println(d);
		}
		
		//sort the array of names
		Arrays.sort(names);
		for (String s: names) {
			System.out.println(s);
		}
		//the sort array sorts lower-case names after upper-case names
		
		//sort products (pdts)
		Arrays.sort(pdts);
		for (Product p: pdts) {
			System.out.println(p);
		}
		
		//create a 3x3 array
		String[][] ticTacToeGrid = new String[3][3];
		for (int r=0; r<ticTacToeGrid.length; r++) {
			//process row
			for (int c=0; c<ticTacToeGrid[r].length; c++) {
				//process column
				ticTacToeGrid[r][c] = r+"-"+c;
			}
		}
		
		String table = "";
		//display 3x3 array
		for (int r=0; r<ticTacToeGrid.length; r++) {
			//process row
			String row = "";
			for (int c=0; c<ticTacToeGrid[r].length; c++) {
				//process column
				row+=ticTacToeGrid[r][c]+" ";
			}
			row += "\n";
			table += row;
		}
		
		System.out.println(table);
	}

}
