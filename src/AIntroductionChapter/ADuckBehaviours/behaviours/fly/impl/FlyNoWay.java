package AIntroductionChapter.ADuckBehaviours.behaviours.fly.impl;

import AIntroductionChapter.ADuckBehaviours.behaviours.fly.FlyBehaviour;

public class FlyNoWay implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I cannot fly!");
    }
}
