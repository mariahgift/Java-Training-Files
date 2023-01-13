package design_patterns.MobileLegends;

public class BasicAttack implements Action{
    private String action;
    private int damage;

    public BasicAttack(String action, int damage) {
        this.action = action;
        this.damage = damage;
    }

    public String getAction() {
        return action;
    }

    public int getDamage() {
        return damage;
    }

    @Override
    public String actionMessage() {
        return action;
    }

    @Override
    public int baseDamage() {
        return damage;
    }
}
