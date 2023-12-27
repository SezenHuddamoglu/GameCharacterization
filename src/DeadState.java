// DeadHealthState.java
public class DeadState implements CharacterState {
    ConcreteCharacter character;

    public DeadState(ConcreteCharacter character) {
        this.character = character;
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


