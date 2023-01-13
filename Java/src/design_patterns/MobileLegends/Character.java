package design_patterns.MobileLegends;

public class Character {
    private String name;
    private Action basicAttack;
    private Action skill1;
    private Action skill2;

    public Character(String name, Action basicAttack, Action skill1, Action skill2) {
        this.name = name;
        this.basicAttack = basicAttack;
        this.skill1 = skill1;
        this.skill2 = skill2;
    }
    String message;
    int damage;
    public void performAction(String typeOfAction, Character targetCharacter) {

        if (typeOfAction.equals("basic")) {
            message =  basicAttack.actionMessage();
            damage = basicAttack.baseDamage();
        }
        if (typeOfAction.equals("skill1")) {
            message =  skill1.actionMessage();
            damage = skill1.baseDamage();
        }
        if (typeOfAction.equals("skill2")) {
            message =  skill2.actionMessage();
            damage = skill2.baseDamage();
        }
        System.out.println(name + " " + message + " "+ targetCharacter.name + " for " + damage + " damage! ");

        //Jawhead flings Chou for 50 damage!
    }
}


