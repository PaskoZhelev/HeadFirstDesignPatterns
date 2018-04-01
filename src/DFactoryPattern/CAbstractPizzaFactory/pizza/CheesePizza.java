package DFactoryPattern.CAbstractPizzaFactory.pizza;

import DFactoryPattern.CAbstractPizzaFactory.factory.PizzaIngredientFactory;

public class CheesePizza extends Pizza {

    public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }
}
