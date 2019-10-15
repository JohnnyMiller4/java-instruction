package chap7_project1;

public class ContactListApp {

	public static void main(String[] args) {
		//ctrl+shift+f = autoformat
		System.out.println("Welcome to the Contact App!");
		String choice = "y";

		//equalsIgnoreCase method is the first non-static method
		while (!choice.equalsIgnoreCase("n")) {
			//If Console is non-static (it shouldn't be), you'll need to do this;
			//Console console = new Console();
			
			String fName = Console.getString("\nEnter first name: ");
			String lName = Console.getString("Enter last name: ");
			String email = Console.getString("Enter email: ");
			String phone = Console.getString("Enter phone: ");

			// between parentheses, hit ctrl-space, to see the order of inputs
			Contact c = new Contact(fName, lName, email, phone);

			// display contact
			//c.displayContact() is the SECOND instance of a non-static method
			//The purpose of Contact is to store/display variables
			System.out.println(c.displayContact());

			choice = Console.getString("Continue? (y/n): ");

		}

		System.out.println("Goodbye!");
	}

}
