package roguelike;

public class Inventory {
  private String weapon;
  private String armor;
  private int damage;
  String[] extraInventory = new String[6];

  public Inventory(String wp, String arm, int dmg){
    weapon = wp;
    armor = arm;
    damage = dmg;
  }
}
