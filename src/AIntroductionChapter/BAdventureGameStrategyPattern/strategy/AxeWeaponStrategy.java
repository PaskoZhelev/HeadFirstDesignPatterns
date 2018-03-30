package AIntroductionChapter.BAdventureGameStrategyPattern.strategy;

public class AxeWeaponStrategy implements WeaponStrategy {
    @Override
    public void useWeapon() {
        System.out.println("Attack using the Axe!");
    }
}
