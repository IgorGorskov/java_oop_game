package org.example.units;

import java.util.ArrayList;

public class Lancer extends BaseHero {

    public Lancer(String name) {
        super(9, name, "stand", new Position(1, 2), 12, 2, 1, new int[]{6, 12});
    }

    public Lancer(String name, Position position) {
        super(60, name, "stand", position, 12, 2, 1, new int[]{6, 12});
    }

    public float jerk() {
        return 0;
    }

    @Override
    public String getInfo() {
        return "Lancer";
    }

    @Override
    public void step(ArrayList<BaseHero> enemies, ArrayList<BaseHero> allies) {
        if (this.notLive()){return;}
        BaseHero enemy = findClosesEnemy(enemies);
        if (this.position.go(this, enemy)){
            enemy.getDamage(this);
        }

    }
}