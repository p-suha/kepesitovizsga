package hu.nive.ujratervezes.kepesitovizsga.army;

public class Swordsman extends MilitaryUnit {


    boolean shield = true;
    int multiple = 1;

    public Swordsman(boolean armor) {

        this.damage = 10;
        this.hitPoints = 100;
        this.armor = armor;
        this.multiple = multiple;
        this.shield = true;
    }


    @Override
    int doDamage() {
        return damage;
    }

    @Override
    int sufferDamage(int damage) {

        if (multiple == 1) {
            shield = false;
            multiple = 0;
            return this.hitPoints = hitPoints;
        }

        if (armor) {
            return this.hitPoints = hitPoints - (damage / 2);
        } else {
            return this.hitPoints = hitPoints - damage;
        }

    }
}
