package org.example.units;

public class Villager extends BaseHero{

    int tonnage;

    public Villager(String name) {
        super(3, name, new Position(1,0), 1, 2, new int[]{6, 12});
    }
    public Villager(String name,Position position) {
        super(3, name, position, 1, 2, new int[]{6, 12});
    }
    public float jerk(){
        return 0;
    }
    @Override
    public String getInfo() {
        return "Villager";
    }
}
