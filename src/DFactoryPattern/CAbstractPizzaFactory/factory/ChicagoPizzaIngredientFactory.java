package DFactoryPattern.CAbstractPizzaFactory.factory;

import DFactoryPattern.CAbstractPizzaFactory.ingredients.ChicagoCheese;
import DFactoryPattern.CAbstractPizzaFactory.ingredients.ChicagoDough;
import DFactoryPattern.CAbstractPizzaFactory.ingredients.ChicagoSauce;
import DFactoryPattern.CAbstractPizzaFactory.ingredients.Ingredient;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Ingredient createDough() {
        return new ChicagoDough();
    }

    @Override
    public Ingredient createSauce() {
        return new ChicagoSauce();
    }

    @Override
    public Ingredient createCheese() {
        return new ChicagoCheese();
    }
}
