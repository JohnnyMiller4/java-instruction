package business;

public class Student implements Comparable<Student> {
	
	private String lastName;
	private String firstName;
	private int grade;
	
	//Constructors
	public Student() {
		super();
	}

	public Student(String lastName, String firstName, int grade) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.grade = grade;
	}

	//Getters and Setters
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	//toString
	@Override
	public String toString() {
		return lastName + ", " + firstName + ", " + grade;
	}

	//implements Comparable
	@Override
	public int compareTo(Student s1) {
		//sort by name: lastName then firstName
		int comp = 0;
		comp = this.lastName.compareTo(s1.lastName);
		if (comp==0) //lastNames are the same
			comp = this.firstName.compareTo(s1.getFirstName());
		return comp;
	}
	
	
	
	
}
