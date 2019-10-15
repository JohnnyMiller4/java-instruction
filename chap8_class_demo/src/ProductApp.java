
public class ProductApp {

	public static void main(String[] args) {
		Book b = new Book ("java", "murach's java", 57.50, "Joel Murach");
		
		System.out.println("Book b = "+b);
		
		Software s = new Software("netbeans", "NetBeans", 0.0, "8.2");
		
		System.out.println("Software s = "+s);
		
		//demonstrate Polymorphism
		Product p;
		
		p = b;
		
		System.out.println("Product toString: "+p.toString());
		System.out.println("Author: "+b.getAuthor());
		//p = product, product doesn't inherit getAuthor() from child class
		//System.out.println("Author: "+p.getAuthor()); ==> doesn't work
		
		p = s;
		System.out.println("Product toString: "+p.toString());
		
	}

}
