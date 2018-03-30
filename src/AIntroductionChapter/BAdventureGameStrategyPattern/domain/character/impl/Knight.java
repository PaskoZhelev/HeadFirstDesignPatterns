package AIntroductionChapter.BAdventureGameStrategyPattern.domain.character.impl;

import AIntroductionChapter.BAdventureGameStrategyPattern.domain.character.Character;

public class Knight extends Character {
    @Override
    public void fight() {
        System.out.println("Knight Fight!");
    }
}
