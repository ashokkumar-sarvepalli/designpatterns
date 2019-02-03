package learning.proxy.dynamic.monitoring;

import java.util.List;

public interface Search {
	
	public List<Flight> searchFlights(String source, String destination, String date);

}
