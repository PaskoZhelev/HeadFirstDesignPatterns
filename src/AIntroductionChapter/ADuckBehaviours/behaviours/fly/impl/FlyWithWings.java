package AIntroductionChapter.ADuckBehaviours.behaviours.fly.impl;

import AIntroductionChapter.ADuckBehaviours.behaviours.fly.FlyBehaviour;

public class FlyWithWings implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I am flying with wings!");
    }
}
