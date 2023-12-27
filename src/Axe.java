public class Axe implements AttackInventory {
    private int attackPower;
    private String description;


    public Axe() {
        this.attackPower = 20;
        this.description = "axe";
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
