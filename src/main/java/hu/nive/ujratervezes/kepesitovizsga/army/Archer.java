package hu.nive.ujratervezes.kepesitovizsga.army;

public class Archer extends MilitaryUnit {

    public Archer() {
        this.damage = 20;
        this.hitPoints = 50;
        this.armor = false;
    }

    @Override
    int doDamage() {
        return damage;
    }

    @Override
    int sufferDamage(int damage) {
        return this.hitPoints = hitPoints - damage;
    }


}
