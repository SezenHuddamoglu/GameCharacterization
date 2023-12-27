public interface Observer {
    void update(String eyeColor, String hairColor, String hairStyle,
                AttackInventory attackInventory, DefenseInventory defenseInventory,
                int health, int currentDefensePower, int currentAttackPower,
                CharacterState currentState);
}
