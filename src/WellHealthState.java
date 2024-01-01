public class WellHealthState implements CharacterState {

    // Private instance variables to store the character and its health.
    Character character;
    int health;

    // Constructor for the WellHealthState class, takes a ConcreteCharacter object and its initial health as parameters.
    public WellHealthState(Character character) {
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

        // Check the health conditions and transition to the appropriate state.
        if (health >= 70) {
            System.out.println("Still in well health");
        } else if (health < 70 && health >= 40) {
            character.setHealthState(character.getMidHealth());
            System.out.println("In mid health");
        } else if (health < 40 && health >= 1) {
            character.setHealthState(character.getLowHealth());
            System.out.println("In low health");
        } else if (health <= 0) {
            character.setHealthState(character.getDead());
            System.out.println("You're dead");
        }
    }

    // Implementation of the getStronger method from the CharacterState interface.
    @Override
    public void getStronger(Character character, int strength) {
        health=character.getHealth();
        // Increase the health based on the received strength.
        health += strength;
        health=health(health);
        // Display the current strength and updated health.
        System.out.print("Strength: " + strength + " health: " + health+"-------");
        System.out.println("Still in well health");

        // Set the updated health to the character.
        character.setHealth(health);
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

