package AIntroductionChapter.BAdventureGameStrategyPattern.strategy.impl;

import AIntroductionChapter.BAdventureGameStrategyPattern.strategy.WeaponStrategy;

public class BowAndArrowWeaponStrategy implements WeaponStrategy {
    @Override
    public void useWeapon() {
        System.out.println("Attack with bow and weapon!");
    }
}
