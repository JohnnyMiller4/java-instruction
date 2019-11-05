package business;

public class JUnitTesting {
	
	public int square(int nbr) {
		return (int) Math.pow(nbr, 2);
	}
	
	public int countA(String str) {
		int i;
		int count = 0;
		for (i=0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'A') {
		    	count++;
		    }
		}
		return count;
	}
	
	//if you want to waste time with double-quotes
//	public int countA(String str) {
//		int i;
//		int count = 0;
//		for (i=0; i < str.length(); i++) {
//			
//			String val = Character.toString(str.charAt(i));
//			
//		    if (val.equalsIgnoreCase("a")) {
//		    	count++;
//		    }
//		}
//		return count;
//	}
}
