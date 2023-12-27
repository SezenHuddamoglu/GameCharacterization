public class Shield implements DefenseInventory {
    private int defensePower;
    private String description;
    Character character;

    public Shield(Character character) {
        this.defensePower = 15;
        this.description = "Shield";
        this.character=character;
    }

    @Override
    public int getDefensePower() {
        return defensePower;
    }

    @Override
    public String getDescription() {
        return character.getDescription() + " with defense inventory " + description;
    }
}

