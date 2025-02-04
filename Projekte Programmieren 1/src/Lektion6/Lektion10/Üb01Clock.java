package Lektion10;

public class Üb01Clock {
    public static void main(String[] args) {
        Üb01ClockConstructor uhr = new Üb01ClockConstructor(23, 2, 43);
        System.out.println(uhr.get_h() + ":" + uhr.get_min() + ":" + uhr.get_sec());
        uhr.set_clock(25, 67, 130);
                Üb01ClockConstructor[] weltuhr = gen_clocks();
        count_up(weltuhr);

	}

        private static Üb01ClockConstructor[] gen_clocks() {
            Üb01ClockConstructor[] clocks = new Üb01ClockConstructor[24];
            for (int i = 0; i < clocks.length; i++) {
                clocks[i] = new Üb01ClockConstructor(i, 23, 7 + i);

            }
            return clocks;
        }

        private static void count_up(Üb01ClockConstructor[] clocks) {
            for (int i = 0; i < clocks.length; i++) {
                clocks[i].next_sec();
                System.out.println("Stunde: "+ clocks[i].get_h() + " Minute: " + clocks[i].get_min() + " Sekunde: " + clocks[i].get_sec());
                System.out.println();
                System.out.println();
            }
        }

    }


