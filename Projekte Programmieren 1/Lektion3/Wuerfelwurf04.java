package Lektion3;

public class Wuerfelwurf04 {
        public static void main(String[] args) {
            int wuerfelwurf = (int) (Math.random() * 6) + 1;

            switch (wuerfelwurf) {
                case 1:
                    System.out.println("Eins gewürfelt");
                    break;
                case 2:
                    System.out.println("Zwei gewürfelt");
                    break;
                case 3:
                    System.out.println("Drei gewürfelt");
                    break;
                case 4:
                    System.out.println("Vier gewürfelt");
                    break;
                case 5:
                    System.out.println("Fünf gewürfelt");
                    break;
                default:
                    System.out.println("Sechs gewürfelt");
                    break;

            }
        }
    }

