package Game.Shields;

import Game.Shield;

public class RegularHandShield implements Shield {

    String shieldName;

    private int damageLevel;

    public int getDamageLevel() {
        return damageLevel;
    }

    private boolean strapped;

    public RegularHandShield(String shieldName, int damageLevel, boolean strapped) {
        this.shieldName = shieldName;
        this.damageLevel = damageLevel;
        this.strapped = strapped;
    }

    public boolean Strapped() {
        return strapped;
    }

    @Override
    public int shieldHP() {
        return damageLevel;
    }

    @Override
    public String toString() {
        return "HandShield{" +
                "shieldName='" + shieldName + '\'' +
                ", damageLevel=" + damageLevel +
                '}';
    }
}
