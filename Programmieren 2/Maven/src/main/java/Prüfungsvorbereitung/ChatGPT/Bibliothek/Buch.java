package Prüfungsvorbereitung.ChatGPT.Bibliothek;

public class Buch extends Medium{
    public String autor;
    public String ISBN;

    public Buch(String autor, String ISBN, String titel){
        super(titel);
        this.autor = autor;
        this.ISBN = ISBN;
    }
    @Override
    public String toString(){
        return " hat das Buch: " + titel + ", mit dem Autor: " + autor + " und der ISBN: " + ISBN + " ausgeliehen";
    }

}
