public interface CharacterState {

    // Declare a method to handle taking damage for a character.
    void takeDamage(Character character, int damage);

    // Declare a method to handle making a character stronger.
    void getStronger(Character character, int strength);
    int health(int health);
}


