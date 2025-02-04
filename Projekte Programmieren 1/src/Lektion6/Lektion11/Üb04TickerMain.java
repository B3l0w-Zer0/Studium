package Lektion11;

public class Üb04TickerMain {
    public static void main(String[] args){
        Üb04Ticker ticker = new Üb04Ticker(45);
        ticker.setNachricht("Wettervorhersage: Schnee in Wüerzburg".toCharArray());
        System.out.println(ticker.getNachricht());
        for (int i = 0; i < 14; i++) {
            ticker.rotateNachricht(1);
            System.out.println(ticker.getNachricht());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        } //hier habe ich nur etwas ausprobiert, sodass es halt wie ein echter Nachrichtenticker immer weiter nach links geht live
    }
}
