package AIntroductionChapter.ADuckBehaviours.behaviours.quack.impl;

import AIntroductionChapter.ADuckBehaviours.behaviours.quack.QuackBehaviour;

public class MuteQuack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("I cannot quack!");
    }
}
