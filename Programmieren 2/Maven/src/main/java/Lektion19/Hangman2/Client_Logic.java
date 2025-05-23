package Lektion19.Hangman2;

import java.io.Serializable;

public class Client_Logic implements Serializable {
    private char buchstabe;

    public Client_Logic(char buchstabe) {
        this.buchstabe = Character.toUpperCase(buchstabe);
    }

    public char getBuchstabe() {
        return buchstabe;
    }
}
