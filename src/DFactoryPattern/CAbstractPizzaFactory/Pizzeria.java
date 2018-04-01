package DFactoryPattern.CAbstractPizzaFactory;

import DFactoryPattern.CAbstractPizzaFactory.factory.ChicagoPizzaIngredientFactory;
import DFactoryPattern.CAbstractPizzaFactory.factory.NYPizzaIngredientFactory;
import DFactoryPattern.CAbstractPizzaFactory.pizza.CheesePizza;
import DFactoryPattern.CAbstractPizzaFactory.pizza.Pizza;
import DFactoryPattern.CAbstractPizzaFactory.pizza.TomatoPizza;

public class Pizzeria {

    public static void main(String[] args) {
        Pizza pizza1 = new CheesePizza(new NYPizzaIngredientFactory());
        pizza1.prepare();

        Pizza pizza2 = new TomatoPizza(new ChicagoPizzaIngredientFactory());
        pizza2.prepare();
    }
}
