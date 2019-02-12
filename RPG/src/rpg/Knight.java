package rpg;
public class Knight extends Character{
    
    
    
    public Knight(String n, int s, int d, int i){
        super(n, s, d, i);
    }
    public int castBash(){
        return dice.roll()*super.getDexterity();
    }

}
    


