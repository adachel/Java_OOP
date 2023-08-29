package Lections.Lection1.Nasledovanie;
/*
import java.util.Random;
public class Magician {
    static int number;
    static Random r;

    private String name;
    private int hp;
    private int maxHp;

    private int mana;
    private int maxMana;

    static {
        Magician.number = 0;
        Magician.r = new Random();
    }

    public Magician(String name, int hp, int mana) {
        this.name = name;
        this.hp = hp;
        this.maxHp = hp;
        this.mana = mana;
        this.maxMana = mana;
    }

    public Magician() {
        this(String.format("Hero_Magician #%d", ++Magician.number),
                Magician.r.nextInt(100, 200),
                Magician.r.nextInt(50, 150));
    }

    public int Attack() {       // метод атаки
        int damage = Magician.r.nextInt(20, 30);
        this.mana -= (int)(damage * 0.8);
        if (mana < 0) return 0;
        else return damage;
    }

    public String getInfo() {       // метод получения информации
        return String.format("Name: %s  Hp: %d Enegry:  %d Type: %s",
                this.name, this.hp, this.mana, this.getClass().getSimpleName());
    }

    public void healed(int Hp) {
        this.hp = Hp + this.hp > this.maxHp ? this.maxHp : Hp + this.hp;
    } // метод лечения

    public void GetDamage(int damage) { // метод получения урона
        if (this.hp - damage > 0) {
            this.hp -= damage;
        }
        // else { die(); }
    }
}
*/

