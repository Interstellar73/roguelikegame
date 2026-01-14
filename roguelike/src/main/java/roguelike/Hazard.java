package roguelike;

// Hazard may fluctuate up and down during a run

public class Hazard {
  private static int hazard;

  public static void incrementHazard(int amt){
    if (amt>0){
      hazard+=amt;
    }
  }
  public static void decrementHazard(int amt){
    if ((hazard-amt)>0 && amt>0){
      hazard-=amt;
    }
  }
  public static int getHazard(){
    return hazard;
  }
}
