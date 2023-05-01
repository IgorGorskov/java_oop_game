package org.example;

import org.example.units.BaseHero;

import java.util.ArrayList;

public interface IntrefaceGame {
    void step(ArrayList<BaseHero> enemies,ArrayList<BaseHero> allies);
    String getInfo();
}

