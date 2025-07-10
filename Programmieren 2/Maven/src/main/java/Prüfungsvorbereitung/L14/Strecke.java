package Prüfungsvorbereitung.L14;

public class Strecke {
    int A;
    int B;

    public Strecke(int A, int B){
        if(A<0||B<0){
            throw new IllegalArgumentException("A or B are negative");
        }
        else if (A > B) {
            this.A = B;
            this.B = A;
        }else {
            this.A = A;
            this.B = B;
        }

        ///Das eine oder das andere ^ v

        //checkOrder(A, B);
    }

    /*public void checkOrder(int A, int B){
        if(A<0||B<0){
            throw new IllegalArgumentException("A or B are negative");
        }
        else if (A < B){
            A = A;
            B = B;
        }else{
            A = B;
            B = A;
        }
    }*/

    public boolean ueberschneiden(int a, int b){
            return a >= A && a < B || A >= a && A < b;
    }

    @Override
    public String toString(){
        if (A == B) {
            return String.valueOf(A);
        } else {
            int laenge = B - A;
            String ausgabe = String.valueOf(A);

            for (int i = 0; i < laenge ; i++) {
                ausgabe += '-';
            }
            return ausgabe + String.valueOf(B);
        }
    }

    public static void main(String[] args){
        Lektion14.Strecke strecke = new Lektion14.Strecke(6,3);
        System.out.println(strecke);
    }
}
