package org.example.units;

import java.util.ArrayList;

public abstract class Mage extends BaseHero{
    int mana;

    public Mage(float hp, String name,String state, Position position, int atk, int def,int initiative, int[] damage, int mana) {
        super(hp, name, state, position, atk, def,initiative, damage);
        this.mana = mana;
    }

    public boolean castHeal(ArrayList<BaseHero> allies){

        for (BaseHero hero:
                allies) {
            if (hero.hp < hero.maxHp - 10 && hero.getState() == "stand"){
                mana -= 10;
                hero.hp += 10;
                return true;

            }
        }
        return false;
    }

}
