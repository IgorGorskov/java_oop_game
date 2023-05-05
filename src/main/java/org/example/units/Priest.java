package org.example.units;

import java.util.ArrayList;

public class Priest extends Mage{

    public Priest(String name) {
        super(8, name,"stand", new Position(1,2), 3, 2 , 2,new int[]{6, 12}, 60);
    }
    public Priest(String name,Position position) {
        super(8, name,"stand", position, 3, 2,2, new int[]{6, 12}, 60);
    }

    public void castDefVillager(ArrayList<BaseHero> allies){
        for (BaseHero hero:
                allies) {
            if (hero.getInfo() == "Villager" && hero.getState() == "stand" && hero.def <= 2){
                hero.def++;
                mana =- 7;
                break;
            }
        }
    }
    @Override
    public String getInfo() {
        return "Priest";
    }
    @Override
    public void step(ArrayList<BaseHero> enemies, ArrayList<BaseHero> allies) {
        if (notLive()){return;}
        if (mana < 7){return;}
        if(castHeal(allies)){return;}
        castDefVillager(allies);
    }
}
