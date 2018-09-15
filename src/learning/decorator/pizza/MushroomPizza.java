package learning.decorator.pizza;

public class MushroomPizza extends Pizza {

	@Override
	public double cost() {
		return 6;
	}
	
	public String description() {
		return " Mushroom Pizza";
	}

}
