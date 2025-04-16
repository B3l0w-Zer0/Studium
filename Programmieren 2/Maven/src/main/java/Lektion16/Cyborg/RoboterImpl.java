package Lektion16.Cyborg;

public class RoboterImpl implements Roboter{
    public Entscheidungen entscheide(Gefahr g) {
        switch (g) {
            case Gefahr_Links:
                return Entscheidungen.Ausweichen_Rechts;
            case Gefahr_Rechts:
                return Entscheidungen.Ausweichen_Links;
            case Gefahr_Vorne:
                return Entscheidungen.Bremsen;
        }
        return null;
    }

    @Override
    public void aufladen() {

    }

    @Override
    public void warten() {

    }

    @Override
    public void arbeiten() {

    }
}
