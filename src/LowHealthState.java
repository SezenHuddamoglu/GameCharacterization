// LowHealthState.java
public class LowHealthState implements CharacterState {
    ConcreteCharacter character;
    int health;

    public LowHealthState(ConcreteCharacter character, int health) {
        this.character = character;
        this.health=health;
    }

    @Override
    public void takeDamage(ConcreteCharacter character, int damage) {
        System.out.println("Taking damage");
        health=health-damage;
        System.out.println("damage:" +damage + " health: " +health);
        character.setHealth(health);
        if (health < 40 && health > 1) {
            System.out.println("still in low health");
        }
        if (health == 0) {
            character.setHealthState(character.getDead());
            System.out.println("dead state");
        }
    }

    @Override
    public void getStronger(ConcreteCharacter character, int strenght) {
        System.out.println("getting stronger");
        health+=strenght;
        System.out.println("strenght:" + strenght + " health:" +(character.getHealth()+strenght));
        character.setHealth(health);
        if(health>70) {
            character.setHealthState(character.getWellHealth());
            System.out.println("in well health");
        }

        if(health<70 && health>40) {
            character.setHealthState(character.getMidHealth());
            System.out.println(" in mid health");
        }
        if(health<40 && health> 1) {
            System.out.println("still in low health");
        }
    }
}
