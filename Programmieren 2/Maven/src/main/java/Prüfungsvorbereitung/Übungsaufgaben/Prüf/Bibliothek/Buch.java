package Prüfungsvorbereitung.Übungsaufgaben.Prüf.Bibliothek;

public abstract class Buch implements Comparable<Buch>{
    String typ;
    String name;
    String autor;
    String verlag;
    int preisInCents;

    public Buch(String typ, String name, String autor, String verlag, int preisInCents)
    {
        this.typ = typ;
        this.name = name;
        this.autor = autor;
        this.verlag = verlag;
        this.preisInCents = preisInCents;
    }

    @Override
    public int compareTo(Buch other){
        int comp = this.autor.compareToIgnoreCase(other.autor);
        if(comp != 0) return comp;
        return this.name.compareToIgnoreCase(other.name);
    }
}
