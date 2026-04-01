package Arsenal;

public class Sword implements Weapons{
    int damage =30;
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
