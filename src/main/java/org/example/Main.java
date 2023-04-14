//Проанализировать и описать персонажей: Маг, монах, разбойник, копейщик, снайпер, арбалетчик, крестьянин.
// На базе описания персонажей описать простейшую иерархию классов. В основной программе создать по одному экземпляру каждого класса.

package org.example;


import org.example.units.*;

import java.util.ArrayList;

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




    }
}