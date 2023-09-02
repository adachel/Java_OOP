package Lections.Lection1.Nasledovanie.Pro;

import Lections.Lection1.Nasledovanie.Pro.MagicianPro;
import Lections.Lection1.Nasledovanie.Pro.BaseHero;

public class MagicianPro extends BaseHero {     // забираем из BaseHero - это НАСЛЕДОВАНИЕ
    private int mana;
    private int maxMana;

    public MagicianPro() {
        super(String.format("Hero_Magician #%d", ++MagicianPro.number),     // 'super' - это обращение к переменным
                                                                            // 'BaseHero', такой аналог 'this'
                MagicianPro.r.nextInt(100, 200));
        this.maxMana = MagicianPro.r.nextInt(50, 150);
        this.mana = maxMana;
    }

    public int Attack() {       // логика атаки
        int damage = BaseHero.r.nextInt(20, 30);
        this.mana -= (int)(damage * 0.8);
        if (mana < 0) return 0;
        else return damage;
    }

    public String getInfo() {       // получение информации
        return String.format("%s  Mana: %d", super.getInfo(), this.mana);
    }
}
