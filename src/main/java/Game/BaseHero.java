package Game;

import java.util.Random;

public abstract class BaseHero <W extends Weapon , S extends  Shield>  {
    private int health;
    private String name;
    protected W weapon;
    protected S shield;
    private boolean protects;

    protected BaseHero(int health, String name, W weapon) {
        this.health = health;
        this.name = name;
        this.weapon = weapon;
    }

    protected BaseHero(int health, String name, W weapon, S shield) {
        this.health = health;
        this.name = name;
        this.weapon = weapon;
        this.shield = shield;
        this.protects = true;
    }

    public boolean Protected() {
        return protects;
    }

    public int damageFork(){
        Random random = new Random();
        return random.nextInt(weapon.damage());
    }

    public boolean hit(BaseHero recepient){
        int damage = damageFork();
        return ! recepient.reduceHealth(damage);
    }

    public boolean reduceHealth(int damage){
        health -= damage;
        return health>0;
    }


    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public W getWeapon() {
        return weapon;
    }

    public void setWeapon(W weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {

        if (protects){
            return "BaseHero{" +
                    "health=" + health +
                    ", name='" + name + '\'' +
                    ", weapon=" + weapon +
                    ", shield=" + shield +
                    '}';
        }
        else {
            return "BaseHero{" +
                    "health=" + health +
                    ", name='" + name + '\'' +
                    ", weapon=" + weapon +
                    '}';
        }
    }
}