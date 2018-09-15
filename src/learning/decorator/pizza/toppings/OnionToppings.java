package learning.decorator.pizza.toppings;

import learning.decorator.pizza.Pizza;

public class OnionToppings extends Toppings{

	private Pizza pizza;
	
	public OnionToppings(Pizza pizza) {
		this.pizza = pizza;
	}
	@Override
	public double cost() {
		return pizza.cost() + 0.5;
	}

	public String description() {
		return pizza.description() + ", onion toppings";
	}
}
