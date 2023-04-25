package org.example.units;

    public class Crossbowman extends Shooter {
        int arrows;
        int accuracy;

        public Crossbowman(String name) {
            super(8, name,"stand", new Position(0,0), 14, 3,3, new int[]{6, 12},6,65);
        }
        public Crossbowman(String name,Position position) {
            super(8, name,"stand", position, 14, 3,3, new int[]{6, 12},6,65);
        }
        public float strong_shoot(){
            return 0;
        }
        @Override
        public String getInfo() {
            return "Crossbowman";
        }

    }
