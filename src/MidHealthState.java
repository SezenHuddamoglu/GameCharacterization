// MidHealthState.java
public class MidHealthState implements CharacterState {
    ConcreteCharacter character;
    int health;

    public MidHealthState(ConcreteCharacter character,int health) {
        this.character = character;
        this.health=health;
    }

    @Override
    public void takeDamage(ConcreteCharacter character, int damage) {
        System.out.println("Taking damage");
        health=health-damage;
        System.out.println("damage: " + damage + " health: " + health);
        character.setHealth(health);
        if (health> 40) {
            System.out.println("still in mid health");
        }
        if (health < 40 && health > 1) {
            character.setHealthState(character.getLowHealth());
            System.out.println("in low health");
        }
        if (health == 0) {
            character.setHealthState(character.getDead());
            System.out.println("dead state");
        }
    }

    @Override
    public void getStronger(ConcreteCharacter character, int strenght) {
        System.out.println("getting stronger");
        health=health+strenght;
        System.out.println("strength: " + strenght + " health: " + health);
        character.setHealth(health);
        if(health>70) {
            character.setHealthState(character.getWellHealth());
            System.out.println("in well health");
        }
        if(health<70 && health>40) {
            System.out.println("still in mid health");
        }
    }
}