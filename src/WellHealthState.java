// WellHealthState.java
public class WellHealthState implements CharacterState {
    ConcreteCharacter character;
    int health;

    public WellHealthState(ConcreteCharacter character, int health) {
        this.character = character;
        this.health=health;
    }

    @Override
    public void takeDamage(ConcreteCharacter character, int damage) {
        System.out.println("Taking damage");
        health=health-damage;
        System.out.println("damage: " + damage + " health: " + health);
        character.setHealth(health);

        if (health >= 70) {
            System.out.println("still in well health");
        } else if (health < 70 && health >= 40) {
            character.setHealthState(character.getMidHealth());
            System.out.println("in mid health");
        } else if (health < 40 && health >= 1) {
            character.setHealthState(character.getLowHealth());
            System.out.println("in low health");
        } else if (health <= 0) {
            character.setHealthState(character.getDead());
            System.out.println("dead state");
        }
    }

    @Override
    public void getStronger(ConcreteCharacter character, int strength) {
        System.out.println("getting stronger");
        health+=strength;
        System.out.println("strength: " + strength + " health: " + health);
        character.setHealth(health);
    }
}


