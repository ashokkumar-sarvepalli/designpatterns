package learning.proxy.dynamic.monitoring;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AirIndiaSearch implements Search{
	
	
	private static List<Flight> flightList = new ArrayList<>();
	
	static {
		flightList.add(new Flight("Chennai","Mumbai",6000,"2019-01-23"));
		flightList.add(new Flight("Chennai","Delhi",5000,"2019-01-23"));
		flightList.add(new Flight("Delhi","Mumbai",8000,"2019-01-23"));
		
		
	}

	@Override
	public List<Flight> searchFlights(String source, String destination, String date) {
		return flightList.stream().filter(flight -> flight.getSource().equalsIgnoreCase(source) && flight.getDestination().equalsIgnoreCase(destination)).collect(Collectors.toList());
	}

}
