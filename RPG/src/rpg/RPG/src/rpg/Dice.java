
package rpg;
//the dice class models rolling a regular 6-sided die
import java.util.Random;

public class Dice {
    //instance variables
    
    private int roll;
    private Random r;
    //instantiate the object r
    public Dice(){
        
      this.r = new Random();

    }
    public int roll(){        
            
        int roll = r.nextInt(6)+1;    
                return roll;

    }
}
