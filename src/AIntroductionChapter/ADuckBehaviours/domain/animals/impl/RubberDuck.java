package AIntroductionChapter.ADuckBehaviours.domain.animals.impl;

import AIntroductionChapter.ADuckBehaviours.behaviours.fly.impl.FlyNoWay;
import AIntroductionChapter.ADuckBehaviours.behaviours.quack.impl.MuteQuack;
import AIntroductionChapter.ADuckBehaviours.domain.animals.Duck;

public class RubberDuck extends Duck {

    public RubberDuck() {
        setFlyBehaviour(new FlyNoWay());
        setQuackBehaviour(new MuteQuack());
    }
}
