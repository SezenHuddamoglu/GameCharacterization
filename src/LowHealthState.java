public class LowHealthState implements CharacterState {

    // Private instance variables to store the character and its health.
    ConcreteCharacter character;
    int health;

    // Constructor for the LowHealthState class, takes a ConcreteCharacter object and its initial health as parameters.
    public LowHealthState(ConcreteCharacter character) {
        this.character = character;
        this.health = character.getHealth();
    }

    // Implementation of the takeDamage method from the CharacterState interface.
    @Override
    public void takeDamage(ConcreteCharacter dcharacter, int damage) {
        // Display a message indicating that the character is taking damage.
        System.out.println("Taking damage");
        health=dcharacter.getHealth();

        // Update the health based on the received damage.
        health = health - damage;
        health=health(health);

        // Display the current damage and health.
        System.out.println("damage: " + damage + " health: " + health);

        // Set the updated health to the character.
        character.setHealth(health);

        // Check if the character is still in low health.
        if (health < 40 && health > 1) {
            System.out.println("Still in low health");
        }

        // Check if the character's health has reached zero, then transition to the dead state.
        if (health == 0) {
            character.setHealthState(character.getDead());
            System.out.println("Dead state");
        }
    }

    // Implementation of the getStronger method from the CharacterState interface.
    @Override
    public void getStronger(ConcreteCharacter dcharacter, int strength) {
        // Display a message indicating that the character is getting stronger.
        System.out.println("Getting stronger");
        health=dcharacter.getHealth();

        // Increase the health based on the received strength.
        health += strength;
        health=health(health);

        // Display the current strength and updated health.
        System.out.println("strength: " + strength + " health: " + (character.getHealth() + strength));

        // Set the updated health to the character.
        character.setHealth(health);

        // Check if the character has entered the well health state.
        if (health > 70) {
            character.setHealthState(character.getWellHealth());
            System.out.println("In well health");
        }

        // Check if the character has entered the mid health state.
        if (health < 70 && health > 40) {
            character.setHealthState(character.getMidHealth());
            System.out.println("In mid health");
        }

        // Check if the character is still in low health.
        if (health < 40 && health > 1) {
            System.out.println("Still in low health");
        }
    }
    @Override
    public int health(int health) {
        if (health > 100) {
            return 100;
        } else if (health < 0) {
            return 0;
        }
        return health;


    }

}
