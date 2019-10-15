package chap7_class_demo;

public class InstanceCreatorApp {

	public static void main(String[] args) {
		Car car1 = new Car();
		car1.setID(10);
		System.out.println(car1.toString());

		Car car2 = new Car();
		car2.setID(20);
		System.out.println(car2.toString());
		
		System.out.println(Car.objectCount);
		//System.out.println("Num wheels =" + car2.NUM_WHEELS);
		//OR, do it like below;
		System.out.println("Num wheels =" + Car.NUM_WHEELS);
		
		Product p1 = new Product();
		p1.setCode("java");
		p1.setDescription("Murach's Java");
		p1.setPrice(57.50);
		
		System.out.println(p1.toString());
		increasePrice(p1);
		System.out.println(p1); //calls .toString() method by default
		
		Truck t1 = new Truck();
		t1.setId(11);
		System.out.println(t1);
		
	}
	
	private static void increasePrice(Product p) {
		double price = p.getPrice()*1.1;
		p.setPrice(price);
	}

}
