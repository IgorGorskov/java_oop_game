//Проанализировать и описать персонажей: Маг, монах, разбойник, копейщик, снайпер, арбалетчик, крестьянин.
// На базе описания персонажей описать простейшую иерархию классов. В основной программе создать по одному экземпляру каждого класса.

package org.example;


import org.example.units.*;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<BaseHero> heroes= new ArrayList<>();
        heroes.add(new Bandit("Dismas"));
        heroes.add(new Sniper("Legolas"));
        heroes.add(new Crossbowman("Van Helsing"));
        heroes.add(new Lancer("Leonid"));
        heroes.add(new Mage("Merlin"));
        heroes.add(new Monk("Rasputin"));
        heroes.add(new Villager("Bilbo"));
        heroes.add(new Villager("Hunchback"));

        ArrayList<BaseHero> randomHeroes= new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            String name = names.values()[new Random().nextInt(names.values().length)].toString();
            switch (new Random().nextInt(7)){
                case 0:
                    randomHeroes.add(new Bandit(name));
                    break;
                case 1:
                    randomHeroes.add(new Sniper(name));
                    break;
                case 2:
                    randomHeroes.add(new Crossbowman(name));
                    break;
                case 3:
                    randomHeroes.add(new Lancer(name));
                    break;
                case 4:
                    randomHeroes.add(new Mage(name));
                    break;
                case 5:
                    randomHeroes.add(new Monk(name));
                    break;
                case 6:
                    randomHeroes.add(new Villager(name));
                    break;
            }
        }
        for (BaseHero hero:randomHeroes) {
            System.out.println(hero.getInfo());
        }
    }
}