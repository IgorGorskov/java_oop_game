package org.example.units;

public class Mage extends BaseHero{

    public Mage(String name) {
        super(6, name, new Position(1,2), 1, 1, new int[]{6, 12});
    }
    public Mage(String name,Position position) {
        super(6, name, position, 1, 1, new int[]{6, 12});
    }
    public float castFireball(){
        return 0;
    }
    public float castHeal(){
        return 0;
    }

    @Override
    public String getInfo() {
        return "Mage";
    }
}
