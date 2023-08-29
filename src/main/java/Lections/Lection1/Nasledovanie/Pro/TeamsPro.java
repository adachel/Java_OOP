package Lections.Lection1.Nasledovanie.Pro;

import Lections.Lection1.Nasledovanie.Pro.MagicianPro;
import Lections.Lection1.Nasledovanie.Pro.PriestPro;

import java.util.Random;
public class TeamsPro {     // создание команды
    public static void main(String[] args) {
        int teamCount = 10;  // кол-во членов
        Random rand = new Random();
        int magicianCount = rand.nextInt(0, teamCount); // генерируем кол-во магов
        int priestCount = teamCount - magicianCount;        // от него зависит кол-во жрецов

        System.out.printf("magicalCount: %d priestCount: %d \n", magicianCount, priestCount);

        PriestPro[] priests = new PriestPro[priestCount]; // отдельный массив для жрецов
        MagicianPro[] magicians = new MagicianPro[magicianCount];       // отдельный массив для магов

        for (int i = 0; i < priestCount; i++) { // наполняем массив жрецов
            priests[i] = new PriestPro();
            System.out.println(priests[i].getInfo());
        }
        System.out.println();

        for (int i = 0; i < magicianCount; i++) {       // наполняем массив магов
            magicians[i] = new MagicianPro();
            System.out.println(magicians[i].getInfo());
        }

    }


}
