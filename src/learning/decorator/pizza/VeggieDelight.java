package learning.decorator.pizza;

public class VeggieDelight extends Pizza{

	@Override
	public double cost() {
		return 5;
	}

	public String description() {
		return "Veggie Delight";
	}
}
