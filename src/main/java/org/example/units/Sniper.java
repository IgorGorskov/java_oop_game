package org.example.units;

import java.util.Arrays;

public class Sniper extends BaseHero {
    int arrows;
    int accuracy;

    public Sniper(String name) {
        super(7, name, 1, 6, 12, 2, new int[]{6, 12}, 5);
        arrows = 10;
        accuracy = 70;
    }
    public float shoot(){
        return 0;
    }
    public float long_shoot(){
        return 0;
    }
    @Override
    public String getInfo() {
        return "Sniper";
    }
}
