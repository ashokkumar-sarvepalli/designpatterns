package learning.iterator.onlinestore;

import java.util.Iterator;

public class ChinaMarketStore implements MarketStore{
	
	private Item [] items;
	
	private int count;
	
	
	
	public ChinaMarketStore() {
		items = new Item[10];
		
		items[0] = new Item("HeadSet","Electronics",170.0);
		items[1] = new Item("China TV","Electronics",17000.0);
		items[2] = new Item("AXE","Perfume",150.0);
		count = 3;
	}
	
	
	
	public void addItem(String name, String type, double price) {
		items[count] = new Item(name,type,price);
		
		count = count+1;
	}



	@Override
	public Iterator<Item> createIterator() {
		return new ChinaMarketStoreIterator(items,count);
	}

	
	
	
}
