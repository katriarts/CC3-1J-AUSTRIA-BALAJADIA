package rpg;

public class TestCharacter {
    
    public TestCharacter(){
        Dice d = new Dice();
        Character kathy = new Character("Kathy", d.roll(), d.roll(), d.roll());
        Character rian = new Character("Rian", d.roll(), d.roll(), d.roll());
        
        for(int i = 1; i <= 3; i++){
            System.out.println("ROUND " + i);
            
            
            System.out.println(kathy.getName() + ": " + kathy.getCurrentLife());
            System.out.println(rian.getName() + ": " + rian.getCurrentLife());
            
            int kAttack = kathy.attack(), rAttack = rian.attack();
            
            System.out.println(kathy.getName() + " attacks " + rian.getName() + " for " + kAttack);
            System.out.println(rian.getName() + " attacks " + kathy.getName() + " for " + rAttack);
            
            rian.wound(kAttack);
            kathy.wound(rAttack);
          
            System.out.println(" ");
            if((kathy.getCurrentLife() <= 0) && (rian.getCurrentLife() > 0)){
                
            System.out.print("\nFinal HP of " + kathy.getName() + " is: " + kathy.getCurrentLife());
            System.out.print("\nFinal HP of " + rian.getName() + " is: " + rian.getCurrentLife());
                System.out.println(" ");
                System.out.println(rian.getName() + " wins!" );
                break;
            }
            else if ((rian.getCurrentLife() <= 0) && (kathy.getCurrentLife() > 0)){
                
            System.out.print("\nFinal HP of " + kathy.getName() + " is: " + kathy.getCurrentLife());
            System.out.print("\nFinal HP of " + rian.getName() + " is: " + rian.getCurrentLife());
            System.out.println(" ");
                System.out.println(kathy.getName() + " wins!");
                break;
            }
            else if((kathy.getCurrentLife()<=0) && (rian.getCurrentLife()<=0) ){
                System.out.print("\nFinal HP of " + kathy.getName() + " is: " + kathy.getCurrentLife());
                System.out.print("\nFinal HP of " + rian.getName() + " is: " + rian.getCurrentLife());
                System.out.println(" ");
                System.out.println("DRAW! DEDS LAHAT");
                break;
            }
        }
    }
        
}
 
