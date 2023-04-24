package org.example.units;


public class Bandit extends BaseHero {
    int accuracy;

    public Bandit(String name) {
        super(6, name, new Position(0,0), 6, 13, new int[]{6, 12});
    }

    public Bandit(String name, Position position) {
        super(6, name, position, 13, 1, new int[]{6, 12});
    }

    public float dash(){
        return 0;
    }
    @Override
    public String getInfo() {
        return "Bandit";
    }
}