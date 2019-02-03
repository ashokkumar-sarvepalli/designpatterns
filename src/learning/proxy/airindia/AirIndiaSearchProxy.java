package learning.proxy.airindia;

import java.util.ArrayList;
import java.util.List;

public class AirIndiaSearchProxy implements Search{
	
	private static List<String> blockedDestinations = new ArrayList<String>();
	
	private AirIndiaSearch airIndiaSearch = new AirIndiaSearch();
	
	
	static {
		blockedDestinations.add("Siberia");
		blockedDestinations.add("Uganda");
		
	}

	@Override
	public List<Flight> searchFlights(String source, String destination, String date) {
		if(blockedDestinations.contains(source) || blockedDestinations.contains(destination)) {
			return new ArrayList<Flight>();
		}
		
		return airIndiaSearch.searchFlights(source, destination, date);
	}

}
