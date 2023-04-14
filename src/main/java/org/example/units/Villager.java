package org.example.units;

public class Villager extends BaseHero{

    int tonnage;

    public Villager(String name) {
        super(3, name, 1, 6, 1, 2, new int[]{6, 12}, 1);
    }
    public float jerk(){
        return 0;
    }
}
