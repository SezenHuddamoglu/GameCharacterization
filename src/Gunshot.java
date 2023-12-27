public class Gunshot implements AttackInventory {
    private int attackPower;
    private String description;


    public Gunshot() {
        this.attackPower = 30;
        this.description = "gunshot";
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