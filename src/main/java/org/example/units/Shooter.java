package org.example.units;

import java.util.ArrayList;

public abstract class Shooter extends BaseHero{
    int arrows, maxArrows;
    int accuracy;

    public Shooter(float hp, String name,String state, Position position, int atk, int def,int initiative, int[] damage, int arrows, int accuracy) {
        super(hp, name, state, position, atk, def,initiative, damage);
        this.arrows = arrows;
        maxArrows = arrows;
        this.accuracy = accuracy;
    }

    @Override
    public void step(ArrayList<BaseHero> enemies, ArrayList<BaseHero> allies) {
        BaseHero enemy;
        if (hp > 0 && arrows > 0 && state == "stand"){
            enemy = findClosesEnemy(enemies);
        }
        else return;

        for (BaseHero hero:
                allies) {
            if (hero.getInfo() == "Villager" && hero.getState() == "stand"){
                arrows =+ 1;
                hero.standBusy();
                break;
            }
        }
        enemy.getDamage(this);

    }



}
