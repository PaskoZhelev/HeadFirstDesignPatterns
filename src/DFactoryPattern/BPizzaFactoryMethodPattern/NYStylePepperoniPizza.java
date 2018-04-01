package DFactoryPattern.BPizzaFactoryMethodPattern;

public class NYStylePepperoniPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("PREPARE NY Style Pepperoni Pizza");
    }

    @Override
    public void bake() {
        System.out.println("BAKE NY Style Pepperoni Pizza");
    }
}
