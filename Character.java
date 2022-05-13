
public class Character {
    public String characterName;

    public int level = 0;
    public int healthPoints = 100;
    public int manaPoints = 350;


    Character(){
        System.out.println("Let the battle begin!");
        System.out.println("3");
        System.out.println("2");
        System.out.println("1");
        System.out.println("GO!");
    }
    Character(String name, int newLvl, int newHp, int mp){
        characterName = name;
        level = newLvl;
        healthPoints = newHp;
        manaPoints = mp;
    }

    public Character(String name) {
        characterName = name;
    }

    public void intcharacter (String characterName){
        System.out.print("Character Initialized: " + characterName);
    }

    public void damageTarget(Character enemyCharacter,int damagePoints){

        enemyCharacter.healthPoints -= damagePoints;
        //System.out.println("enemy character HP Left = " + enemyCharacter.healthPoints);

        if(enemyCharacter.healthPoints > 50){
            System.out.println("Character " + enemyCharacter.characterName + " is almost defeated!");
        }else if(enemyCharacter.healthPoints >= 20){
            System.out.println("Character " + enemyCharacter.characterName +" at the edge of defeat!");
        }else if(enemyCharacter.healthPoints <= 0 ){
            System.out.println("Character " + enemyCharacter.characterName + " is defeated!");
        }
    }
    public int levelUp(int level){
        int levelUp = level + 19;
        return levelUp;
    }
}