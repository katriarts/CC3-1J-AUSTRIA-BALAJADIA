package rpg;
/*
The WIZARD CLASS EXTENDS CHARACTER,
adding 2 new instance variables:
    a) maxmagic
    b) currentmagc
as well as the: = castLightningBolt() & castHeal() methods
            w/c represent casting magic spells.
*/
public class Wizard extends Character{
    //instance variables
    private int maxMagic;
    private int currentMagic;

    /* 
    The Wizard(String, int, int, int) constructor OVERRIDES 
    the constructor with the same signature in Character.
    
    It first CALLS THE CONSTRUCTOR using the SUPER keyword,
    then initializes MAXMAGIC to a value, 
    and sets CURRENTMAGIC to the same value, similar to LIFEPOINTS.
    */
    public Wizard(String n, int s, int d, int i){
        super(n, s, d, i);
        this.maxMagic = dice.roll()*7;
        this.currentMagic = this.maxMagic;
    }
    
    /*
    castLghtningBolt() represents CASTING A MAGIC SPELL.
    The method first checks that CURRENTMAGIC is greater than/equal to 5.
    if it is, CURRENTMAGIC is reduced by 5 and a random number
    is returned using the dice inherited from Character, 
    modified by the character's intelligence.
    OTHERWISE, returns 0.
    */
    public int castLightningBolt(){
        if(this.currentMagic >= 5){
            this.currentMagic -= 5;
            return dice.roll() * super.getIntelligence();
        } else return 0;
    }

    /*
    castHeal() represents CASTING A MAGIC SPELL.
    The method first checks that CURRENTMAGIC is greater than/equal to 8.
    If it is, CURRENTMAGIC is reduced by 8 and the 
    CHARACTER'S HEAL() method is called with a RANDOM NUMBER, 
    modified by the character's intelligence score.
    The amount healed is also returned by the method.
    */
    public int castHeal(){
        if(this.currentMagic >=8){
            this.currentMagic -= 8; 
            super.heal(maxMagic += dice.roll()*super.getIntelligence());
            //super.heal(dice.roll()*super.getIntelligence());
        } return 3;
    }
    
    @Override
    public int attack(){
        return dice.roll()*5;   
    }
    
    //returns maxmagic
    public int getMaxMagic(){
        return maxMagic;
    }
    public void setMaxMagic(int maxMagic){
        this.maxMagic = maxMagic;
    }
    
    //returns currentmagic
    public int getCurrentMagic(){
        return currentMagic;
    }
    public void setCurrentMagic(int currentMagic){
        this.currentMagic = currentMagic;
    }
   
}

