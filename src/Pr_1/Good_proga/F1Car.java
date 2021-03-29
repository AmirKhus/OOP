package Pr_1.Good_proga;


import Pr_1.Good_proga.FIrstStrategy.F1PitstopStrategy;


public class F1Car extends Auto  {
    public F1Car() {
        this.fillStrategy = new F1PitstopStrategy();
    }

    public F1Car(F1PitstopStrategy f1PitstopStrategy) {
        this.fillStrategy = f1PitstopStrategy;
    }
}

