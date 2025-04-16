package Lektion16.Cyborg;

public class Main {
    public static void main(String[] args){
        Cyborg cyborg = new Cyborg();
        MenschImpl mensch = new MenschImpl();
        RoboterImpl roboter = new RoboterImpl();

        System.out.println("Bei einer Gefahr von Links macht der Mensch: " + mensch.entscheide(Gefahr.Gefahr_Links));
        System.out.println("Bei einer Gefahr von Rechts macht der Mensch: " + mensch.entscheide(Gefahr.Gefahr_Rechts));
        System.out.println("Bei einer Gefahr von Vorne macht der Mensch: " + mensch.entscheide(Gefahr.Gefahr_Vorne));
        System.out.println("Bei einer Gefahr von Links macht der Roboter: " + roboter.entscheide(Gefahr.Gefahr_Links));
        System.out.println("Bei einer Gefahr von Rechts macht der Roboter: " + roboter.entscheide(Gefahr.Gefahr_Rechts));
        System.out.println("Bei einer Gefahr von Vorne macht der Roboter: " + roboter.entscheide(Gefahr.Gefahr_Vorne));
        System.out.println("Bei einer Gefahr von Links macht der Cyborg: " + cyborg.entscheideCyborg(Gefahr.Gefahr_Links));
        System.out.println("Bei einer Gefahr von Rechts macht der Cyborg: " + cyborg.entscheideCyborg(Gefahr.Gefahr_Rechts));
        System.out.println("Bei einer Gefahr von Vorne macht der Cyborg: " + cyborg.entscheideCyborg(Gefahr.Gefahr_Vorne));
    }
}
