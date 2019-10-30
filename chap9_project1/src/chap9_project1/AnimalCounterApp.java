package chap9_project1;

public class AnimalCounterApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Alligator all = new Alligator();
		Sheep sheep1 = new Sheep();
		sheep1.setName("Blackie");
		Sheep sheep2 = new Sheep();
		sheep2.setName("Dolly");
		
		System.out.println("Counting Alligators...\n");
		
		count(all, 3);
		
		System.out.println("Counting sheep...\n");
		
		count(sheep1, 2);
		
		count(sheep2, 3);
		
		count(sheep1, 1);
		
	}

	public static void count(Countable c, int maxCount) {
		int i = 0;
		while (i < maxCount) {
		System.out.println(c.getCountString());
		i++;
		}
		System.out.println("");
		Animal.count = 0;
	}

}