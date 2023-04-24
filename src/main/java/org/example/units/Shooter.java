package org.example.units;

import java.util.ArrayList;

public abstract class Shooter extends BaseHero{
    int arrows, maxArrows;
    int accuracy;

    public Shooter(float hp, String name, Position position, int atk, int def, int[] damage, int arrows, int accuracy) {
        super(hp, name, position, atk, def, damage);
        this.arrows = arrows;
        maxArrows = arrows;
        this.accuracy = accuracy;
    }
    public void step(){
        if (hp > 0 && arrows > 0){
            //pass
        }
        else return;
    }
}
