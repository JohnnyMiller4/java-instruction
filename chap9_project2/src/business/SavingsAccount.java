package business;

public class SavingsAccount extends Account {
	//default value is 0
	private double monthlyInterestRate;
	private double monthlyInterestPayment;
	
	public SavingsAccount() {
		super();
	}

	//Source -> Generate constructor using fields -> Select super constructor to invoke->
	//->Account(double)
	public SavingsAccount(double balance, double monthlyInterestRate/*, double monthlyInterestPayment*/) {
		super(balance);
		this.monthlyInterestRate = monthlyInterestRate;
		/*this.monthlyInterestPayment = monthlyInterestPayment;*/
	}

	public double getMonthlyInterestRate() {
		return monthlyInterestRate;
	}

	public void setMonthlyInterestRate(double monthlyInterestRate) {
		this.monthlyInterestRate = monthlyInterestRate;
	}

	public double getMonthlyInterestPayment() {
		return monthlyInterestPayment;
	}

	public void setMonthlyInterestPayment(double monthlyInterestPayment) {
		this.monthlyInterestPayment = monthlyInterestPayment;
	}
	
	//Add this by hand
	public void applyPaymentToBalance() {
		//calculate the interest pmt
		monthlyInterestPayment = balance * monthlyInterestRate;
		
		//add that to balance
		balance += monthlyInterestPayment;
	}
	
	
}
