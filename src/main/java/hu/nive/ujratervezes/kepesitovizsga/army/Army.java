package hu.nive.ujratervezes.kepesitovizsga.army;

import java.util.ArrayList;
import java.util.List;

public class Army {

    private List<MilitaryUnit> army = new ArrayList<>();


    public void addUnit(MilitaryUnit militaryUnit) {

        army.add(militaryUnit);

    }

    public int getArmySize() {
        return army.size();
    }

    public int getArmyDamage(){
        int sum=0;
        for(MilitaryUnit item : army) {

            sum += item.damage;
        }
        return sum;
    }

    public void damageAll(int damage){
        List <MilitaryUnit> temp = new ArrayList<>();
        for(MilitaryUnit item : army) {

            item.sufferDamage(damage);
            if(item.getHitPoints() < 25) {
                temp.add(item);
            }

        }

        army.removeAll(temp);
    }
}
