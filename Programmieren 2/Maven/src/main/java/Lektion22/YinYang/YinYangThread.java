package Lektion22.YinYang;

public class YinYangThread extends Thread{
    private String YinOYang;
    String Ergebnis;

    public YinYangThread(String YinOYang){
        this.YinOYang = YinOYang;
    }
    public static void main(String[] args) throws InterruptedException {
            YinYangThread YTYin = new YinYangThread("Yin");
            YTYin.start();
            YinYangThread YTYang = new YinYangThread("Yang");
            YTYang.start();
}

    @Override
    public void run(){
        try {
            while(true) {
                System.out.println(YinOYang);
                Thread.sleep(500);
            }
        }
        catch (InterruptedException e) {
            System.out.println(YinOYang + " Thread wurde unterbrochen.");
        }

    }
}
