interface CharacterState {
    void takeDamage(int damage);
    void getStronger(int strength);
}

// Concrete State - Health State
class HealthState implements CharacterState {
    private int health;

    public HealthState(int initialHealth) {
        setHealth(initialHealth);
    }

    public void setHealth(int health) {
        this.health = Math.min(100, Math.max(0, health)); // Ensure health is between 0 and 100
    }

    @Override
    public void takeDamage(int damage) {
        setHealth(health - damage);
        System.out.println("Took " + damage + " damage. Current Health: " + health);
    }

    @Override
    public void getStronger(int strength) {
        setHealth(health + strength);
        System.out.println("Gained " + strength + " strength. Current Health: " + health);
    }
}