public class Punching extends DefaultAbilities {
    // Power level for the punching ability.
    private int power;
    // Description of the punching ability.
    private String description;
    // Reference to the character associated with the punching ability.
    private Character character;

    // Constructor for the Punching class, initializes default values and sets the character reference.
    public Punching(Character character) {
        // Set default values for power and description.
        this.power = 5;
        this.description = "punching";
        // Set the character reference to the provided Character object.
        this.character = character;
    }

    // Override of the getAbility method to return the description of the punching ability.
    @Override
    public String getAbility() {
        return description;
    }

    // Override of the getPower method to return the power level of the punching ability.
    @Override
    int getPower() {
        return power;
    }
}

