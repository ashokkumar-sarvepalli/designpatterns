package learning.iterator.onlinestore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IndianMarketStore implements MarketStore{
	
	private List<Item> itemList = null;
	
	
	public IndianMarketStore() {
		itemList = new ArrayList<>();
		
		itemList.add(new Item("beats headset","Electronics",45.0));
		itemList.add(new Item("Household","Plastic",54.0));
		
	}
	
	public void addItem(String name, String type, double price) {
		itemList.add(new Item(name,type,price));
	}

	
	@Override
	public Iterator<Item> createIterator() {
		return itemList.iterator();
	}
	

}
