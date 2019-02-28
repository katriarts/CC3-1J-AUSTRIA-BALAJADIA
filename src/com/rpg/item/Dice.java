
package com.rpg.item;
/**
 * the dice class models rolling a regular 6-sided die
 */
import java.util.Random;

public class Dice {
    /** instance variable */
    
    private int roll;
    private Random r;
    /**
     * instantiate the object r
     */ 
    public Dice(){
        
      this.r = new Random();

    }
    /**
     * Returns a random integer between 1 and 6
     * @return 
    */
    public int roll(){        
            
        int roll = r.nextInt(6)+1;    
                return roll;

    }
}
