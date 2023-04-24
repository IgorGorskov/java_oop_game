package org.example.units;

public class Monk extends BaseHero {
    int accuracy;

    public Monk(String name) {
        super(8, name, new Position(1,2), 3, 2, new int[]{6, 12});
    }
    public Monk(String name,Position position) {
        super(8, name, position, 3, 2, new int[]{6, 12});
    }
    public int meditation(){
        return 0;
    }
    public float castHeal(){
        return 0;
    }
    @Override
    public String getInfo() {
        return "Monk";
    }
}
