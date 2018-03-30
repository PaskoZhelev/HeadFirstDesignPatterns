package AIntroductionChapter.BAdventureGameStrategyPattern.domain.character;

import AIntroductionChapter.BAdventureGameStrategyPattern.strategy.WeaponStrategy;

public abstract class Character {

    private WeaponStrategy weaponStrategy;

    public abstract void fight();

    public WeaponStrategy getWeaponStrategy() {
        return weaponStrategy;
    }

    public void setWeaponStrategy(WeaponStrategy weaponStrategy) {
        this.weaponStrategy = weaponStrategy;
    }
}
