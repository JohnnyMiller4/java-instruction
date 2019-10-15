package chap7_class_demo;

public class Truck {
	private int id;
	
	//right-click -> source -> generate constructor using fields
	public Truck(int id) {
		super();
		this.id = id;
	}
	
	//right-click -> source -> generate constructor using fields
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Truck [id=" + id + "]";
	}
	
	//makes compile error in InstanceCreatorApp go away
	public Truck() {
		super();
	}

}
