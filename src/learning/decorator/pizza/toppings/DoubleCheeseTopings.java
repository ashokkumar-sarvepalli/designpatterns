package learning.decorator.pizza.toppings;

import learning.decorator.pizza.Pizza;

public class DoubleCheeseTopings extends Toppings {

	private Pizza pizza;
	
	public DoubleCheeseTopings(Pizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public double cost() {
		return pizza.cost() + 2;
	}
	
	public String description() {
		return pizza.description() + ", double cheese toppings";
	}

}
