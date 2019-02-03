package learning.proxy.dynamic.monitoring;

public class AirIndiaUI {

	public static void main(String[] args) {
		
		
	Search search = (Search) ProxyFactory.newInstance(new AirIndiaSearch());
	search.searchFlights("chennai", "delhi", "").stream().forEach(System.out::println);

		
	}

}
