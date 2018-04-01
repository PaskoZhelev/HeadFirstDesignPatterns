package DFactoryPattern.BPizzaFactoryMethodPattern;

public class NYStyleCheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("PREPARE NY Style Cheese Pizza");
    }

    @Override
    public void bake() {
        System.out.println("BAKE NY Style Cheese Pizza");
    }
}
