package Lektion22.YinYang;

public class YinYangRunnable implements Runnable {
    private String YinOYang;

    public YinYangRunnable(String YinOYang){
        this.YinOYang = YinOYang;
    }
    public static void main(String[] args) {
        YinYangRunnable YRYin = new YinYangRunnable("Yin");
        Thread YYRYin = new Thread(YRYin);
        YYRYin.start();
        YinYangRunnable YRYang = new YinYangRunnable("Yang");
        Thread YYRYang = new Thread(YRYang);
        YYRYang.start();
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


