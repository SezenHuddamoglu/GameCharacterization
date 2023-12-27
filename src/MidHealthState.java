public class MidHealthState implements CharacterState {

    // Private instance variables to store the character and its health.
    ConcreteCharacter character;
    int health;

    // Constructor for the MidHealthState class, takes a ConcreteCharacter object and its initial health as parameters.
    public MidHealthState(ConcreteCharacter character, int health) {
        this.character = character;
        this.health = health;
    }

    // Implementation of the takeDamage method from the CharacterState interface.
    @Override
    public void takeDamage(ConcreteCharacter character, int damage) {
        // Display a message indicating that the character is taking damage.
        System.out.println("Taking damage");

        // Update the health based on the received damage.
        health = health - damage;

        // Display the current damage and health.
        System.out.println("damage: " + damage + " health: " + health);

        // Set the updated health to the character.
        character.setHealth(health);

        // Check if the character is still in mid health.
        if (health > 40) {
            System.out.println("Still in mid health");
        }

        // Check if the character has entered the low health state.
        if (health < 40 && health > 1) {
            character.setHealthState(character.getLowHealth());
            System.out.println("In low health");
        }

        // Check if the character's health has reached zero, then transition to the dead state.
        if (health == 0) {
            character.setHealthState(character.getDead());
            System.out.println("Dead state");
        }
    }

    // Implementation of the getStronger method from the CharacterState interface.
    @Override
    public void getStronger(ConcreteCharacter character, int strength) {
        // Display a message indicating that the character is getting stronger.
        System.out.println("Getting stronger");

        // Increase the health based on the received strength.
        health = health + strength;

        // Display the current strength and health.
        System.out.println("strength: " + strength + " health: " + health);

        // Set the updated health to the character.
        character.setHealth(health);

        // Check if the character has entered the well health state.
        if (health > 70) {
            character.setHealthState(character.getWellHealth());
            System.out.println("In well health");
        }

        // Check if the character is still in mid health.
        if (health < 70 && health > 40) {
            System.out.println("Still in mid health");
        }
    }
}
