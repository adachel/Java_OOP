package Lections.Lection1.Nasledovanie.Pro;

import Lections.Lection1.Nasledovanie.Pro.MagicianPro;
import Lections.Lection1.Nasledovanie.Pro.BaseHero;

public class PriestPro extends BaseHero {
    private int elixir;
    private int maxElixir;

    public PriestPro() {
        super(String.format("Hero_Priest #%d", ++MagicianPro.number),
                MagicianPro.r.nextInt(100, 200));
        this.maxElixir = MagicianPro.r.nextInt(50, 150);
        this.elixir = maxElixir;
    }

    public int Attack() {
        int damage = BaseHero.r.nextInt(20, 30);
        this.elixir -= (int) (damage * 0.8);
        if (elixir < 0)
            return 0;
        else
            return damage;
    }

    public String getInfo() {
        return String.format("%s  Elixir: %d", super.getInfo(), this.elixir);
    }
}
