// DeadHealthState.java
public class DeadState implements CharacterState {
    ConcreteCharacter character;
    int health;


    public DeadState(ConcreteCharacter character, int health) {
        this.character = character;
        this.health=health;
    }

    @Override
    public void takeDamage(ConcreteCharacter character, int damage) {
        System.out.println("You can't take more damage. The character is already dead.");
    }
    @Override
    public void getStronger(ConcreteCharacter character, int strenght) {
        System.out.println("You can't get stronger");

    }
}


