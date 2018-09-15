package learning.decorator.pizza;

public class ChickenPizza extends Pizza{

	@Override
	public double cost() {
		return 7;
	}
	
	public String description() {
		return " chickenPizza";
	}

}
