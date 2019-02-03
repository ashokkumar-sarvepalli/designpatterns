package learning.iterator.onlinestore.foreach.display;

import learning.iterator.onlinestore.foreach.*;;

public class AmazonStoreTest {

	public static void main(String[] args) {

		AmazonStore amazonStore = new AmazonStore();

		
		amazonStore.addMarketStore(new ChinaMarketStore());
		amazonStore.addMarketStore(new IndianMarketStore());

		amazonStore.printDetails();

		System.out.println("Items by type electronics");

		amazonStore.displayItemByType("electronics");

	}

}
