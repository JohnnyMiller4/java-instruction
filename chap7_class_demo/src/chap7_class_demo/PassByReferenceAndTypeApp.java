package chap7_class_demo;

public class PassByReferenceAndTypeApp {

	public static void main(String[] args) {
		double price = 14.99;
		price = increasePrice(price); //calls method into same object
		System.out.println(price);
		
	

	}

	private static double increasePrice(double p) {
		p = p*1.1;
		return p;
	}
	
}
