package Lektion16.Cyborg;

public class Cyborg implements Mensch, Roboter{
    MenschImpl human = new MenschImpl();
    RoboterImpl robot = new RoboterImpl();

    public Entscheidungen entscheideCyborg(Gefahr g){
        Entscheidungen roboter = robot.entscheide(g);
        Entscheidungen mensch = human.entscheide(g);
        if(Math.random() <= 0.5 || roboter == mensch){
            return roboter;
        }
        else{
            return mensch;
        }
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

    @Override
    public void aufladen() {

    }

    @Override
    public void warten() {

    }
}
