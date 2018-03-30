package AIntroductionChapter.ADuckBehaviours.domain.animals.impl;

import AIntroductionChapter.ADuckBehaviours.behaviours.fly.impl.FlyWithWings;
import AIntroductionChapter.ADuckBehaviours.behaviours.quack.impl.NormalQuack;
import AIntroductionChapter.ADuckBehaviours.domain.animals.Duck;

public class NormalDuck extends Duck {

    public NormalDuck() {
        setFlyBehaviour(new FlyWithWings());
        setQuackBehaviour(new NormalQuack());
    }
}
