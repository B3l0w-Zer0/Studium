package Prüfungsvorbereitung.Übungsaufgaben.Prüf.Twotter;

import java.util.List;
import java.io.*;

public class UserManager implements ObjectManager<User> {
    private static final String Filename = "user.dat";

    @Override
    public void serialize(List<User> users) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(Filename))) {
            out.writeObject(users);
        } catch (IOException e) {
            throw new RuntimeException("Fehler bei Serialisation! DU HUEN.");
        }
    }

    @Override
    public List<User> deserialize() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(Filename))) {
            return (List<User>) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException("Fehler bei Deserialisieren! DU BASTARD!", e);
        }
    }
}
