
package heroesbattle;

public class Hero {
    private String name;
    private int health;
    private Armor armor;
    private Weapon weapon;

    public Hero(String name,int health , Armor armor, Weapon weapon) {
        this.name = name;
        this.armor = armor;
        this.weapon = weapon;
        this.health = health;
    }

    public void changeArmor(Armor armor) {
        this.armor = armor;
    }

    public void changeWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public int getHealth() {
        return health;
    }
    
        
    public int getAttactPower(){
        return weapon.getPower();
    }
    
    public void attacted(int power){
        int leftPower;
        leftPower = power - armor.getArmor();
        this.health = health - leftPower;
    }
    
    public void attacted(Hero enemy){
        int leftPower;
        leftPower = enemy.getAttactPower()-armor.getArmor();
        this.health = this.health - leftPower;
    }    
    
    
}
