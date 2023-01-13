package design_patterns.MobileLegends;

public class MobileLegends {
    public static void main(String[] args) {
        Action jawheadBasic = new BasicAttack("shoots missiles at", 10);
        Action jawheadSkill1 = new FirstSkill("flings", 50);
        Action jawheadSkill2 = new SecondSkill("locks onto and charges at", 80);

        Character jawhead = new Character("Jawhead", jawheadBasic, jawheadSkill1, jawheadSkill2);

        Action chouBasic = new BasicAttack("punches", 11);
        Action chouSkill1 = new FirstSkill("dashes towards at", 65);
        Action chouSkill2 = new SecondSkill("does a roundhouse kick at", 75);

        Character chou = new Character("Chou", chouBasic, chouSkill1, chouSkill2);

        jawhead.performAction("skill1", chou);
        chou.performAction("basic", jawhead);
    }
}
