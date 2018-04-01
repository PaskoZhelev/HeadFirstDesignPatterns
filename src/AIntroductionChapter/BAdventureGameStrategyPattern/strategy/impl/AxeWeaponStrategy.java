package AIntroductionChapter.BAdventureGameStrategyPattern.strategy.impl;

import AIntroductionChapter.BAdventureGameStrategyPattern.strategy.WeaponStrategy;

public class AxeWeaponStrategy implements WeaponStrategy {
    @Override
    public void useWeapon() {
        System.out.println("Attack using the Axe!");
    }
}
