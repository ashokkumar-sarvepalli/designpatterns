package learning.iterator.onlinestore.display;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import learning.iterator.onlinestore.Item;
import learning.iterator.onlinestore.MarketStore;

public class AmazonStore {

	private List<MarketStore> marketStores = new ArrayList<>();

	public AmazonStore() {
	}

	public void addMarketStore(MarketStore marketStore) {
		marketStores.add(marketStore);
	}

	public void printDetails() {

		for (MarketStore market : marketStores) {
			Iterator<Item> item = market.createIterator();
			while (item.hasNext()) {
				System.out.println(item.next());
			}
		}
	}

	public void displayItemByType(String type) {

		for (MarketStore market : marketStores) {
			Iterator<Item> itemIterator = market.createIterator();
			while (itemIterator.hasNext()) {

				Item item = itemIterator.next();

				if (item.getType().equalsIgnoreCase("electronics")) {
					System.out.println(item);
				}
			}
		}
	}

}
