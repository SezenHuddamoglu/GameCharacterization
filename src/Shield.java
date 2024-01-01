public class Shield extends DefenseInventory {
    // Private instance variables to store the defense power, description, and associated character.
    private int defensePower;
    private String description;
    private Character character;

    // Constructor for the Shield class, takes a Character object as a parameter.
    public Shield(Character character) {
        // Set default values for defensePower and description.
        this.defensePower = 15;
        this.description = "Shield";
        // Set the character reference to the provided Character object.
        this.character = character;
    }

    // Implement the getDefensePower method required by the DefenseInventory interface.
    @Override
    public int getDefensePower() {
        return defensePower;
    }

    // Implement the getDescription method required by the DefenseInventory interface.
    @Override
    public String getDescription() {
        // Combine the character's description with the defense inventory description.
        return character.getDescription() + " with defense inventory " + description;
    }
}

