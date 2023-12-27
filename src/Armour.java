public class Armour implements DefenseInventory{
    private int defensePower;
    private String description;
    Character character;


    public Armour(Character character) {
        this.defensePower = 25;
        this.description = "Armour";
        this.character=character;

    }

    @Override
    public int getDefensePower() {
        return defensePower;
    }

@Override
public String getDescription() { return character.getDescription() + " with defense inventory " + description;
}
}


