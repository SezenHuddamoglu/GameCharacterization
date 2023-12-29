public class Axe extends AttackInventory {

    // Private instance variables to store the attack power and description of the axe.
    private int attackPower;
    private String description;

    // Reference to the Character class for which the axe is equipped.
    Character character;

    // Constructor for the Axe class, takes a Character object as a parameter.
    public Axe(Character character) {
        // Set default values for attackPower and description.
        this.attackPower = 20;
        this.description = "Axe";
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

