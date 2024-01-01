public interface CharacterState {

    // Declare a method to handle taking damage for a character.
    void takeDamage(Character character, int damage);

    // Declare a method to handle making a character stronger.
    void getStronger(Character character, int strength);

    // Declare a method to retrieve the current health of a character.
    //Also set the character's maximum and minimum health value.
    int health(int health);
}


