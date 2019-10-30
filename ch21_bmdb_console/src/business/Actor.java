package business;

import java.time.LocalDate;
import java.util.Date;

public class Actor {
	private int id;
	private String firstName;
	private String lastName;
	private String gender;
	private LocalDate birthdate;
	
	public Actor() {
		super();
	}

	public Actor(int id, String firstName, String lastName, String gender, LocalDate birthdate) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.birthdate = birthdate;
	}
	
	public Actor(String firstName, String lastName, String gender, LocalDate birthdate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.birthdate = birthdate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LocalDate getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}

	@Override
	public String toString() {
		return "ID: " + id + ", Name: " + firstName + " " + lastName + ", Gender: " + gender
				+ ", Birthdate: " + birthdate;
	}
	
	
}
