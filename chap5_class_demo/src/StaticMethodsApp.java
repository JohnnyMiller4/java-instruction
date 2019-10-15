
public class StaticMethodsApp {

	public static void main(String[] args) {
		printWelcomeMessage();
		
		int a = sum(4,5);
		System.out.println("Sum is " + a + ".");
	}
	
	//private = will not be called outside of the main method
	private static void printWelcomeMessage() {
		System.out.println("Welcome to my method.");
	}
	
	private static int sum(int a, int b) {
		return a + b;
	}
	
}
