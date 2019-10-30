package business;

public abstract class Account implements Depositable, Withdrawable, Balanceable {

	protected double balance;
	
	//default constructor
	public Account() {
		super();
	}

	public Account(double balance) {
		super();
		this.balance = balance;
	}

	//Source -> generate getters and setters
	@Override
	public double getBalance() {
		return balance;
	}

	//add balance value
	@Override
	public void setBalance(double bal) {
		balance = bal;

	}

	//add balance withdraw value
	@Override
	public void withdraw(double amt) {
		balance -= amt;

	}

	//add balance deposit value
	@Override
	public void deposit(double amt) {
		balance += amt;

	}

}
