package AIntroductionChapter.BAdventureGameStrategyPattern.domain.character.impl;

import AIntroductionChapter.BAdventureGameStrategyPattern.domain.character.Character;

public class Queen extends Character {
    @Override
    public void fight() {
        System.out.println("Queen does not fight!");
    }
}
