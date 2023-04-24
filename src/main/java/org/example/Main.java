//Проанализировать и описать персонажей: Маг, монах, разбойник, копейщик, снайпер, арбалетчик, крестьянин.
// На базе описания персонажей описать простейшую иерархию классов. В основной программе создать по одному экземпляру каждого класса.

package org.example;


import org.example.units.*;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<BaseHero> firstTeamHeros = creatListHeros(0);
        firstTeamHeros.forEach(hero -> System.out.println(hero.getName() + hero.getPosition()));
        System.out.println();
        ArrayList<BaseHero> secondTeamHeros = creatListHeros(10);
        secondTeamHeros.forEach(hero -> System.out.println(hero.getName() + hero.getPosition()));
    }
    public static ArrayList<BaseHero> creatListHeros(int x){
        ArrayList<BaseHero> randomHeroes= new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            String name = names.values()[new Random().nextInt(names.values().length)].toString();
            Position position = new Position(x,i);
            switch (new Random().nextInt(7)){
                case 0:
                    randomHeroes.add(new Bandit(name,position));
                    break;
                case 1:
                    randomHeroes.add(new Sniper(name,position));
                    break;
                case 2:
                    randomHeroes.add(new Crossbowman(name,position));
                    break;
                case 3:
                    randomHeroes.add(new Lancer(name,position));
                    break;
                case 4:
                    randomHeroes.add(new Mage(name,position));
                    break;
                case 5:
                    randomHeroes.add(new Monk(name,position));
                    break;
                case 6:
                    randomHeroes.add(new Villager(name,position));
                    break;
            }
        }
//        for (BaseHero hero:randomHeroes) {
//            System.out.println(hero.getInfo());
//        }
    return randomHeroes;
    }
}