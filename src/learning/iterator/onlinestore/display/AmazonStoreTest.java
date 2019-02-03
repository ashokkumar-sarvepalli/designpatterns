package learning.iterator.onlinestore.display;

import learning.iterator.onlinestore.ChinaMarketStore;
import learning.iterator.onlinestore.IndianMarketStore;

public class AmazonStoreTest {

	public static void main(String[] args) {

		AmazonStore amazonStore = new AmazonStore();

		amazonStore.addMarketStore(new IndianMarketStore());
		amazonStore.addMarketStore(new ChinaMarketStore());

		amazonStore.printDetails();

		System.out.println("Items by type electronics");

		amazonStore.displayItemByType("electronics");

	}

}
