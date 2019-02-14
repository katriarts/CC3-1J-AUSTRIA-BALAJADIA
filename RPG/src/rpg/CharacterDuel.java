package rpg;
public class CharacterDuel {
    public static void main(String[] args) {
        Dice d = new Dice();
        Wizard w = new Wizard("Wizard", d.roll(), d.roll(), d.roll());
        Knight m = new Knight("Knight", d.roll(), d.roll(), d.roll());
        for(int i = 1; w.getCurrentLife() >= 0 && m.getCurrentLife() >=0 ; i++){
            System.out.println("ROUND NUMBER " + i + ": ");
           //code for duel
           System.out.println(w.getName() + " HP : " + w.getCurrentLife());
           System.out.println(m.getName() + " HP : " + m.getCurrentLife());
            
           //UwU~
            System.out.println(" ");
           
            int Battack = w.castLightningBolt();
            int Aattack = m.castBash();
            System.out.println(" ");
            
            
            if((d.roll() < 3) && (i != 1)){
               //w.castHeal();
               System.out.println(" " +w.getName() + " was healed for: " + w.castHeal());
            }
           else if(d.roll() > 3){
               System.out.println(w.getName() + " casts lightning bolt to attack " +
                                            m.getName() + " for: " + Battack);
               m.wound(Battack);
           }
           else if(d.roll() == 3){
               //w.attack();
               System.out.println(w.getName() + " attacks " +  m.getName()+ " for: "+ Battack);
               //w.wound(Battack);
           }
            
            if(m.getCurrentLife() > 0){
                   System.out.println(m.getName() + " bashed " +
                                         w.getName() + " for: " + Aattack);
               w.wound(Aattack);
               }
            
                System.out.println(" ");
            //System.out.println("HP of " + w.getName() + ": " + w.getCurrentLife());
            //System.out.println("HP of " + m.getName() + ": " + m.getCurrentLife());
            //System.out.println(" ");
            
            if (w.getCurrentLife()<= 0 && m.getCurrentLife()>0){
               System.out.println(m.getName() + " WINS WITH REMAINING " + m.getCurrentLife()+" HP!!!" );
               break;
            }
            else if (w.getCurrentLife() >= 0 && m.getCurrentLife() < 0){
            System.out.println(w.getName() + " WINS WITH REMAINING " + w.getCurrentLife()+" HP!!!");
                break;
            }        
            else if ((Math.max(0, w.getCurrentLife()) == 0) && (Math.max(0, m.getCurrentLife()) == 0)){
                System.out.println("\nDraw\n");
                break;
            }
        }
    }
}
            
