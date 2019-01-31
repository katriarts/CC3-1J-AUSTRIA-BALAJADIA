
package rpg;

public class TestCharacter {
    public TestCharacter(){
    Character kathy = new Character("Kathy", 5, 4, 3);
        Character piolo = new Character("Piolo", 2, 1 ,6);
        
        for(int i = 1; i <= 100; i++){
            System.out.println("ROUND " + i);
            
            System.out.println(kathy.getName() + ": " + kathy.getCurrentLife());
            System.out.println(piolo.getName() + ": " + piolo.getCurrentLife());
            
            int kAttack = kathy.attack(), pAttack = piolo.attack();
            
            System.out.println(kathy.getName() + " attacks " + piolo.getName() + " for " + kAttack);
            System.out.println(piolo.getName() + " attacks " + kathy.getName() + " for " + pAttack);
            
            piolo.wound(kAttack);
            kathy.wound(pAttack);
            
            System.out.print("Kathy was healed for");
            kathy.heal(1);
            System.out.println(" ");
            
            System.out.print("Piolo was healed for");
            piolo.heal(1);
            System.out.println("\n");
                       
            System.out.println(" ");
            if(kathy.getCurrentLife() <= 0){
                System.out.println(piolo.getName() + " wins!");
                break;
            }
            if (piolo.getCurrentLife() <= 0){
                System.out.println(kathy.getName() + " wins!");
                break;
            }
        }
    }
}
