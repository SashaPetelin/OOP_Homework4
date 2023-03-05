package Game;

import Game.Shields.RegularHandShield;
import Game.Weapons.Melee;

public class Footman extends BaseHero<Melee, RegularHandShield> {

    public Footman(int health, String name, Melee weapon) {
        super(health, name, weapon);
    }

    public Footman(int health, String name, Melee weapon, RegularHandShield shield) {
        super(health, name, weapon, shield);
    }

    @Override
    public String toString() {
        return "Footman{" +
                "} " + super.toString() + "\n" +  "~~~";
    }
}
