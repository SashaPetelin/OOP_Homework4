package Game.Shields;

import Game.Shield;

public class Backstop implements Shield {

    String shieldName;
    private int damageLevel;
    private boolean immovable;

    public Backstop(String shieldName, int damageLevel, boolean immovable) {
        this.shieldName = shieldName;
        this.damageLevel = damageLevel;
        this.immovable = immovable;
    }

    public boolean Immovable() {
        return immovable;
    }

    @Override
    public int shieldHP() {
        return damageLevel;
    }

    public int getDamageLevel() {
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

