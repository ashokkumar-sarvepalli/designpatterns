package learning.iterator.onlinestore;

import java.util.Iterator;

public interface MarketStore {
	
	
	public void addItem(String name, String type, double price);
	
	public Iterator<Item> createIterator();

}
