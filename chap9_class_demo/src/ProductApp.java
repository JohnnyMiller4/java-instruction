
public class ProductApp {

	public static void main(String[] args) {
		Book b1 = new Book("java", "Murach's Java Programming",
									57.50, "Joel Murach");
		
		b1.print();
		printToString(b1);
		
		//create a new instance of book, a copy of b1
		//Add (Book) cast
		Book b2 = null;
		try {
			b2 = (Book) b1.clone();
		}
		catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("b2 contents: " + b2);
	}
	
	//if you're calling anything from the main method, it must be static
						//printIt
	private static void printToString(Printable p) {
		p.print();
	}

}
