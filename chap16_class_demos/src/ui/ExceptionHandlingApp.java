package ui;

public class ExceptionHandlingApp {
	
	public static void main(String[] args) {
		String nbr = "75.5";
		try {
			int i = Integer.parseInt(nbr);
		}
		catch(NumberFormatException nfe) {
			System.out.println("Error parsing int");
			System.out.println(nfe.getMessage());
			System.out.println(nfe.toString());
			nfe.printStackTrace(); //we can't do anything in java.lang or java.io
								//Errors = Java problems, Exceptions = your problems
		}
		
		
	}

}
