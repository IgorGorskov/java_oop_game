package org.example.units;

public class Position {
    int x,y;
    public Position(int x, int y){
        this.x = x;
        this.y = y;
    }
    public boolean go(BaseHero walker, BaseHero stander) {
        int x1 = walker.position.x;
        int y1 = walker.position.y;
        int x2 = stander.position.x;
        int y2 = stander.position.y;
        int dif_x = Math.abs(x1 - x2);
        int dif_y = Math.abs(y1 - y2);
        if (dif_x * dif_x + dif_y * dif_y == 1){return true;}

        if (dif_x > dif_y){
            if (x1 > x2){walker.position.x --;}
            if (x1 <= x2) {walker.position.x ++;}
        }
        if (dif_y >= dif_x){
            if (y1 > y2){walker.position.y --;}
            if (y1 <= y2) {walker.position.y ++;}
        }
        return false;
    }
}
