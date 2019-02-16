package rpg;
public class CharacterDuel {
    public static void main(String[] args) {
        Dice d = new Dice();
        Wizard w = new Wizard("Wizard", d.roll(), d.roll(), d.roll());
        Knight k = new Knight("Knight", d.roll(), d.roll(), d.roll());
        for(int i = 1; w.getCurrentLife() >= 0 && k.getCurrentLife() >=0 ; i++){
            System.out.println("ROUND NUMBER " + i + ": ");
            
           System.out.println(w.getName() + " HP : " + w.getCurrentLife());
           System.out.println(k.getName() + " HP : " + k.getCurrentLife());
           System.out.println(" ");
            
            //wizard    OwO
            int Wattack = w.castLightningBolt();
            int wand = w.useWeapon();
            int cloak = w.useArmor();
            
            //knight    OwO
            int Kattack = k.castBash();
            int sword = k.useWeapon();
            int shield = k.useArmor();
            
            System.out.println(" ");
            
//--------------------------------------
//--------------------------------------
            if((d.roll() < 3) && (i != 1)){
                System.out.println(" " +w.getName() + " healed himself for: " + w.castHeal());
            }
            else if(d.roll() > 3){// || (w.getCurrentLife() >= 15 && k.getCurrentLife() <=5)){
                System.out.println(w.getName() + " casts lightning bolt to " + k.getName() + " for: " + Wattack);
                k.wound(Wattack);
                //System.out.println(k.getName() + " equipped himself with a shield as a defense mechanism from " + w.getName() + " for: " + shield);
            }
            else if(d.roll() == 3 ){//|| (w.getCurrentLife() > 5 && w.getCurrentLife() < 15)){
                System.out.println(w.getName() + " uses his wand to attack " +  k.getName() + " for: " + wand);
                k.wound(wand);
            }
            else if(w.getCurrentLife() <= 5){// && k.getCurrentLife() >= 15){
                //System.out.println(k.getName() + " bashed " + w.getName() + " for: " + Kattack);
                //w.wound(Kattack);
                System.out.println(w.getName() + " equipped himself with a cloak as a defense mechanism from " + k.getName() + " for: " + cloak );
            }
            
            else if(k.getCurrentLife() > 5 && k.getCurrentLife() <15){
                System.out.println(k.getName() + " uses his sword to attack " + w.getName() + " for: " + sword);
                w.wound(sword);
            }
            
            if(k.getCurrentLife() <= 5){
                System.out.println(k.getName() + " equipped himself with a shield as a defense mechanism from " + w.getName() + " for: " + shield);
            }
            else if(k.getCurrentLife() >= 15){
                System.out.println(k.getName() + " bashed " + w.getName() + " for: " + Kattack);
                w.wound(Kattack);
            }
//--------------------------------------
//--------------------------------------
            System.out.println(" ");
            if (w.getCurrentLife()<= 0 && k.getCurrentLife()>0){
               System.out.println(k.getName() + " WINS WITH REMAINING " + k.getCurrentLife()+" HP!!!" );
               break;
            }
            else if (w.getCurrentLife() >= 0 && k.getCurrentLife() < 0){
            System.out.println(w.getName() + " WINS WITH REMAINING " + w.getCurrentLife()+" HP!!!");
                break;
            }        
            else if ((Math.max(0, w.getCurrentLife()) == 0) && (Math.max(0, k.getCurrentLife()) == 0)){
                System.out.println("\nDraw\n");
                break;
            }
        }
    }
}
            
