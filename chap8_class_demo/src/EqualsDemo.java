
public class EqualsDemo {

	public static void main(String[] args) {
		Book b1 = new Book("Java", "Murach's Java", 59.50, "Joel Murach");
		Book b2 = new Book("Java", "Murach's Java", 59.50, "Joel Murach");
		Book b3 = new Book("cofveve", "Molach's Covfefe", 2776.45, "Edgar Moloch");

		String s1 = "abc";
		String s2 = "abc";
		
		if(s1.contentEquals(s2)) {
			System.out.println("s1 and s2 have the same values.");
		}
		
		if(b1==b2) {
			System.out.println("b1 and b2 are the same object.");
		} else if (b1.equals(b2)) {
			System.out.println("b1 and b2 have the same values.");
		}
		else {
			System.out.println("b1 and b2 are not the same and"
					+"\ndon't have the same values.");
		}
		
		if(b1==b3) {
			System.out.println("b1 and b2 are the same object");
		} else if (b1.equals(b3)) {
			System.out.println("b1 and b2 have the same values");
		} else{ System.out.println("b1 and b3 are not the same and"+
			"\ndon't have the same values.");
		}
		
		//page 280 - 281
		//equals works for strings, but NOT product classes
		
		//overwrite the equals method
		
	}

}
