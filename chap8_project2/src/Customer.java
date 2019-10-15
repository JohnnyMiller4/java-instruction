
public final class Customer extends Person {

	private String customerNumber;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(String firstName, String lastName, String customerNumber) {
		super(firstName, lastName);
		this.customerNumber = customerNumber;
	}
	

	public String getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}
	
	//Reformat return
	@Override
	public String toString() {
		return super.toString()+"\nCustomer Number: "+customerNumber;
	}

	
	
}
