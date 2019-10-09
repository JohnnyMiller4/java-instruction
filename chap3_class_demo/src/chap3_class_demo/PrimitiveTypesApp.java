package chap3_class_demo;

public class PrimitiveTypesApp {

	public static void main(String[] args) {
		
	
		//define variables
		int a = 5;
		int b = 11;
		double d1 = 5.5;
		double d2 = 2.1;
		
		//perform binary operations
		int sum1 = a + b;
		double sum2 = d1 + d2;
		System.out.println(sum1);
		System.out.println(sum2);
		
		//perform unary operations
		a++;
		System.out.println(a);
		d1--;
		System.out.println(d1);
		
		//compound assignment
		int a1 = 10;
		//increment by 1
		a1 = a1 + 5;
		a1++;
		a1 += 5;
		System.out.println(a1);

	}

}
