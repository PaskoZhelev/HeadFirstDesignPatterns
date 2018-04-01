package DFactoryPattern.CAbstractPizzaFactory.pizza;

import DFactoryPattern.CAbstractPizzaFactory.factory.PizzaIngredientFactory;

public class TomatoPizza extends Pizza {

    public TomatoPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }
}
