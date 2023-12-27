// MidHealthState.java
public class MidHealthState implements CharacterState {
    ConcreteCharacter character;

    public MidHealthState(ConcreteCharacter character) {
        this.character = character;
    }

    @Override
    public void takeDamage(ConcreteCharacter character, int damage) {
        System.out.println("Taking damage");
        System.out.println("damage:" +damage + " health: " +(character.getHealth()-damage));
        character.setHealth(character.getHealth()-damage);
        if (character.getHealth() > 40) {
            System.out.println("still in mid health");
        }
        if (character.getHealth() < 40 && character.getHealth() > 1) {
            character.setHealthState(character.getLowHealth());
        }
        if (character.getHealth() == 0) {
            character.setHealthState(character.getDead());
        }
    }

    @Override
    public void getStronger(ConcreteCharacter character, int strenght) {
        System.out.println("getting stronger");
        character.setHealth(character.getHealth()+strenght);
        if(character.getHealth()>70) {
            character.setHealthState(character.getWellHealth());
        }
        if(character.getHealth()<70 && character.getHealth()>40) {
            System.out.println("still in mid health");
        }
    }
}