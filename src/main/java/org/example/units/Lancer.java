package org.example.units;

public class Lancer extends BaseHero {

    public Lancer(String name) {
        super(9, name, new Position(1,2), 12, 2, new int[]{6, 12});
    }
    public Lancer(String name,Position position) {
        super(9, name, position, 12, 2, new int[]{6, 12});
    }
    public float jerk(){
        return 0;
    }
    @Override
    public String getInfo() {
        return "Lancer";
    }
}