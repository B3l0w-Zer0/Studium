package Lektion12;

public class EinfacheListe {
    Zahl head;

    public void addZahl(EinfacheListe list, int value){
        Zahl newZahl = new Zahl(value);
        if (head == null) {
            head = newZahl;
        } else{
            Zahl current = head;
            while (current.getNext() != null){
                current = current.getNext();
            }
            current.setNext(newZahl);
        }
    }
}
