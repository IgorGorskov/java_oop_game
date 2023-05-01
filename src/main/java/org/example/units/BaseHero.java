package org.example.units;

import org.example.IntrefaceGame;

import java.util.ArrayList;
import java.util.Random;

public abstract class BaseHero implements IntrefaceGame {
    float hp, maxHp;
    String name;
    Position position;
    int atk;
    int def;
    int[] damage;
    int initiative;
    String state;

    public BaseHero(float hp, String name, String state, Position position, int atk, int def, int initiative, int[] damage) {
        this.hp = hp;
        this.maxHp = hp;
        this.name = name;
        this.position = position;
        this.atk = atk;
        this.def = def;
        this.damage = damage;
        this.initiative = initiative;
        this.state = state;
    }

    public void getDamage(BaseHero enemy) {
        hp -= (enemy.getAtk() - def) * 0.05 * rnd(enemy.getDamage()[0], enemy.getDamage()[1]);

    }

    protected int[] getDamage() {
        return damage;
    }

    protected BaseHero findClosesEnemy(ArrayList<BaseHero> enemyTeam) {
        double distance = enemyTeam.size() * 2;
        double minDistance = enemyTeam.size() * 2;
        BaseHero closeEnemy = enemyTeam.get(0);
        for (BaseHero enemy :
                enemyTeam) {
            distance = Math.sqrt((Math.pow(enemy.position.x - this.position.x, 2) + Math.pow(enemy.position.y - this.position.y, 2)));
            if (minDistance > distance) {
                minDistance = distance;
                closeEnemy = enemy;
            }
        }
        return closeEnemy;
    }

    public String getName() {
        return name;
    }

    public int getInitiative() {
        return initiative;
    }

    public float getHp() {
        return hp;
    }

    public String getPosition() {
        return " x:" + Integer.toString(position.x) + " y:" + Integer.toString(position.y);
    }

    public int[] getCoords() {
        return new int[]{position.x, position.y};
    }

    public int getAtk() {
        return atk;
    }

    protected int getDef() {
        return def;
    }

    protected float attack() {
        return 0;
    }

    protected int move() {
        return 0;
    }

    protected int defence() {
        return 0;
    }

    @Override
    public String getInfo() {
        return "";
    }

    protected String getState() {
        return state;
    }

    protected void standBusy() {
        state = "busy";
    }

    @Override
    public void step(ArrayList<BaseHero> enemies, ArrayList<BaseHero> allies) {
    }

    ;

    public static int rnd(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    @Override
    public String toString() {
        return name +
                " H:" + Math.round(hp) +
                " D:" + def +
                " A:" + atk +
                " Dmg:" + Math.round(Math.abs((damage[0] + damage[1]) / 2)) +
                " "
                + this.getInfo() + " " + state;

    }
}