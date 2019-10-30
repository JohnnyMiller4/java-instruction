package business;

public class User {
	private int id;
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String email;
	private int isReviewer;
	private int isAdmin;
	
	public User() {
		super();
	}

	public User(int id, String username, String password, String firstName, String lastName, String phoneNumber, String email,
			int isReviewer, int isAdmin) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.isReviewer = isReviewer;
		this.isAdmin = isAdmin;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getIsReviewer() {
		return isReviewer;
	}

	public void setIsReviewer(int isReviewer) {
		this.isReviewer = isReviewer;
	}

	public int getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(int isAdmin) {
		this.isAdmin = isAdmin;
	}

	@Override
	public String toString() {
		return "\nUserID: "+ id + "\nUsername: " + username + "\nPassword: " + password + "\nName: " + firstName + " " + lastName
				+ "\nPhone Number: " + phoneNumber + "\nE-mail: " + email + "\nReviewer(?): " + isReviewer + "\nAdmin(?): "
				+ isAdmin;
	}
}
