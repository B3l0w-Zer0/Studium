package Lektion16.Change;

public class NewChangeCalculator implements ChangeCalculator {

    @Override
    public int[] getChange(int euros, int cent) {
        double change = euros*100+cent;
        if (cent > 99){
            throw new IllegalArgumentException("Cents dürfen nicht mehr als 99 sein.");
        }
        if (euros < 0 || cent < 0){
            throw new IllegalArgumentException("Es dürfen keine negativen Werte übergeben werden.");
        }
        int[]ausgabe = {0,0,0,0,0,0,0,0};
        while(change>0){
            if (change>=200){
                change -=200;
                ausgabe[7]++;
            } else if (change>=100){
                change-=100;
                ausgabe[6]++;
            } else if (change>=50){
                change-=50;
                ausgabe[5]++;
            } else if (change>=20){
                change-=20;
                ausgabe[4]++;
            } else if (change>=10){
                change-=10;
                ausgabe[3]++;
            } else if (change>=5){
                change-=5;
                ausgabe[2]++;
            } else if (change>=2){
                change-=2;
                ausgabe[1]++;
            } else if (change>=1){
                change-=1;
                ausgabe[0]++;
            }
        }
        return ausgabe;

    }
}
