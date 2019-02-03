package learning.iterator.onlinestore;

public class Item {

	private String itemName;

	private String type;

	private double price;

	
	
	public Item(String itemName, String type, double price) {
		this.itemName = itemName;
		this.type = type;
		this.price = price;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item [itemName=" + itemName + ", type=" + type + ", price=" + price + "]";
	}
	
	

}
