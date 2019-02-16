package rpg;
public class Knight extends Character implements Weapons, Armor{
    
    @Override   //implement the attack() method~~
    public int attack(){
        return dice.roll()*super.getStrength();
    }
    
    public Knight(String n, int s, int d, int i){
        super(n, s, d, i);
    }
    public int castBash(){
        return dice.roll()*super.getDexterity();
    }

    
    
    @Override
    public int useWeapon() {
        return dice.roll()*super.getStrength();
    }

    @Override
    public int useArmor() {
        super.heal(1);
        return dice.roll()*super.getDexterity();
    }

}
    


