package learning.proxy.airindia;

public class AirIndiaUI {

	public static void main(String[] args) {
		
		
		Search search = new AirIndiaSearchProxy();
		search.searchFlights("chennai", "delhi", "").stream().forEach(System.out::println);
		
		System.out.println("Blocked countries");
		search.searchFlights("Siberia", "delhi", "").stream().forEach(System.out::println);
		
	}

}
