package org.example.units;

import java.util.ArrayList;

public class Lancer extends MeleeMan{

    public Lancer(String name) {
        super(9, name, "stand", new Position(1, 2), 12, 2, 1, new int[]{6, 12});
    }

    public Lancer(String name, Position position) {
        super(100, name, "stand", position, 12, 2, 1, new int[]{6, 12});
    }

    public float jerk() {
        return 0;
    }

    @Override
    public String getInfo() {
        return "Lancer";
    }

}