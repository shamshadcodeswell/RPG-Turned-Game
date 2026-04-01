package Arsenal;

public class Staff implements Weapons {
      int damage =25;
    public int meeleAttack(){
        return damage;
    }
    public int heavyAttack(){
        return damage+10;
    }
    public int specialAttack(){
        return damage+20;
    }
}
