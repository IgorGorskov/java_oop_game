package org.example.units;


public class Bandit extends BaseHero {
    int accuracy;

    public Bandit(String name) {
        super(6, name, 1, 6, 13, 1, new int[]{6, 12}, 1);
    }
    public float dash(){
        return 0;
    }
    @Override
    public String getInfo() {
        return "Bandit";
    }
}