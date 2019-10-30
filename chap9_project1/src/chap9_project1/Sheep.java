package chap9_project1;

public class Sheep extends Animal implements Cloneable {

	String name;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getCountString() {
		count++;
		return super.count+" "+name;
	}
	
	
}
