//Проанализировать и описать персонажей: Маг, монах, разбойник, копейщик, снайпер, арбалетчик, крестьянин.
// На базе описания персонажей описать простейшую иерархию классов. В основной программе создать по одному экземпляру каждого класса.

package org.example;


import org.example.units.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<BaseHero> firstTeamHeros = createListHeroes(0);
        firstTeamHeros = sortInitiativeHeroes(firstTeamHeros);
        firstTeamHeros.forEach(hero -> System.out.println(hero.getName() + hero.getPosition() + hero.getInfo() + hero.getHp()));
        System.out.println();

//        ArrayList<BaseHero> secondTeamHeroes = createListHeroes(10);
//        secondTeamHeroes = sortInitiativeHeroes(secondTeamHeroes);
//        secondTeamHeroes.forEach(hero -> System.out.println(hero.getName() + hero.getPosition() + hero.getInfo()));
    }
    public static ArrayList<BaseHero> createListHeroes(int x){
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
    public static ArrayList<BaseHero> sortInitiativeHeroes(ArrayList<BaseHero> listHeroes){
        Collections.sort(listHeroes, new Comparator<BaseHero>() {
            @Override
            public int compare(BaseHero h1, BaseHero h2) {
                return h2.getInitiative() - h1.getInitiative();
            }
        });
        return listHeroes;
    }
}