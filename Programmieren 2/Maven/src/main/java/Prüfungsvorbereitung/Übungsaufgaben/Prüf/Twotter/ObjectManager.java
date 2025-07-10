package Prüfungsvorbereitung.Übungsaufgaben.Prüf.Twotter;

import java.util.List;

public interface ObjectManager<User>
{
    public void serialize(List<User> object);
    public List<User> deserialize();
}