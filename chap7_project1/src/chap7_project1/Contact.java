package chap7_project1;

public class Contact {
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	
	//Source -> Generate constructor using fields -> Deselect all
	public Contact() {
		super();
	}

	//Source -> Generate constructor using fields -> Select all
	public Contact(String firstName, String lastName, String email, String phone) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
	}

	//Source -> Generate Getters and Setters
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	//Source -> Generate toString
	@Override
	public String toString() {
		return "Contact [firstName=" + firstName + ", lastName="
				+ lastName + ", email=" + email + ", phone=" + phone
				+ "]";
	}
	
	//TODO format display for the contact here
	public String displayContact() {
		String str = "--------------------------------------------\n";
				str +=	"---- Current Contact -----------------------\n";
				str += "--------------------------------------------\n"; 
				str += "Name:		" +firstName+" "+lastName+"\n";
				str += "Email Address:	" + email+"\n";
				str += "Phone Number:	" +phone+"\n";
				str += "--------------------------------------------\n";
		return str;
	}
	
}
