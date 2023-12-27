public class Axe implements AttackInventory {
    private int attackPower;
    private String description;

    public Axe(int attackPower, String description) {
        this.attackPower = attackPower;
        this.description = description;
    }

    @Override
    public int getAttackPower() {
        return attackPower;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
