public class Armour implements DefenseInventory {

    // Private instance variables to store the defense power and description of the armour.
    private int defensePower;
    private String description;

    // Reference to the Character class for which the armour is equipped.
    Character character;

    // Constructor for the Armour class, takes a Character object as a parameter.
    public Armour(Character character) {
        // Set default values for defensePower and description.
        this.defensePower = 25;
        this.description = "Armour";
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



