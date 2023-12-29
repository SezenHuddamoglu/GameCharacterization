public class Gunshot extends AttackInventory {

    // Private instance variables to store the attack power and description of the gunshot.
    private int attackPower;
    private String description;

    // Reference to the Character class for which the gunshot is associated.
    Character character;

    // Constructor for the Gunshot class, takes a Character object as a parameter.
    public Gunshot(Character character) {
        // Set default values for attackPower and description.
        this.attackPower = 30;
        this.description = "Gunshot";
        // Set the character reference to the provided Character object.
        this.character = character;
    }

    // Implement the getAttackPower method required by the AttackInventory interface.
    @Override
    public int getAttackPower() {
        return attackPower;
    }

    // Implement the getDescription method required by the AttackInventory interface.
    @Override
    public String getDescription() {
        // Combine the character's description with the attack inventory description.
        return character.getDescription() + " with attack inventory " + description;
    }
}
