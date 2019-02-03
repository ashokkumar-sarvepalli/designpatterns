package learning.proxy.dynamic.monitoring;

public class Flight {

	private String source;

	private String destination;

	private double price;

	private String date;

	public Flight(String source, String destination, double price, String date) {
		this.source = source;
		this.destination = destination;
		this.price = price;
		this.date = date;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Flight [source=" + source + ", destination=" + destination + ", price=" + price + ", date=" + date
				+ "]";
	}

}
