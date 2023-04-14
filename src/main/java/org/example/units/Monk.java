package org.example.units;

public class Monk extends BaseHero {
    int accuracy;

    public Monk(String name) {
        super(8, name, 1, 6, 3, 2, new int[]{6, 12}, 1);
    }
    public int meditation(){
        return 0;
    }
    public float castHeal(){
        return 0;
    }
}
