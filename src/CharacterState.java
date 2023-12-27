public interface CharacterState {

    // Declare a method to handle taking damage for a character.
    void takeDamage(ConcreteCharacter character, int damage);

    // Declare a method to handle making a character stronger.
    void getStronger(ConcreteCharacter character, int strength);
}


