package business;
//Abstract class cannot be instantiated, but can be used to code a class that inherits from
//an abstract class
public class Product implements Comparable {
	private String code;
	private String description;
	private double price;
	protected static int count = 0;

	//right click -> Source -> Generate Constructor using fields
	public Product(String code, String description, double price) {
		super(); //super() provides nothing meaningful
		this.code = code;
		this.description = description;
		this.price = price;
		
		
	}

	//right-click -> Source -> Generate constructor using fields -> deselect all,
	//creates empty constructor
	public Product() {
		super(); //super() provides nothing meaningful
	}
	
	//right-click -> Source -> Generate getters and setters
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	//right-click -> source -> generate toString() -> make sure the fields are selected
	@Override
	public String toString() {
		return description;
	}

	
	//Source -> Override/Implement methods, then tear out the guts and replace it
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Product) {
			Product p2 = (Product)obj;
			if (code.equalsIgnoreCase(p2.getCode())) {
				return true;
			}
		}
		return false;
	}

	//implemented Comparable method
	@Override
	public int compareTo(Object arg0) {
		//compare products by code
		int c = 0;
		Product p = (Product)arg0;
		c = this.code.compareTo(p.getCode());
		return c;
	}

	
	
	
}