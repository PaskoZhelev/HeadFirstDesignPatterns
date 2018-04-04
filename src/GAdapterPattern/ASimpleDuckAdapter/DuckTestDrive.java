package GAdapterPattern.ASimpleDuckAdapter;

public class DuckTestDrive {



    public static void main(String[] args) {
        Duck duck = new MallardDuck();

        Turkey turkey = new WildTurkey();

        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        turkey.gobble();
        turkey.fly();

        duck.quack();
        duck.fly();

        turkeyAdapter.quack();
        turkeyAdapter.fly();

    }
}
