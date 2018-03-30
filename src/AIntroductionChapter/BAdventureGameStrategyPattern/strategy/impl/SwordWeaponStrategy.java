package AIntroductionChapter.BAdventureGameStrategyPattern.strategy.impl;

import AIntroductionChapter.BAdventureGameStrategyPattern.strategy.WeaponStrategy;

public class SwordWeaponStrategy implements WeaponStrategy {
    @Override
    public void useWeapon() {
        System.out.println("Attack with sword!");
    }
}
