
public class Book extends Product implements Printable, Cloneable {
//right click over book and "add unimplemented method" || implement Printable
	
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
		return super.toString() + " by " + author;
	}
	
	//interface method
	@Override
	public void print() {
		System.out.println(super.getDescription()+ " by " + author);
		
	}

	//right-click -> Source -> Override/Implement -> Object -> Clone
//	@Override
//	protected Object clone() throws CloneNotSupportedException {
//		// TODO Auto-generated method stub
//		return super.clone();
//	}
	
	//change "protected" to "public"
		@Override
		public Object clone() throws CloneNotSupportedException {
			// TODO Auto-generated method stub
			return super.clone();
		}
	
}
