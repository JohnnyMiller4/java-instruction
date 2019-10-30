package ui;

import java.text.NumberFormat;

import business.Account;
import business.CheckingAccount;
import business.SavingsAccount;
import util.Console;

public class AccountBalanceApp {
//formats the values into dollar amounts
static NumberFormat cf = NumberFormat.getCurrencyInstance();

	public static void main(String[] args) {
		System.out.println("Welcome to the Account Balance Calculator!");

		//import from business package. Find inputs by hovering over parenthesies
		//								and hitting ctrl-space
		//						 CheckingAccount(Balance, Fee)
		CheckingAccount ca = new CheckingAccount(1000, 1);
		//						SavingsAccount(Balance, monthlyInterestRate)
		SavingsAccount sa = new SavingsAccount(1000, .01);
		
		System.out.println("\nStarting Balances: ");
		displayBalances(ca, sa);
		
		System.out.println("\nEnter transactions for the month: ");
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			//txn = transaction (withdraw or deposit)
			String txn = Console.getString("\nWithdraw or Deposit? (w or d): ");
			//acct = account (checking or savings)
			String acct = Console.getString("Checking or Savings? (ca or sa): ");
			//amt = amount (to deposit or withdraw)
			double amt = Console.getDouble("Amount?: ", 0, Double.POSITIVE_INFINITY);
			
			//import Account class
			Account a = null;
			//Determine value of a (less code bloat)
			if (acct.equalsIgnoreCase("ca")) {
				a = ca;
			} else if (acct.equalsIgnoreCase("sa")) {
				a = sa;
			} else {
				System.out.println("Invalid Account type.");
				continue;
			}
			
			if (txn.equalsIgnoreCase("w")) {
				a.withdraw(amt);
			} else if (txn.equalsIgnoreCase("d")) {
				a.deposit(amt);
			} else {
				System.out.println("Invalid transaction type.");
				continue;
			}
			
			choice = Console.getString("\nContinue? (y/n): ");
		}
		
		//This applies the methods, but doesn't display them.
		//That's what the get methods are for
		ca.subtractMonthlyFeeFromBalance();
		sa.applyPaymentToBalance();
		
		
		System.out.println("\nMonthly Payments and Fees:");
		System.out.println("Checking Fee: "+cf.format(ca.getMonthlyFee()));
		System.out.println("Savings Interest Payment: "+cf.format(sa.getMonthlyInterestPayment()));
		
		System.out.println("\nFinal Balances:");
		displayBalances(ca, sa);
		
		System.out.println("\nGoodbye!");
	}

	//static = called from the main method
	//										Balanceable ca,	Balanceable sa
	private static void displayBalances(CheckingAccount ca, SavingsAccount sa) {
		//Displays balances
		System.out.println("Checking: "+cf.format(ca.getBalance()));
		System.out.println("Checking: "+cf.format(sa.getBalance()));
	}
	
}
