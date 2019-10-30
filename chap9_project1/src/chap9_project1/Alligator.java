package chap9_project1;

public class Alligator extends Animal {

	@Override
	public String getCountString() {
		count++;
		return super.count+" alligator";
	}

}
