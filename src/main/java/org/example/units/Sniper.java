package org.example.units;

import java.util.Arrays;

public class Sniper extends Shooter {


    public Sniper(String name) {
        super(7, name, new Position(0,0), 12, 2, new int[]{6, 12},10,70);
    }
    public Sniper(String name, Position position) {
        super(7, name, position, 12, 2, new int[]{6, 12},10,70);
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
