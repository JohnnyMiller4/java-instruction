
public class Software extends Product {
	private String version;

	//Source -> Generate constructor from Superclass
	public Software() {
		super();
		version = "";
		count++;
	}

	//add String version and this.version = version;
	public Software(String code, String description, double price, String version) {
		super(code, description, price);
		this.version = version;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	//Source -> Generate toString() -> Inherited methods -> toString();
	@Override
	public String toString() {
		return super.toString() + " " + version;
	}
	
	

}
