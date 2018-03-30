package AIntroductionChapter.ADuckBehaviours;

import AIntroductionChapter.ADuckBehaviours.domain.animals.Duck;
import AIntroductionChapter.ADuckBehaviours.domain.animals.impl.NormalDuck;
import AIntroductionChapter.ADuckBehaviours.domain.animals.impl.RubberDuck;

public class DuckBehaviourProcessor {

    public static void main(String[] args) {
        Duck normalDuck = new NormalDuck();
        Duck rubberDuck = new RubberDuck();

        System.out.println("The " + normalDuck.getClass().getSimpleName() + ":");
        normalDuck.performFly();
        normalDuck.performQuack();

        System.out.println("The " + rubberDuck.getClass().getSimpleName() + ":");
        rubberDuck.performFly();
        rubberDuck.performQuack();
    }
}
