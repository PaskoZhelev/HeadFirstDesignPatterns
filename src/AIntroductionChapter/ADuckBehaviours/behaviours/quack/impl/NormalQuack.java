package AIntroductionChapter.ADuckBehaviours.behaviours.quack.impl;

import AIntroductionChapter.ADuckBehaviours.behaviours.quack.QuackBehaviour;

public class NormalQuack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("I am quacking normally!");
    }
}
