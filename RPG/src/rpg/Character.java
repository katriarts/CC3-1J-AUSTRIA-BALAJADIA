
package rpg;

public class Character {
    //static variables
    
    private String name;
    private int strength;
    private int dexterity;
    private int intelligence;
    
    static Dice dice = new Dice();
    
    //instance variables
    private int maxLife;
    private int currentLife;
    
      
    
            
    /* Constructor takes 4 parameters: n, s, d, i and assigns them to 
    instance variables name, strength, dexterity, intelligence.
    Also uses the dice instance to assign a random
    number to maxlife. currentLife is initialized to maxlife
    */
    public Character (String n, int s, int d, int i){
        name = n;
        strength = s;
        dexterity = d;
        intelligence = i;
        
        maxLife = dice.roll() * 5;
        currentLife = maxLife;
        
    }
    
    /* returns a random die roll using the roll method
    in the Dice.java, modified by the character's strength
    */
    public int attack(){
        return dice.roll()*this.strength;   
    }
    
    
    //decreases currentlife by the damage parameter
    public void wound (int damage){
         this.currentLife -= damage;
    }
    
    /* Increases currentlife by the heal parameter.
    currentlife cannot be greater than maxlife
    */
    public void heal(int heal){
        int healed = this.currentLife + heal;
        if(healed > maxLife){
            System.out.println(maxLife);
        }else
            System.out.println(healed);
    }
    
    /* returns name
    */
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    
    /* returns strength
    */
    public int getStrength(){
        return strength;
    }
    public void setStrength(int strength){
        this.strength = strength;
        
    }
    
    /* returns dexterity
    */
    public int getDexterity(){
        return dexterity;
    }
    public void setDexterity(int dexterity){
        this.dexterity = dexterity;
    }
    
    //returns intelligence
    public int getIntelligence(){
        return intelligence;
    }
    public void setIntelligence(int intelligence){
        this.intelligence = intelligence;
    }
    
    //returns currentlife
    public int getCurrentLife(){
        return currentLife;
    }
    public void setCurrentLife(int currentLife){
        this.currentLife = currentLife;
    }
    
    //returns maxlife
    public int getMaxLife(){
        return maxLife;
    }
    public void setMaxLife(int maxLife){
        this.maxLife = maxLife;
    }
    
    
}
