package GAdapterPattern.ASimpleDuckAdapter;

public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println(this.getClass().getSimpleName() + " gobbles!");
    }

    @Override
    public void fly() {
        System.out.println(this.getClass().getSimpleName() + " flies!");
    }
}
