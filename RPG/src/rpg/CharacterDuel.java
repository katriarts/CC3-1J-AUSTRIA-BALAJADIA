package rpg;
public class CharacterDuel {
    public static void main(String[] args) {
        Dice d = new Dice();
        Wizard w = new Wizard("Wizard", d.roll(), d.roll(), d.roll());
        Knight m = new Knight("Knight", d.roll(), d.roll(), d.roll());
        for(int i = 1; i >= 1 ; i++){
            System.out.println("ROUND NUMBER " + i + ": ");
           //code for duel
           System.out.println(w.getName() + ": " + w.getCurrentLife());
           System.out.println(m.getName() + ": " + m.getCurrentLife());
            
           //UwU~
            System.out.println(" ");
           
            int Battack = w.castLightningBolt();
            int Aattack = m.castBash();
            System.out.println(" ");
            System.out.println(w.getName() + " casts lightning bolt to attack " +
                                            m.getName() + " for: " + Battack);
            System.out.println(m.getName() + " casts sorcery to attack " +
                                            w.getName() + " for: " + Aattack);
            w.wound(Battack);
            m.wound(Aattack);
            
            if(d.roll() < 3){
               //w.castHeal();
               System.out.println(": " +w.getName() + " was healed for " + w.castHeal());
           }
           else if(d.roll() > 3){
               //w.castLightningBolt();
               System.out.println(w.getName() + " casts lightning bolt to " + m.getName());
           }
           else if(d.roll() == 3){
               //w.attack();
               System.out.println(w.getName() + " attacks " +  m.getName());
           }
            
            System.out.println(" ");
            System.out.println("HP of " + w.getName() + ": " + w.getCurrentLife());
            System.out.println("HP of " + m.getName() + ": " + m.getCurrentLife());
            System.out.println(" ");
            
            if (w.getCurrentLife()<= 0 && m.getCurrentLife()>0){
               System.out.println(m.getName() + " WINS!!!");
                break;
            }
            else if (w.getCurrentLife() >= 0 && m.getCurrentLife()< 0){
            System.out.println(w.getName() + " WINS!!!");
                break;
            }
            else if (w.getCurrentLife()== 0 && m.getCurrentLife()== 0){                 
                    System.out.println("IZ A TIE BOIII!!! :3");
                    break;
            }
            else if (Math.max(0, m.getCurrentLife()) <= 0)
                if(Math.max(0, w.getCurrentLife()) <= 0){
                System.out.println("IZ A TIE BOIII!!! :3");
                break;
            }
            
            
        }
    }
}
