package Agents;

import Arsenal.Weapons;
import Abilities.*;

public class Thor extends Agent{
    private Weapons weapon;
    private Spells spell;
    public Thor (Weapons weapon, Spells spell){
        this.weapon = weapon;
        this.spell = spell;
           hp = 100;
           maxHp = 100;
           fp = 100;
           maxfp= 100;
           heals = 3;
    }
   

    public int meeleAttack(){
        weapon.meeleAttack();
        int damage = weapon.meeleAttack();
        System.out.println(" dealt a damage of "+damage);
        return damage;
    }
    public int heavyAttack(){
        weapon.heavyAttack();
        int damage = weapon.heavyAttack();
        System.out.println(" dealt a damage of "+damage);
        return damage;
    }
    public int specialAttack(){
        int damage = weapon.specialAttack();
        System.out.println(" dealt a damage of "+damage);
        return damage;
    }
    public int magicAttack(){
        int damage = 0;
        if(fp <0){
            System.out.println("Not enough FP !");
            return damage;
        }
        else{
        damage = spell.magicAttack();
        fp = 0;
        return damage;

        }
    }
}

