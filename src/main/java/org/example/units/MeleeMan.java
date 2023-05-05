package org.example.units;

import java.util.ArrayList;

public abstract class MeleeMan extends BaseHero{
    public MeleeMan(float hp, String name,String state, Position position, int atk, int def,int initiative, int[] damage) {
        super(hp, name, state, position, atk, def,initiative, damage);
    }
    @Override
    public void step(ArrayList<BaseHero> enemies, ArrayList<BaseHero> allies) {
        if (this.notLive()){return;}
        BaseHero enemy = findClosesEnemy(enemies);
        if (distanceTwoCharacter(this,enemy) < 2.0){
            enemy.getDamage(this);
            return;
        }
        this.position.go(this, enemy);
    }
}
