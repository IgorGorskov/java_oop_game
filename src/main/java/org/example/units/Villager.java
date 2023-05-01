package org.example.units;

import java.util.ArrayList;

public class Villager extends BaseHero{

    int tonnage;

    public Villager(String name) {
        super(3, name,"stand", new Position(1,0), 1, 2,0, new int[]{6, 12});
    }
    public Villager(String name,Position position) {
        super(3, name,"stand", position, 1, 2,0, new int[]{6, 12});
    }
    public float jerk(){
        return 0;
    }
    @Override
    public String getInfo() {
        return "Villager";
    }

    @Override
    public void step(ArrayList<BaseHero> enemies, ArrayList<BaseHero> allies) {
        if (notLive()){return;}
        state = "stand";
    }
}
