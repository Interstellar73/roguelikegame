package roguelike;

// Omen goes only up, never down.

public class Omen {
  private static int omen;
  private static int mult;
  
  public static void incrementOmen(int amt){
    omen+=(amt*mult);
  }
  public static void setmult(int amt){
    mult=amt;
  }
  public static int getOmen(){
    return omen;
  }
}