package Arsenal;
public class Bow implements Weapons{
      int damage =20;
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