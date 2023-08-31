package Lections.Lection2.Ex005.v2;

import Lections.Lection2.Ex005.v2.Healers.Healer;
import Lections.Lection2.Ex005.v2.Warriors.Warrior;

public class God extends Hero implements Healer, Warrior { // создали класс, кот может быть и лекарем и войном

    @Override
    public void attack(Hero target) {
        
    }

    @Override
    public void healing(Hero target) {
        
    }
}

