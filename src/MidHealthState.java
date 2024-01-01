public class MidHealthState implements CharacterState {

    // Private instance variables to store the character and its health.
    Character character;
    int health;

    // Constructor for the MidHealthState class, takes a ConcreteCharacter object and its initial health as parameters.
    public MidHealthState(Character character) {
        this.character = character;
        this.health =character.getHealth();
    }


    // Implementation of the takeDamage method from the CharacterState interface.
    @Override
    public void takeDamage(Character character, int damage) {
        health=character.getHealth();

        // Update the health based on the received damage.
        health = health - damage;
        health=health(health);

        // Display the current damage and health.
        System.out.print("damage: " + damage + " health: " + health+"-------");

        // Set the updated health to the character.
        character.setHealth(health);

        // Check if the character is still in mid health.
        if (health >= 40) {
            System.out.println("Still in mid health");
        }

        // Check if the character has entered the low health state.
        if (health < 40 && health >= 1) {
            character.setHealthState(character.getLowHealth());
            System.out.println("In low health");
        }

        // Check if the character's health has reached zero, then transition to the dead state.
        if (health == 0) {
            character.setHealthState(character.getDead());
            System.out.println("Your're dead");
        }
    }

    // Implementation of the getStronger method from the CharacterState interface.
    @Override
    public void getStronger(Character character, int strength) {
        health=character.getHealth();

        // Increase the health based on the received strength.
        health = health + strength;
        health=health(health);

        // Display the current strength and health.
        System.out.print("strength: " + strength + " health: " + health+"-------");

        // Set the updated health to the character.
        character.setHealth(health);

        // Check if the character has entered the well health state.
        if (health >=70) {
            character.setHealthState(character.getWellHealth());
            System.out.println("In well health");
        }

        // Check if the character is still in mid health.
        if (health < 70 && health >=40) {
            System.out.println("Still in mid health");
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
