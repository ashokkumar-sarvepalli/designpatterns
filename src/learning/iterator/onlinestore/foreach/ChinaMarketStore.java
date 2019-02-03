package learning.iterator.onlinestore.foreach;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

public class ChinaMarketStore implements MarketStore, Iterable<Item>{
	
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
	public Iterator<Item> iterator() {
		return new ChinaMarketStoreIterator();

	}

	
	private class ChinaMarketStoreIterator implements Iterator<Item> {

		private int total;

		private int currentIndex;
		

		public ChinaMarketStoreIterator() {
			this.total = count;
			currentIndex = 0;

		}

		@Override
		public boolean hasNext() {

			if (currentIndex >= total || currentIndex>=items.length) {
				return false;
			}
			return true;
		}

		@Override
		public Item next() {

			if (total != count) {
				throw new ConcurrentModificationException();
			}

			if (currentIndex >= total || currentIndex>=items.length) {
				return null;
			}

			Item item = items[currentIndex];

			currentIndex++;

			return item;

		}
	}


	

	
	
	
}
