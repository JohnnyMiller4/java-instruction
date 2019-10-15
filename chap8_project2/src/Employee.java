
public final class Employee extends Person {

	private String ssn;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	//Source -> Generate Constructor using superclass, + add this.ssn = ssn;
	public Employee(String firstName, String lastName, String ssn) {
		super(firstName, lastName);
		this.ssn = ssn;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	//reformat return
//	@Override
//	public String toString() {
//		return super.toString()+"\nSSN: "+ssn;
//	}

	//to protect SSN
	@Override
	public String toString() {
		return super.toString()+"\nSSN: xxx-xx-"+ssn.substring(7);
	}
	
}
