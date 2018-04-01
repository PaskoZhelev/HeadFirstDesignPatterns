package DFactoryPattern.CAbstractPizzaFactory.factory;

import DFactoryPattern.CAbstractPizzaFactory.ingredients.Ingredient;

public interface PizzaIngredientFactory {
    Ingredient createDough();
    Ingredient createSauce();
    Ingredient createCheese();

}
