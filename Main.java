import java.util.*;
import Abilities.*;
import Agents.*;
import Arsenal.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Spells spells1 = new Water(); 
        Weapons weapon1 = new Bow();
        Agent player1 =  new Thor(weapon1, spells1);


       
        Spells spells2 = new Water(); 
        Weapons weapon2 = new Bow();
        Agent player2 =  new Ironman(weapon2, spells2);
        

        System.out.println("select loadout for player 1 ");
        System.out.println("select weapon: \n 1.sword \n 2.staff \n 3.bow ");
        
        int x = sc.nextInt();
        do{
        switch (x) {
            case 1:
                weapon1 = new Sword();
                break;
            case 2:
                weapon1 = new Staff();
                break;
            case 3:
                weapon1= new Bow();
                break;
            default:
            System.out.println(" Invalid input.. retry ");
            x= sc.nextInt();
            break;
        }
        }while(x>3);



        System.out.println("select ULT : \n 1.Dark \n 2.Fire \n 3.Ground \n 4.Lightning \n 5.Magic \n 6.Water");
        x= sc.nextInt();
        do{
         switch (x) {
            case 1:
                spells1= new Dark();
                break;
            case 2:
                spells1= new Fire();
                break;
            case 3:
                spells1= new Ground();
                break;
            case 4:
                spells1= new Lightning();
                break;
            case 5:
                spells1= new Magic();
                break;
            case 6:
                spells1= new Water();
                break;
            default:
            System.out.println(" Invalid input... retry ");
               break;
            }
        }while (x>6);

        System.out.println("Select Hero : 1. Thor \n 2.Ironman");
        x=sc.nextInt();
        do {
        switch (x) {
            case 1:
                player1 = new Thor(weapon1, spells1);           
                break;

            case 2:
                player1 = new Thor(weapon1, spells1);           
                break;

            default:
                System.out.println("Invalid input... retry");
                x=sc.nextInt();
                break;
        }
    }while(x>2);
        System.out.println("select loadout for player 2 ");
        System.out.println("select weapon: \n 1.sword \n 2.staff \n 3.bow ");
         x = sc.nextInt();
         do{
        switch (x) {
            case 1:
                weapon2 = new Sword();
                break;
            case 2:
                weapon2 = new Staff();
                break;
            case 3:
                weapon2= new Bow();
                break;
            default:
                System.out.println(" Invalid input... retry");
                x= sc.nextInt();
                break;
        }
    }while (x>3);
        System.out.println("select ULT : \n 1.Dark \n 2.Fire \n 3.Ground \n 4.Lightning \n 5.Magic \n 6.Water");
        x= sc.nextInt();
        do{
         switch (x) {
            case 1:
                spells2= new Dark();
                break;
            case 2:
                spells2= new Fire();
                break;
            case 3:
                spells2= new Ground();
                break;
            case 4:
                spells2= new Lightning();
                break;
            case 5:
                spells2= new Magic();
                break;
            case 6:
                spells2= new Water();
                break;
             default:
                System.out.println(" Invalid input... retry ");
                x=sc.nextInt();
                break;
         }
        }while (x>6);

        System.out.println("Select Hero : 1. Thor \n 2.Ironman");
        x=sc.nextInt();
        do{
        switch (x) {
            case 1:
                player2 = new Thor(weapon2, spells2);           
                break;

            case 2:
                player2 = new Thor(weapon2, spells2);           
                break;
                
            default:
                System.out.println("Invalid input");
                break;
            
        }
    }while(x>2);

    int flag =0;
    while (flag == 0) {
        System.out.println("Turn for player 1: ");
        System.out.println("-------------------------------");
        System.out.println("Player 1's Stats : \n HP = "+player1.hp+" \n FP = "+player1.fp);
        System.out.println("1.Meele attack \n 2.Heavy attack \n 3.Special attack \n 4.Magic attack \n 5.Heal");
        int y = sc.nextInt();
        int damage;
        do{
        switch (y) {
            case 1:
                damage = player1.meeleAttack();
                player2.hp = player2.hp - damage;
                break;

            case 2:
                damage = player1.heavyAttack();
                player2.hp = player2.hp - damage;
                break;

            case 3:
                damage = player1.specialAttack();
                player2.hp = player2.hp - damage;
                break;

            case 4:
                damage = player1.magicAttack();
                if(damage == 0){
                    System.out.println("ULT Spammer your turn has been skipped !");
                }
                player2.hp = player2.hp - damage;
                break;
            case 5:
                player1.heal();
                System.out.println("Your hp = "+player1.hp);
                break;
        
            default:
                System.out.println(" Invalid Input... retry ");
                y=sc.nextInt();
                break;
        }
         }while (y>5);


         if(player2.hp < 0){
         System.out.println("Player 2 had DIED");
         System.out.println("Player 1 Won !");
         flag =1;
         break;
         }
        System.out.println("---------------------------");
        System.out.println("Player 2's Stats : \n HP = "+player2.hp+" \n FP = "+player2.fp);
        System.out.println("Turn for player 2: ");
        System.out.println("1.Meele attack \n 2.Heavy attack \n 3.Special attack \n 4.Magic attack \n 5.Heal");
        y = sc.nextInt();
        do{
        switch (y) {
            case 1:
                damage = player2.meeleAttack();
                player1.hp = player1.hp - damage;
                break;

            case 2:
                damage = player2.heavyAttack();
                player1.hp = player1.hp - damage;
                break;

            case 3:
                damage = player2.specialAttack();
                player1.hp = player1.hp - damage;
                break;

            case 4:
                damage = player2.magicAttack();
                if(damage == 0){
                    System.out.println("ULT Spammer your turn has been skipped !");
                }
                player1.hp = player1.hp - damage;
                break;

            case 5:
                player2.heal();
                System.out.println("Your hp = "+player1.hp);
                break;
        
            default:
                System.out.println(" Invalid Input... retry ");
                y=sc.nextInt();
                break;
        }
         }while (y>5);
         if(player1.hp < 0){
         System.out.println("Player 2 had DIED");
         System.out.println("Player 1 Won !");
         flag =1;
         break;
         }
    }
    System.out.println("Game Over !.. GG");
    sc.close();

    }
}