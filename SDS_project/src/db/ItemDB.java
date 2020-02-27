package db;

import java.util.ArrayList;
import java.util.List;

import business.Item;

public class ItemDB {
	private List<Item> itemList;
	
	public ItemDB() {
		itemList = new ArrayList<>();
	}
	
	public List<Item> getItemList() {
		return itemList;
	}
	
	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}
	
	//add this to the class by hand
	public void add(Item i) {
		itemList.add(i);
	}
	
	public List<Item> advanceDay() {
		for (Item i: itemList) {
			if (i.getName() != "Aged Brie" && i.getName() != "Backstage passes") {
				if (i.getQuality() > 0) {
					if (i.getName() != "Sulfuras") {
						int quality = i.getQuality() - 1;
						
						i.setQuality(quality);
						if (i.getName() == "Conjured") {
							quality = i.getQuality() - 1;
							
							i.setQuality(quality);
						}
					}
				}
			}
			else {
			if (i.getQuality() < 50) {
				int quality = i.getQuality() + 1;
				
				i.setQuality(quality);
				
				if (i.getName() == "Backstage passes") {
					if(i.getSellIn() < 11) {
						if(i.getQuality() < 50) {
							quality = i.getQuality() + 1;
							
							i.setQuality(quality);
						}
					}
					if (i.getSellIn() < 6) {
						if (i.getQuality() < 50) {
							quality = i.getQuality() + 1;
							
							i.setQuality(quality);
						}
					}
				}
			}
		}
		if (i.getName() != "Sulfuras" && i.getSellIn() > 0) {
			int sellIn = i.getSellIn() - 1;
			
			i.setSellIn(sellIn);
		}
		if (i.getSellIn() == 0) {
			if (i.getName() != "Aged Brie") {
				if (i.getName() != "Backstage passes") {
					if (i.getQuality() > 0) {
						if (i.getName() != "Sulfuras") {
							int quality = i.getQuality() - 1;
							
							i.setQuality(quality);
							
							if (i.getName() == "Conjured") {
								quality = i.getQuality() - 1;
								
								i.setQuality(quality);
							}
						}
					}
				}
				else {
					int quality = i.getQuality() - i.getQuality();
					
					i.setQuality(quality);
				}
			}
			else {
				if (i.getQuality() < 50) {
					int quality = i.getQuality() + 1;
					
					i.setQuality(quality);
				}
			}
		}
	
		}
		return itemList;
	}
}