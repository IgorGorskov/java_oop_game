package org.example.units;

import org.example.Main;

import java.util.ArrayList;
import java.util.Base64;

public class Position {
    int x,y;
    public Position(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void go(BaseHero walker, BaseHero stander) {
        double dis = Math.sqrt((Math.pow(walker.position.x - stander.position.x, 2) + Math.pow(walker.position.y - stander.position.y, 2)));
        if (dis <= Math.sqrt(2)){return;}

        int direction_x = 1;
        int direction_y = 1;
        if (walker.position.x > stander.position.x){direction_x = -1;}
        if (walker.position.y > stander.position.y){direction_y = -1;}

        if (checkPosition(walker.position.x + direction_x, walker.position.y)) {
            walker.position.x += direction_x;
            return;
            }
        if (checkPosition(walker.position.x, walker.position.y + direction_y )){
            walker.position.y += direction_y;
            return;
        }
        if (checkPosition(walker.position.x, walker.position.y - direction_y)) {
            walker.position.y -= direction_y;
            return;
        }
        if (checkPosition(walker.position.x - direction_x, walker.position.y)) {
            walker.position.x -= direction_x;
        }
    }
    protected double distanceTwoPoint(int x1, int y1, int x2, int y2){
        return Math.sqrt((Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
    }
    protected boolean checkPosition(int x, int y){
        for (BaseHero hero:
             Main.allTeam) {
            if (hero.position.x == x && hero.position.y == y || (x > 10 || x < 0) || (y > 10 || y < 0)){
                return false;
            }
        }
        return true;
    }
}
