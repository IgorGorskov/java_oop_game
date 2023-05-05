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
        double damage = (enemy.getAtk() - def) * 0.05 * rnd(enemy.getDamage()[0], enemy.getDamage()[1]);
        if (damage >= hp){
            hp = 0;
        }
        else {
            hp -= damage;
        }
    }

    protected int[] getDamage() {
        return damage;
    }

    public BaseHero findClosesEnemy(ArrayList<BaseHero> enemyTeam) {
        double distance;
        double minDistance = 200;
        BaseHero closeEnemy = enemyTeam.get(0);
        for (BaseHero enemy :
                enemyTeam) {
            distance = distanceTwoCharacter(enemy, this);
            if (minDistance > distance) {
                if(enemy.state != "die"){
                    minDistance = distance;
                    closeEnemy = enemy;
                }
            }
        }
        return closeEnemy;
    }
    protected double distanceTwoCharacter(BaseHero charOne, BaseHero charTwo){
        return Math.sqrt((Math.pow(charOne.position.x - charTwo.position.x, 2) + Math.pow(charOne.position.y - charTwo.position.y, 2)));
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
    protected void standDie() {
        state = "die";
    }

    @Override
    public void step(ArrayList<BaseHero> enemies, ArrayList<BaseHero> allies) {

    };

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
                + this.getInfo() + " " + state + " x: "
                + this.position.x + " y: " + this.position.y;

    }
    protected boolean notLive(){
        if (hp <= 0){
            this.state = "die";
            return true;
        }
        else {return false;}
    }
}