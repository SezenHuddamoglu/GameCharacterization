public class DeadState implements CharacterState {

    // Private instance variables to store the character and its health.
    ConcreteCharacter character;
    int health;

    // Constructor for the DeadState class, takes a ConcreteCharacter object and its initial health as parameters.
    public DeadState(ConcreteCharacter character) {
        this.character = character;
        this.health = character.getHealth();
    }

    // Implementation of the takeDamage method from the CharacterState interface.
    @Override
    public void takeDamage(ConcreteCharacter character, int damage) {
        // Display a message indicating that the character can't take more damage because it is already dead.
        System.out.println("You can't take more damage. The character is already dead.");
    }

    // Implementation of the getStronger method from the CharacterState interface.
    @Override
    public void getStronger(ConcreteCharacter character, int strength) {
        // Display a message indicating that the character can't get stronger because it is already dead.
        System.out.println("You can't get stronger");
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


