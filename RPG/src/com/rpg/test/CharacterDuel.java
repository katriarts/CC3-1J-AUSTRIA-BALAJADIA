package com.rpg.test;

import com.rpg.item.Dice;
import com.rpg.character.Knight;
import com.rpg.character.Wizard;

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
           
           int ono = w.castLightningBolt();
           int unu = k.castBash();
           
           int owo = w.useWeapon();
           int uwu = k.useWeapon();
           
           int yo = w.useArmor();
           int ey = k.useArmor();
           
           //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
            if(w.getCurrentLife() <= 5){                                                                                //(d.roll() <3) && (w.getCurrentLife() <=5) )&& (i != 1) && ){
                System.out.println(w.getName() + " defended his self with a shield (" + yo + ")" );
            } 
            else if(w.getCurrentLife() >=6 && w.getCurrentLife() <=15 ){                                                //&& owo != 0){
                System.out.println(w.getName() + " uses his wand to attack " + k.getName() + " for: " + owo);
                k.wound(owo);
            }
            else if( w.getCurrentLife() >=16 ){                                                                         //&& ono != 0){
                System.out.println(w.getName() + " casts lightning bolt to " + k.getName() + " for: " + ono);
                k.wound(ono);
            }
           //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
            if(k.getCurrentLife() <=5 && (w.getCurrentLife() >=6 && w.getCurrentLife() <=15) || ey <= 5 ){              //(d.roll() <3) && (k.getCurrentLife() <=5)){ //&& (i != 1) 
                System.out.println(k.getName() + " defended his self with a parry and was healed (" + ey + ")");
            } 
            else if(k.getCurrentLife() >=6 && k.getCurrentLife() <=15){
                System.out.println(k.getName() + " uses his sword to attack " + w.getName() + " for: " + uwu);
                w.wound(uwu);
            }
            else{
                System.out.println(k.getName() + " bashed " + w.getName() + " for: " + unu);
                w.wound(unu);
            }
            //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
            System.out.println(" ");
            if (w.getCurrentLife()<= 0  && k.getCurrentLife() > 0 ){                                                    //|| (ono==0 || owo==0 || yo==0 )){
               System.out.println(k.getName() + " WINS WITH REMAINING " + k.getCurrentLife()+" HP!!!" );
               break;
            }
            else if ( k.getCurrentLife() <= 0 && w.getCurrentLife() > 0 ){                                              //|| (unu==0 || uwu==0 || ey==0)){                
            System.out.println(w.getName() + " WINS WITH REMAINING " + w.getCurrentLife()+" HP!!!");
                break;
            }        
            else if ((Math.max(0, w.getCurrentLife()) == 0) && (Math.max(0, k.getCurrentLife()) == 0)){
                System.out.println("DRAW\n");
                break;
            }
        }
    }
}
            
