package Lektion14;

public class Strecke {
    public int A;
    public int B;

    public Strecke(int A, int B) {
        if(A<0||B<0){
            throw new IllegalArgumentException("A and B are negative");
        }

        if (A > B) {
            this.A = B;
            this.B = A;
        }
        this.A = A;
        this.B = B;
    }

public int getA (){
    return A;
}
public int getB (){
    return B;
}

public boolean ueberschneiden(int a, int b){

    return A <= b && B > a || A > b && B <= a;

}


@Override
public String toString() {

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
public static void main(String[] args) {
    Strecke strecke = new Strecke(2,1);
    System.out.println(strecke);

}
}
