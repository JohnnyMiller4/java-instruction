
public class Book extends Product {
	
	private String author;

	//empty constructor
	public Book() {
		super();
		author = "";
		count++;
	}

	//full constructor
	public Book(String code, String description, double price, String author) {
		super(code, description, price);
		this.author = author;
	}

	//generate getters and setters
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	//generate toString(),
	//including the toString() of the parent class (inherited class -> to String) 
	@Override
	public String toString() {
		return super.toString() + " " + author;
	}
	
	
	
}
