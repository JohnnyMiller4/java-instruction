package ui;

import java.util.ArrayList;
import java.util.List;

import business.User;
import util.Console;

public class UserApp {
	
	private static List<User> users = new ArrayList<>();

	public static void main(String[] args) {
		
		int id;
		String username;
		String password;
		String firstName;
		String lastName;
		String phoneNumber;
		String email;
		int isReviewer;
		int isAdmin;
		
		User u1 = new User(1, "jkillaz224", "Quiet1sh0t", "Johnny", "Miller IV",
				"513-141-080", "mgssocialbros@gmail.com", 0, 0);
		User u2 = new User(2, "Reylo4Lyfe", "kylo8pak", "Marie", "Greedo",
				"513-113-800", "bensoloishot@gmail.com", 0, 0);
		
		users.add(u1);
		users.add(u2);
		
		System.out.println("PRS Console");
		String command = "";
		
		while (!command.equalsIgnoreCase("6")) {
			command = Console.getString(getDisplayMenu());
		
			switch (command.toLowerCase()) {
			case "1":	
				//list user
				//each item on its own line
				//prefix with (index number + 1)
				for (int i=0; i < users.size(); i++) {
					System.out.println("\n"+(i+1)+"."+users.get(i));
				}
				break;
			case "2":
				//user = position of the element
				User user = getUser();
				System.out.println(user);
				break;
			case "3":
				//add an item
				if (users.size()>5) {
					System.out.println("You can't carry any more users.");
				}
				else {
				id = Console.getInt("New User ID: ");
				username = Console.getString("New Username: ");
				password = Console.getString("New Password: ");
				firstName = Console.getString("First Name: ");
				lastName = Console.getString("Last Name: ");
				phoneNumber = Console.getString("Phone Number: ");
				email = Console.getString("E-mail: ");
				isReviewer = Console.getInt("Is this user a reviewer? (0=no, 1=yes): ", -1, 2);
				isAdmin = Console.getInt("Is this new user an admin? (0=no, 1=yes)", -1, 2);
				
				User newUser = new User(id, username, password, firstName, lastName, phoneNumber,
						email, isReviewer, isAdmin);
				users.add(newUser);
				System.out.println(username + " was added");
				}
				break;
			case "4":
				//edit a username
				user = getUser();
				String updUsn = Console.getString("Update username: ");
				user.setUsername(updUsn);
				System.out.println("\nUsername was updated.");
				break;
			case "5":
				//delete a user
				user = getUser();
				users.remove(user);
				System.out.println("User " + user.getUsername() + " was removed.");
				break;
			case "6":
				//exit the app
				break;
			default:
				System.out.println("Invalid command. Try again.");
				break;
			}
		}
		
		System.out.println("\nGoodbye!");
	}
	
	//prompt use for an item number and return item
		private static User getUser() {
			int userNbr = Console.getInt("Number: ", 0, users.size()+1);	
			User str = users.get(userNbr-1);
			return str;
		}
		
		private static String getDisplayMenu() {
			String menu = "\nCOMMAND MENU\n" + 
							"1 - List Users\n" + 
							"2 - Get a User\n" + 
							"3 - Add a User\n" + 
							"4 - Edit Username\n" + 
							"5 - Delete a User\n" +
							"6 - Exit" +
							"\n" +
							"\nCommand: \r";
			
			return menu;
		}

}