package roguelike;

public class Main {
    public static void main(String[] args) {
        int healthmod = Omen.getOmen();
        int damagemod = (int) Math.floor(Omen.getOmen()/2);
    }
}