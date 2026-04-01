package Agents;

public abstract class Agent{
   public int hp;
   public int maxHp;
   public int fp;
   public int maxfp;
   public int heals;

    public void heal(){
        if (heals > 0 ){

        
        if(hp==maxHp){
            System.out.println("Hp already full !");
        }
        else{
            hp = hp+30;
            if(hp > maxHp){
                hp=maxHp;
            }

        }
    }
    else {
        System.out.println(" No heals left !");

    }

}
    public abstract int meeleAttack();
    public abstract int heavyAttack();
    public abstract int specialAttack();
    public abstract int magicAttack();
}