package org.example.units;

public class Mage extends BaseHero{

    public Mage(String name) {
        super(6, name, 1, 6, 1, 1, new int[]{6, 12}, 1);
    }
    public float castFireball(){
        return 0;
    }
    public float castHeal(){
        return 0;
    }
}
