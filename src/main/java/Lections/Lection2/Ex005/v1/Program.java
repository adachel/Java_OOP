package Lections.Lection2.Ex005.v1;

import Lections.Lection2.Ex005.v1.Healers.Druid;
import Lections.Lection2.Ex005.v1.Healers.Healer;
import Lections.Lection2.Ex005.v1.Healers.Shaman;
import Lections.Lection2.Ex005.v1.Warriors.Knight;
import Lections.Lection2.Ex005.v1.Warriors.Paladin;
import Lections.Lection2.Ex005.v1.Warriors.Warrior;

import java.util.ArrayList;
import java.util.List;



public class Program {
    public static void main(String[] args) {
        
        //#region team1
        List<Hero> team1 = new ArrayList<>();
        team1.add(new Druid());
        team1.add(new Shaman());
        team1.add(new Paladin());
        team1.add(new Druid());

        // team1.get(0).attack

        var h = team1.get(0);

        if (h instanceof Warrior) {     // 'instanceof' проверяет, является ли 'h' типом 'Warrior'
            ((Warrior) h).attack(null); // ((Warrior) h) - каст к типу 'Warrior, затем метод атаки
        }
        else if (h instanceof Healer) {  // иначе если персонаж лекарь, то
            ((Healer) h).healing(null);  // лечить
        } else {
            //....
        }
        //#endregion

        //#region team2
        List<Warrior> team2 = new ArrayList<>(); // наполняем коллекцию войнами
        //team2.add(new Druid()); // друид не зайдет, он находится на одном уровне этой иерархии
        team2.add(new Paladin());
        team2.add(new Knight());

        team2.get(0).attack(null); // войны атакуют

        List<Healer> team3 = new ArrayList<>();
        //team2.add(new Paladin());
        team3.add(new Druid());
        team3.add(new Shaman());

        team3.get(0).healing(null); // эти лечат


        //#endregion



    }
}
