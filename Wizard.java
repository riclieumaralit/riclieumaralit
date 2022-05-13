
public class Wizard extends Character {
    Wizard(String name){
        super(name);
    }

    public void demonkick(Character enemyCharacter){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with demon kick (Damage - 50)");
        int damagePoints = 50;
        damageTarget(enemyCharacter, damagePoints);
    }
    public void jeetkunedo (Character enemyCharacter){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with jeetkunedo (Damage - 40)");
        int damagePoints = 40;
        damageTarget(enemyCharacter, damagePoints);
    }
    public void revitalize(Character wizardCharacter, int manaPoints, int healthPoints){
        System.out.println(super.characterName + " recover from the damage");
        add(wizardCharacter, healthPoints, manaPoints);
    }
    public void add(Character wizardCharacter, int healthPoints,int manaPoints){
        wizardCharacter.healthPoints += healthPoints;
        wizardCharacter.manaPoints += manaPoints;
    }
    public void status(int healthStatus, int manaStatus){
        System.out.println(super.characterName +" Hp = "+healthStatus+ " Mana = "+manaStatus);
    }
}