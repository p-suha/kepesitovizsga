package hu.nive.ujratervezes.kepesitovizsga.army;

public class HeavyCavalry extends MilitaryUnit{

 int multiple = 1 ;
    public HeavyCavalry() {

        this.damage = 60;
        this.hitPoints = 150;
        this.armor = false;
        this.multiple = multiple;
    }

    @Override
    int doDamage() {
        if (multiple == 1) {
            multiple ++;
            return damage;
        }

        return damage / 3;

    }

    @Override
    int sufferDamage(int damage) {
        return this.hitPoints = hitPoints - (damage / 2);
    }


}
