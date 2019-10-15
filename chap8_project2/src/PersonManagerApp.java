
public class PersonManagerApp {

	public static void main(String[] args) {

		System.out.println("Welcome to the person manager app!");
		
		Console c = new Console();
		
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
		
		String type = c.getString("\nCreate a customer\nor employee? (c/e): ");
		
		String firstName = c.getString("\nFirst Name: ");
		String lastName = c.getString("Last name: ");
		
		Person p = null;
		
		if(type.equalsIgnoreCase("c")) {
			String customerNumber = c.getString("Customer Number: ");
			Customer cust = new Customer(firstName, lastName, customerNumber);
			p = cust;
		}
		else if (type.equalsIgnoreCase("e")) {
			String ssn = c.getString("SSN: ");
			Employee emp = new Employee(firstName, lastName, ssn);
			p = emp;
		}
		else {
			System.out.println("Invalid type.");
		}

		//display results
		System.out.println("\nYou entered a new "+
							p.getClass().getName()+".");
		System.out.println(p);
		
		
		
		choice = c.getString("\nContinue? (y/n): ");
		}
		
		System.out.println("\nGoodbye!");
	}

}
