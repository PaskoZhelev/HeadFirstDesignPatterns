package DFactoryPattern.CAbstractPizzaFactory.pizza;

import DFactoryPattern.CAbstractPizzaFactory.factory.PizzaIngredientFactory;
import DFactoryPattern.CAbstractPizzaFactory.ingredients.Ingredient;

public abstract class Pizza {

    PizzaIngredientFactory pizzaIngredientFactory;
    Ingredient sauce;
    Ingredient cheese;
    Ingredient dough;

    public void prepare() {
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
        dough = pizzaIngredientFactory.createDough();
        serve();
    }

    private void serve() {
        System.out.println("Pizza: " + getClass().getSimpleName() + " Ingredients: "
        + sauce.getClass().getSimpleName() + " "
        + cheese.getClass().getSimpleName() + " "
        + dough.getClass().getSimpleName());
    }

}
