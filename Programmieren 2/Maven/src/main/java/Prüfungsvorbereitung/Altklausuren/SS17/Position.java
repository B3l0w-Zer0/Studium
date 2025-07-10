package Prüfungsvorbereitung.Altklausuren.SS17;

public final class Position implements Comparable<Position> {
    int zeilennummer, spaltennummer;

    public Position(int zeilennummer, int spaltennummer) {
        this.zeilennummer = zeilennummer;
        this.spaltennummer = spaltennummer;
    }

    @Override
    public int compareTo(Position p1) {
        if (this.zeilennummer != p1.zeilennummer) {
            return Integer.compare(this.zeilennummer, p1.zeilennummer);
        } else {
            return Integer.compare(this.spaltennummer, p1.spaltennummer);
        }
    }
        /*
        if(this.zeilennummer == p1.zeilennummer){
            if(this.spaltennummer == )
            return 0;
        }
        else return -1;
    }

         */

}
