package Prüfungsvorbereitung.L14;

public class Punkt {
    int x;
    int y;

    public void verschiebePunkt(int zielX, int zielY){
        x = zielX;
        y = zielY;

        if(zielX < 0 || zielY < 0 || zielX > 1920 || zielY > 1080){
            throw new RuntimeException("Not Valid!");
        }
    }
}
