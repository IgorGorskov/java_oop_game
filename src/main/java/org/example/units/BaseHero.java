package org.example.units;

public abstract class BaseHero {
    float hp,maxHp;
    String name;
    int x, y;
    int atk;
    int def;
    int[] damage;
    int disAtk;
    public BaseHero(float hp, String name, int x, int y, int atk, int def, int[] damage,int disAtk) {
        this.hp = hp;
        this.maxHp = hp;
        this.name = name;
        this.x = x;
        this.y = y;
        this.atk = atk;
        this.def = def;
        this.damage = damage;
        this.disAtk = disAtk;
    }

    public float attack (){
        return 0;
    }
    public int move (){
        return 0;
    }
    public int defence (){
        return 0;
    }



}
