package chap4_class_demo;

public class ifElseSwitchApp {

	public static void main(String[] args) {
		int a = 3;
		int b = 10;
		
		if (a < 3) {
			System.out.println("a less than 3");
		}
		else if (a < 10) {
			System.out.println("a less than 10");
			String str = "abc";
		}
		else {
			System.out.println("a is 10 or greater");
			
			//str is defined outside of this block
			//System.out.println(str);
		}
		
		//&& = and
		if ((a<10)&&(b==10)) {
			System.out.println("a is less than 10, and b equals 10");
			System.out.println("you rock");
		}
		
		//|| = or ( shift + \ = | )
		if((a>10)||(b<20)) {
			System.out.println("a is less than 10, and b is less than 20");
		}
		
		//nested if statements
		if (a<10) {
			if (b<10) {
				System.out.println("b less than 10");
			}
			else {
				System.out.println("b is greater than or equal to 10");
			}
		}

		//switch statements
		switch (a) {
			case 1:
				System.out.println("a is 1");
				break;
			case 2:
				System.out.println("a is 2");
				break;
			case 3:
				System.out.println("a is 3");
				break;
				//if you remove break; statement, the code falls down
				//into the next case, outputting "a is 3" AND "a is 4"
			case 4:
				System.out.println("a is 4");
				break;
			case 5:
				System.out.println("a is 5");
				break;
			default:
				System.out.println("a greater than 5");
				break;
			
		}
		
		
	}

}
