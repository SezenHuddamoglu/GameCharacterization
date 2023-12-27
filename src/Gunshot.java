public class Gunshot implements AttackInventory {
    private int attackPower;
    private String description;
    Character character;


    public Gunshot(Character character) {
        this.attackPower = 30;
        this.description = "Gunshot";
        this.character=character;
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