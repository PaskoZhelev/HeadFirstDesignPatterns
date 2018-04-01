package CDecoratorPattern.ADecoratorPattern;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return 2.50;
    }
}
