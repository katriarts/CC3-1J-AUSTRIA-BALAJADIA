package rpg;
public class Knight extends Character implements Weapons, Armor{
    
    
    
    public Knight(String n, int s, int d, int i){
        super(n, s, d, i);
    }
    public int castBash(){
        return dice.roll()*super.getDexterity();
    }

    @Override   //implement the attack() method~~
    public int attack(){
        return dice.roll()*super.getStrength();
    }
    
    @Override
    public int useWeapon() {
        return dice.roll()+super.getDexterity();
    }

    @Override
    public int useArmor() {
        int heal;
        return heal = dice.roll()+super.getStrength();
    }

}
    


