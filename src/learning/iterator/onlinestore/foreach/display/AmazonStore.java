package learning.iterator.onlinestore.foreach.display;

import java.util.ArrayList;
import java.util.List;

import learning.iterator.onlinestore.foreach.Item;
import learning.iterator.onlinestore.foreach.MarketStore;

public class AmazonStore {

	private List<MarketStore> marketStores = new ArrayList<>();

	public AmazonStore() {
	}

	public void addMarketStore(MarketStore marketStore) {
		marketStores.add(marketStore);
	}

	public void printDetails() {

		for (MarketStore market : marketStores) {
			for (Item item : market) {
				System.out.println(item);
			}
		}
	}

	public void displayItemByType(String type) {

		for (MarketStore market : marketStores) {
			for (Item item : market) {
				if (item.getType().equalsIgnoreCase("Electronics")) {
					System.out.println(item);
				}
			}
		}

	}

}
