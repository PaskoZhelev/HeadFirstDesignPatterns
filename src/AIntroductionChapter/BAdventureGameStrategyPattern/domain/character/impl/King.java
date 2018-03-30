package AIntroductionChapter.BAdventureGameStrategyPattern.domain.character.impl;

import AIntroductionChapter.BAdventureGameStrategyPattern.domain.character.Character;

public class King extends Character {
    @Override
    public void fight() {
        System.out.println("King does not fight!");
    }
}
