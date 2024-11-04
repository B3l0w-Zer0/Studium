package Lektion2;
import java.time.LocalTime;

public class UhrZeit03 {
    public static void main(String[] args) {
        int hour = LocalTime.now().getHour();
        int minute = LocalTime.now().getMinute();
        int second = LocalTime.now().getSecond();
        double SekundenSeitMitternacht = hour*3600 + minute*60 + second;
        System.out.println(SekundenSeitMitternacht); //Aufgabe a


        //Aufgabe b
        double GesamteSekunden = 3600 * 24;
        double VerbleibendeSekunden = GesamteSekunden - SekundenSeitMitternacht;
        System.out.println(VerbleibendeSekunden);

        double Prozentual = (SekundenSeitMitternacht / GesamteSekunden) *100; //Aufgabe c
        System.out.println(Prozentual);
}
}
