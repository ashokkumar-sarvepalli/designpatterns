package learning.decorator.pizza.toppings;

import learning.decorator.pizza.Pizza;

public class TomotoToppings extends Toppings{
	
	private Pizza pizza;
	
	public TomotoToppings(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public double cost() {
		return pizza.cost() + 1;
	}

	public String description() {
		return pizza.description() + ", tomoto toppings";
	}
}
