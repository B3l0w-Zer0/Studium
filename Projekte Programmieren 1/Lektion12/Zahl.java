package Lektion12;

public class Zahl {
    private final int value;
    private Zahl next;

    public Zahl(int value) {
        this.value = value;
        this.next = null;
    }

    public int getValue() {
        return value;
    }

    public Zahl getNext() {
        return next;
    }

    public void setNext(Zahl next) {
        this.next = next;
    }
}