package Lektion14Tests;

public class Punkt {
    int x;
    int y;

    public void verschiebePunkt(int zielX, int zielY) {
        if(x > 1920 || x < 0 || y > 1080 || y < 0) {
            throw new RuntimeException("Invalid");
        }
        x = zielX;
        y = zielY;
    }
}
