public class Axe implements AttackInventory {
    private int attackPower;
    private String description;
    Character character;


    public Axe(Character character) {
        this.attackPower = 20;
        this.description = "Axe";
        this.character = character;
    }

    @Override
    public int getAttackPower() {
        return attackPower;
    }

    @Override
    public String getDescription() {
        return character.getDescription() + " with attack inventory " + description;
    }
}
