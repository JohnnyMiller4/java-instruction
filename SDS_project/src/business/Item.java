package business;

public class Item {
	private String name;
	private int SellIn;
	private int Quality;
	
	public Item() {
		super();
	}

	public Item(String name, int sellIn, int quality) {
		super();
		this.name = name;
		SellIn = sellIn;
		Quality = quality;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSellIn() {
		return SellIn;
	}

	public void setSellIn(int sellIn) {
		SellIn = sellIn;
	}

	public int getQuality() {
		return Quality;
	}

	public void setQuality(int quality) {
		Quality = quality;
	}

	@Override
	public String toString() {
		return "Name: " + name + ", Sell in " + SellIn + " days, Quality: " + Quality;
	}

}
