package business;

public class CheckingAccount extends Account {
	private double monthlyFee;

	public CheckingAccount() {
		super();
	}

	//Source -> Generate constructor using fields -> Select super constructor to invoke->
	//->Account(double)
	public CheckingAccount(double balance, double monthlyFee) {
		super(balance);
		this.monthlyFee = monthlyFee;
	}

	public double getMonthlyFee() {
		return monthlyFee;
	}

	public void setMonthlyFee(double monthlyFee) {
		this.monthlyFee = monthlyFee;
	}

	//create method by hand
	public void subtractMonthlyFeeFromBalance() {
		//get Balance instance variable by making it a protected class
		//you can also declare the "Account" class as abstract
		this.balance -= monthlyFee;
	}
	

}
