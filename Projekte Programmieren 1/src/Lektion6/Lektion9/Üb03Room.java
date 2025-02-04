package Lektion9;

public class Üb03Room {
    public static void main(String[]args){
    Üb03RoomConstructor i215 = new Üb03RoomConstructor("I.2.15", 32, false);
    Üb03RoomConstructor i21 = new Üb03RoomConstructor("I.2.1", 40, false);

        System.out.println();
        System.out.println(i215.getBelegt());
        System.out.println(i21.getBelegt());
        i21.setBelegt(true);
        System.out.println();
        System.out.println(i215.getBelegt());
        System.out.println(i21.getBelegt());
}
}

