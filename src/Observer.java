public interface Observer {

    // Declare a method to update the observer with various aspects of a character.
    void update(String eyeColor, String hairColor, String hairStyle,
                AttackInventory attackInventory, DefenseInventory defenseInventory,
                int health, int currentDefensePower, int currentAttackPower,
                CharacterState currentState);
}
