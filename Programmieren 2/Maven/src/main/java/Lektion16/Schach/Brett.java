package Lektion16.Schach;

public class Brett
{
  public boolean[][] brett = new boolean[8][8];
  
  public Brett()
  {
    
  }
  public Brett kombiniere(Brett brett2){
    for(int i = 0; i < 8; i++){
      for(int j = 0; j < 8; j++){
        if(brett[i][j]){
          brett2.brett[i][j] = true;
        }
      }
    }
    return brett2;
  }
  
  public void markiereFeld(int x, int y)
  {
    brett[x-1][y-1] = true;
  }
  
  public boolean gibFeld(int x, int y)
  {
    return brett[x-1][y-1];
  }
  
}
