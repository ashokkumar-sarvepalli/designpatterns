package learning.decorator.pizza.test;

import learning.decorator.pizza.Pizza;
import learning.decorator.pizza.VeggieDelight;
import learning.decorator.pizza.toppings.DoubleCheeseTopings;
import learning.decorator.pizza.toppings.OnionToppings;
import learning.decorator.pizza.toppings.TomotoToppings;

public class PizzaTest {

	public static void main(String[] args) {

		Pizza veggieDelight = new VeggieDelight();
		veggieDelight = new OnionToppings(veggieDelight);
		veggieDelight = new TomotoToppings(veggieDelight);
		veggieDelight = new DoubleCheeseTopings(veggieDelight);
		
		System.out.println("Description : "+veggieDelight.description() + " cost is : "+veggieDelight.cost());
	}

}
