package Lektion4;

public class Countdown01 {
    public static void main(String[] args) {
        int start = 15;
        for (int i = start; i >= 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}