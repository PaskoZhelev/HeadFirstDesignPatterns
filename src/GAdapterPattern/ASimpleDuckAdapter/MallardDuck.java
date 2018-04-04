package GAdapterPattern.ASimpleDuckAdapter;

public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println(this.getClass().getSimpleName() + " quacks!");
    }

    @Override
    public void fly() {
        System.out.println(this.getClass().getSimpleName() + " flies!");
    }

}
