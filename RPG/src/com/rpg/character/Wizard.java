package com.rpg.character;

import static com.rpg.character.Character.dice;
import com.rpg.item.Weapons;
import com.rpg.item.Armor;

/**
 * The Wizard class extends character,
 *adding 2 new instance variables:
 *   a) maxMagic
 *   b) currentMagic
 *as well as the castLightningBolt() and castHeal() methods
 * which represent casting magic spells.
 */

public class Wizard extends Character implements Weapons, Armor{
    //instance variables
    private int maxMagic;
    private int currentMagic;

    /** 
     * @param n;
     * @param s;
     * @param d;
     * @param i;
     * 
     * The Wizard(String,int,int,int) constructor OVERRIDES 
     *the constructor with the same signature in Character.
     *
     *It first CALLS THE CONSTRUCTOR using the SUPER keyword,
     *then initializes MAXMAGIC to a value, 
     *and sets CURRENTMAGIC to the same value, similar to LIFEPOINTS.
     */
    public Wizard(String n, int s, int d, int i){
        super(n, s, d, i);
        this.maxMagic = dice.roll()*1;
        this.currentMagic = this.maxMagic;
    }
    /**
     *  castLghtningBolt() represents CASTING A MAGIC SPELL.
     *The method first checks that CURRENTMAGIC is greater than/equal to 5.
     *if it is, CURRENTMAGIC is reduced by 5 and a random number
     *is returned using the dice inherited from Character, 
     *modified by the character's intelligence.
     *OTHERWISE, returns 0.
     * @return 
     */

    public int castLightningBolt(){
        if(this.currentMagic >= 5){
            this.currentMagic -= 5;
            return dice.roll() * super.getIntelligence();
        } else return 0;
    
    } 

    /**
     * @return castHeal() represents CASTING A MAGIC SPELL.
     *The method first checks that CURRENTMAGIC is greater than/equal to 8.
     *If it is, CURRENTMAGIC is reduced by 8 and the 
     *CHARACTER'S HEAL() method is called with a RANDOM NUMBER, 
     *modified by the character's intelligence score.
     *The amount healed is also returned by the method.
     */
    public int castHeal(){
        if(this.currentMagic >=8){
            this.currentMagic -= 8; 
            super.heal(maxMagic += dice.roll()*super.getIntelligence());
            //super.heal(dice.roll()*super.getIntelligence());
        } return 1;
    }
    
    @Override   //implement the attack() method~~
    public int attack(){
        return dice.roll()*super.getIntelligence();   
    }
    
    /**
     * @return maxMagic 
     */
    public int getMaxMagic(){
        return maxMagic;
    }
    public void setMaxMagic(int maxMagic){
        this.maxMagic = maxMagic;
    }
    
    /**
     * @return currentMagic 
     */
    public int getCurrentMagic(){
        return currentMagic;
    }
    public void setCurrentMagic(int currentMagic){
        this.currentMagic = currentMagic;
    }

    /** useWeapon() method will 
     * @return dice modified by strength.
     * This will decrease the currentLife of the opponent.
     */
    @Override   
    public int useWeapon() {
       
        return dice.roll()+super.getStrength();
    }

    /** useArmor() method will
     * 
     * @return dice modified by dice roll modified by strength
     *  This will invoke the heal() method.
     */
    @Override
    public int useArmor() {
        
        int heal;
        return heal = dice.roll()+super.getStrength();
    }
   
}

