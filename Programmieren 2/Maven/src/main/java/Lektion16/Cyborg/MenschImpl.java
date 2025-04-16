package Lektion16.Cyborg;

public class MenschImpl implements Mensch{
    public Entscheidungen entscheide(Gefahr g) {
        if (Math.random() <= 0.25)
        {

            return Entscheidungen.Unentschieden;
        }else{
            switch(g) {
                case Gefahr_Links:
                    return Entscheidungen.Ausweichen_Rechts;
                case Gefahr_Rechts:
                    return Entscheidungen.Ausweichen_Links;
                case Gefahr_Vorne:
                    return Entscheidungen.Bremsen;
            }
        }
        return null;
    }


    @Override
    public void essen() {

    }

    @Override
    public void schlafen() {

    }

    @Override
    public void arbeiten() {

    }
}
