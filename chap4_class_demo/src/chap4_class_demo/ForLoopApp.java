package chap4_class_demo;

public class ForLoopApp {

	public static void main(String[] args) {
		
		//print yahoo 10 times
		//i initially = 0. i increases by 1 (++) each time this runs, until i<10
		for (int i = 0; i <10; i++) {
			System.out.println("yahoo! i is " +i);
		}
		
		//countdown from 100 by 10s
		//i initially = 100. i decreases by 10 each time this runs,
		//until i is less than or equal to 0
		for (int i=100; i>=0; i-=10) {
			System.out.println(i);
		}
		
		//
		
	}
}
