package org.example.units;

    public class Crossbowman extends BaseHero {
        int arrows;
        int accuracy;

        public Crossbowman(String name) {
            super(8, name, 1, 6, 14, 3, new int[]{6, 12}, 3);
            arrows = 6;
            accuracy = 65;
        }
        public float shoot(){
            return 0;
        }
        public float strong_shoot(){
            return 0;
        }
        public void reload(){}


    }
