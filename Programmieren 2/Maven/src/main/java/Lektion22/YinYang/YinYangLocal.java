package Lektion22.YinYang;

public class YinYangLocal {
        private String YinOYang;
        public YinYangLocal(String YinOYang){
            this.YinOYang = YinOYang;
        }
    public static void main(String[] args) {
        class runLocalThread extends Thread{
            private String YinOYang;
            public runLocalThread(String YinOYang){
                this.YinOYang = YinOYang;
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
        Thread Yin = new runLocalThread("Yin");
        Yin.start();
        Thread Yang = new runLocalThread("Yang");
        Yang.start();
    }
}
