package chap7_class_demo;

public class Product {
	private String code;
	private String description;
	private double price;
	
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
		return "Product [code=" + code + ", description=" + description +
				", price=" + price + "]";
	}
	
	
	
}
