package org.example.units;

import java.util.ArrayList;

public class Monk extends Mage {
    int accuracy;

    public Monk(String name) {
        super(8, name,"stand", new Position(1,2), 3, 2 , 2,new int[]{6, 12},50);
    }
    public Monk(String name,Position position) {
        super(8, name,"stand", position, 3, 2,2, new int[]{6, 12},50);
    }
    public void meditation(){
        if (mana <= 43){
            mana += 7;
        }

    }
    @Override
    public String getInfo() {
        return "Monk";
    }
    @Override
    public void step(ArrayList<BaseHero> enemies, ArrayList<BaseHero> allies) {
        if (notLive()){return;}
        if (mana < 7){return;}
        if(castHeal(allies)){return;}
        meditation();
    }
}
