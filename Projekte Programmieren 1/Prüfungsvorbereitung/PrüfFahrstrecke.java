package Prüfungsvorbereitung;

public class PrüfFahrstrecke {
    PrüfDistanz root;

    public static void main(String[] args) {
        PrüfFahrstrecke p = new PrüfFahrstrecke();
        p.einfügen(new PrüfDistanz("Halt dein Maul", 1312, null));
        p.einfügen(new PrüfDistanz("Hallo", 99, null));
        System.out.println(p.gesamtStrecke());

    }

    public PrüfFahrstrecke() {
        root = null;
    }

    public void einfügen(PrüfDistanz nextNode) {

        if (root == null) {
            root = nextNode;
        } else {
            PrüfDistanz aktuell = root;
            while (aktuell.next != null) {
                aktuell = aktuell.next;

            }
            aktuell.next = nextNode;
        }
    }

    public int gesamtStrecke() {
        int summe = 0;
        if(root != null) {
            summe = root.distanz;
            PrüfDistanz aktuell = root;
            while (aktuell.next != null) {
                aktuell = aktuell.next;
                summe += aktuell.distanz;
            }
        }
        return summe;
    }
}
