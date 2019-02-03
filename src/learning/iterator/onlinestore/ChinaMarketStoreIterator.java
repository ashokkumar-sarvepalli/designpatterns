package learning.iterator.onlinestore;

import java.util.Iterator;

public class ChinaMarketStoreIterator implements Iterator<Item> {

	Item items[];

	private int total;

	private int currentIndex;
	

	public ChinaMarketStoreIterator(Item[] items, int count) {
		this.items = items;
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
		if (currentIndex >= total || currentIndex>=items.length) {
			return null;
		}

		Item item = items[currentIndex];

		currentIndex++;

		return item;

	}

}
