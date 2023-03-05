package Game;

import Game.Shields.Backstop;
import Game.Weapons.Ranged;

public class Archer extends BaseHero<Ranged , Backstop>{
    public Archer(int health, String name, Ranged ranged) {
        super(health, name, ranged);
    }

    public Archer(int health, String name, Ranged ranged, Backstop shield) {
        super(health, name, ranged, shield);
    }

    @Override
    public Ranged getWeapon() {
        return super.getWeapon();
    }

    public  int range(){
        return ((Ranged)weapon).getRange();
    }

    @Override
    public String toString() {
        return /*"Archer{" +
                "weapon=" + weapon +
                "} " +*/ "Archer{" + super.toString() + "\n" +  "~~~";
    }
}
