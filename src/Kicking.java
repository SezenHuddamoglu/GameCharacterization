public class Kicking extends DefaultAbilities {
    // Power level for the kicking ability.
    private int power;
    // Description of the kicking ability.
    private String description;
    // Reference to the character associated with the kicking ability.
    private Character character;

    // Constructor for the Kicking class, initializes default values and sets the character reference.
    public Kicking(Character character) {
        // Set default values for power and description.
        this.power = 7;
        this.description = "kicking";
        // Set the character reference to the provided Character object.
        this.character = character;
    }

    // Override of the getAbility method to return the description of the kicking ability.
    @Override
    public String getAbility() {
        return description;
    }

    // Override of the getPower method to return the power level of the kicking ability.
    @Override
    int getPower() {
        return power;
    }
}

