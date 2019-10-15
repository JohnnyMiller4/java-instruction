
public class Grade {
	int numInst;
	int letter;
	
	public Grade(int numInst, int letter) {
		super();
		this.numInst = numInst;
		this.letter = letter;
		
		Console console = new Console();
		
		numInst = (int) console.getDouble(null);
		
	}
	public Grade() {
		super();
	}
	public void setNumInst(int numInst) {
		this.numInst = numInst;
	}
	public int getNumInst() {
		return numInst;
	}
	public int getLetter() {
		
		if (getNumInst() > 100) {
			System.out.println("Error");
							}
		else if (getNumInst() < 0) {
			System.out.println("Error");
							}
		else if (getNumInst() >= 88) {
			System.out.println("Letter grade: A");
								}
		else if (getNumInst() >= 80) {
			System.out.println("Letter grade: B");
								}
		else if (getNumInst() >= 67) {
			System.out.println("Letter grade: C");
								}
		else if (getNumInst() >= 60) {
			System.out.println("Letter grade: D");
								}
		else if (getNumInst() < 60) {
			System.out.println("Letter grade: F");
		}
			
		return letter;
	}
	
	}