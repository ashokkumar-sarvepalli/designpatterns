package learning.iterator.onlinestore.foreach;

public interface MarketStore extends Iterable<Item>{
	
	
	public void addItem(String name, String type, double price);
	
}
