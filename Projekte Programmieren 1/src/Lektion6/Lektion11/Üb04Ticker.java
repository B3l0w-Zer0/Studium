package Lektion11;

public class Üb04Ticker {
    private char[] nachricht;

    public Üb04Ticker() {
        this.nachricht = new char[200];
        for (int i = 0; i < this.nachricht.length; i++) {
            this.nachricht[i] = ' ';
        }
    }

    public Üb04Ticker(int groesse) {
        if (groesse > 0) this.nachricht = new char[groesse];
        else this.nachricht = new char[200];
        for (int i = 0; i < this.nachricht.length; i++) {
            this.nachricht[i] = ' ';
        }
    }

    public int getGroesse() {
        return this.nachricht.length;
    }

    public char[] getNachricht() {
        return nachricht;
    }

    public void setNachricht(char[] nachricht) {
            for (int i = 0; i < this.nachricht.length; i++) {
                if (i < nachricht.length){
                    this.nachricht[i] = nachricht[i];

        } else {
                this.nachricht[i] = '+';
            }
        }
    }

    public void resetNachricht(char zeichen) {
        for (int i = 0; i < this.nachricht.length; i++) {
            this.nachricht[i] = zeichen;
        }
    }

    public void resetNachricht() {
        for (int i = 0; i < this.nachricht.length; i++) {
            this.nachricht[i] = '+';
        }
    }

    public void rotateNachricht(int distance) {
        if (distance >= 200 || distance <= 0) {
            this.nachricht = nachricht;
        } else {
            char c;
            for (int j = 0; j < distance; j++) {
                c = this.nachricht[0];
                for (int i = 1; i < this.nachricht.length; i++) {
                    this.nachricht[i - 1] = this.nachricht[i];
                }
                this.nachricht[this.nachricht.length - 1] = c;
            }
        }
    }
}

//HILFE FOR REAL BITTE HELFT MIR!