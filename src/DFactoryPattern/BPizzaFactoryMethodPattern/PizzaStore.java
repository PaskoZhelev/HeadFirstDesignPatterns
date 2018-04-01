package DFactoryPattern.BPizzaFactoryMethodPattern;

public abstract class PizzaStore {

    public Pizza orderPizza(String type){
        Pizza pizza = null;

        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();

        return pizza;
    }

    public abstract Pizza createPizza(String type);


}
