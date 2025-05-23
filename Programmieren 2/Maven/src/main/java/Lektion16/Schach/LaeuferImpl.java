package Lektion16.Schach;

public class LaeuferImpl extends AbstractFigur implements Laeufer
{
  public LaeuferImpl(int x, int y)
  {
    super(x, y);
  }

  public Brett gibErlaubteFelder()
  {
    Brett brett = new Brett();
    //TODO: Ergänzen Sie den Algorithmus zur Bestimmung der Felder
    for (int i = x, j = y; i >0 && j > 0; i--, j--){
      brett.markiereFeld(i, j);
    }
    for (int i = x, j = y; i <= 8 && j > 0; i++, j--) {
      brett.markiereFeld(i, j);
    }
    for (int i = x, j = y; i > 0 && j <= 8; i--, j++) {
      brett.markiereFeld(i, j);
    }
    for (int i = x, j = y; i <= 8 && j <= 8; i++, j++) {
      brett.markiereFeld(i, j);
    }
    return brett;
  }
  
  public static void main(String[] args)
  {
    LaeuferImpl l = new LaeuferImpl(4,5);
    Brett brett = l.gibErlaubteFelder();
    for (int j = 1; j <= 8; j++)
    {
      for (int i = 1; i <= 8; i++)
      {
        if (brett.gibFeld(i, j)) System.out.print("x");
        else System.out.print("o");
      }
      System.out.println();
    }
  }
}
