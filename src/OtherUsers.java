public class OtherUsers implements Observer {
    private ConcreteCharacter subject;

    public OtherUsers(ConcreteCharacter subject) {
        this.subject = subject;
        this.subject.registerObserver(this);
    }

    @Override
    public void update(String eyeColor, String hairColor, String hairStyle,
                AttackInventory attackInventory, DefenseInventory defenseInventory,
                int health, int currentDefensePower, int currentAttackPower,
                CharacterState currentState){
        subject.setEyeColor(eyeColor);
        subject.setHairColor(hairColor);
        subject.setHairStyle(hairStyle);
        subject.setAttackInventory(attackInventory);
        subject.setDefenseInventory(defenseInventory);
        subject.setCurrentAttackPower(currentAttackPower);
        subject.setCurrentDefensePower(currentDefensePower);
        subject.setHealth(health);
        subject.setCurrentState(currentState);
        System.out.println("updated");

    }

}

