package com.rpg.character;

import static com.rpg.character.Character.dice;
import com.rpg.item.Weapons;
import com.rpg.item.Armor;

/**
 * The knight class extends character, 
 */

public class Knight extends Character implements Weapons, Armor{
    
    /**
     * 
     * @param n
     * @param s
     * @param d
     * @param i 
     */
    
    public Knight(String n, int s, int d, int i){
        super(n, s, d, i);
        
    
    }
    /**
     *  castBash() represents skill.
     *
     * @return a dice roll modified by dexterity.
     */
    public int castBash(){
        return dice.roll()*super.getDexterity();
    }
    /**
    *implement the attack() method~~
    * @return a dice roll modified by strength.
    */
    @Override
    public int attack(){
        return dice.roll()*super.getStrength();
    }
    /**
    *implement the useWeapon() method~~
    * @return a dice roll modified by dexterity.
    */
    @Override
    public int useWeapon() {
        return dice.roll()+super.getDexterity();
    }
    /**
    *implement the useArmor() method~~
    * @return a dice roll modified by strength.
    */
    @Override
    public int useArmor() {
        int heal;
        return heal = dice.roll()+super.getStrength();
    }

}
    


