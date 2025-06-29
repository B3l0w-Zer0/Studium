package Lektion22.YinYang;

public class YinYangAnonym {
    private String YinOYang;
    String Ergebnis;

    public YinYangAnonym(String YinOYang){
        this.YinOYang = YinOYang;
    }

    public void starteThread() {
        Thread t = new Thread() {
            public void run() {
                try {
                    while (true) {
                        System.out.println(YinOYang);
                        Thread.sleep(500);
                    }
                } catch (InterruptedException e) {
                    System.out.println(YinOYang + " Thread wurde unterbrochen.");
                }

            }
        };
        t.start();
    }
    public static void main(String[] args) throws InterruptedException {

        YinYangAnonym Yin = new YinYangAnonym("Yin");
        Yin.starteThread();
        YinYangAnonym Yang = new YinYangAnonym("Yang");
        Yang.starteThread();

    }


}
