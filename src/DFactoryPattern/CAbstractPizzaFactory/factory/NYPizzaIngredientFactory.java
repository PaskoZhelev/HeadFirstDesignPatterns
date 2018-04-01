package DFactoryPattern.CAbstractPizzaFactory.factory;

import DFactoryPattern.CAbstractPizzaFactory.ingredients.Ingredient;
import DFactoryPattern.CAbstractPizzaFactory.ingredients.NYCheese;
import DFactoryPattern.CAbstractPizzaFactory.ingredients.NYDough;
import DFactoryPattern.CAbstractPizzaFactory.ingredients.NYSauce;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Ingredient createDough() {
        return new NYDough();
    }

    @Override
    public Ingredient createSauce() {
        return new NYSauce();
    }

    @Override
    public Ingredient createCheese() {
        return new NYCheese();
    }
}
