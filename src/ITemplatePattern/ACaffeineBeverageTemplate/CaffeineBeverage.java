package ITemplatePattern.ACaffeineBeverageTemplate;

public abstract class CaffeineBeverage {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    public abstract void brew();

    public abstract void addCondiments();

    public void boilWater() {
        System.out.println("Boiling Water..");
    }

    public void pourInCup() {
        System.out.println("Pouring in cup..");
    }

}
