package Prüfungsvorbereitung.Übungsaufgaben.Prüf.Twotter;

import java.io.Serializable;

public class User implements Serializable {
    final String benutzername;
    String passwort;

    public User(final String benutzername, String passwort) {
        this.benutzername = benutzername;
        this.passwort = passwort;
    }
}
