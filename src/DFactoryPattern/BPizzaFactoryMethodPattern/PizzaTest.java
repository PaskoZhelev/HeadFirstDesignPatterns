package DFactoryPattern.BPizzaFactoryMethodPattern;

public class PizzaTest {

    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYPizzaStore();

        pizzaStore.orderPizza("cheese");
    }
}
