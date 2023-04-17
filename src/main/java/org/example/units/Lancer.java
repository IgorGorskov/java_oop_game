package org.example.units;

public class Lancer extends BaseHero {

    public Lancer(String name) {
        super(9, name, 1, 6, 12, 2, new int[]{6, 12}, 2);
    }
    public float jerk(){
        return 0;
    }
    @Override
    public String getInfo() {
        return "Lancer";
    }
}