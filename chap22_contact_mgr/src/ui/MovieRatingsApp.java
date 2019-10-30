package ui;

public class MovieRatingsApp {

	public static void main(String[] args) {
		

	}
	
	private static String getMenu() {
		String menu = "\nCOMMAND MENU\n" + 
				"1  - List Contacts\n" + 
				"2  - List Contacts w/o phone number\n" + 
				"3  - List Contacts w/o email\n" +
				"4  - (Lambda) List Contacts w/o phone number\n" + 
				"5  - (Lambda) List Contacts w/o email\n" +
				"6  - (Lambda) List Contacts named 'Mike Murach'\n" +
				"7  - (Lambda - Predicate) List Contacts without phone\n" +
				"8  - (Lambda - Consumer) Print names\n" +
				"9  - Stream of contact names w/o phone\n" +
				"10 - Map and reduce names to a single string\n" +
				"99 - Exit\n" +
				"\nEnter Command Number: ";
		return menu;
	}

}
