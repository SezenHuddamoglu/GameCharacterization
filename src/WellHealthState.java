// WellHealthState.java
public class WellHealthState implements CharacterState {
    ConcreteCharacter character;

    public WellHealthState(ConcreteCharacter characterr) {
        this.character = character;
    }

    @Override
    public void takeDamage(ConcreteCharacter character, int damage) {
        System.out.println("Taking damage");
        System.out.println("damage: " + damage + " health: " + (character.getHealth() - damage));
        character.setHealth(character.getHealth() - damage);

        if (character.getHealth() >= 70) {
            System.out.println("still in well health");
        } else if (character.getHealth() < 70 && character.getHealth() >= 40) {
            character.setHealthState(character.getMidHealth());
        } else if (character.getHealth() < 40 && character.getHealth() >= 1) {
            character.setHealthState(character.getLowHealth());
        } else if (character.getHealth() <= 0) {
            character.setHealthState(character.getDead());
        }
    }

    @Override
    public void getStronger(ConcreteCharacter character, int strength) {
        System.out.println("getting stronger");
        character.setHealth(character.getHealth() + strength);
    }
}


