package hu.nive.ujratervezes.kepesitovizsga.army;

public abstract class MilitaryUnit {

    int hitPoints;
    int damage;
    boolean armor;

    public MilitaryUnit() {
        this.hitPoints = hitPoints;

            }

    public int getHitPoints() {
        return hitPoints;
    }


    abstract int doDamage();

    abstract int sufferDamage(int damage);
}
