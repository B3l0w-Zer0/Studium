package Prüfungsvorbereitung;
import java.time.LocalTime;

public class L2Üb3 {
    public static void main(String[] args){
        int stunde = LocalTime.now().getHour();
        int minute = LocalTime.now().getMinute();
        int sekunde = LocalTime.now().getSecond();
        int gesamtSek = (24 * 3600);

        //a)
        int heuteSek = (stunde * 3600 + minute * 60 + sekunde);
        System.out.println("Sekunden seit Mitternacht: " + heuteSek);

        //b)
        int verbleibendeSek = (gesamtSek - heuteSek);
        System.out.println("Verbleibende Sekunden für heute: " + verbleibendeSek);

        //c)
        double prozent = (double) ((heuteSek * 100.0) / gesamtSek);
        System.out.println("Prozent: " + prozent);

        //d)

    }
}
