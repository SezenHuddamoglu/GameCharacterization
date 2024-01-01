public class OtherUsers implements Observer {

    // Private instance variables to store information about the observed character.
    private ConcreteCharacter subject;
    private AttackInventory attackInventory;
    private String eyeColor;
    private String hairStyle;
    private String hairColor;
    private DefenseInventory defenseInventory;
    private int health;
    private int currentDefensePower;
    private int currentAttackPower;
    private CharacterState currentState;

    // Constructor for the OtherUsers class, takes a ConcreteCharacter object (subject) as a parameter.
    public OtherUsers(ConcreteCharacter subject) {
        // Set the subject and register this observer with the subject.
        this.subject = subject;
        this.subject.registerObserver(this);
    }

    // Implementation of the update method from the Observer interface.
    @Override
    public void update(String eyeColor, String hairColor, String hairStyle,
                       AttackInventory attackInventory, DefenseInventory defenseInventory,
                       int health, int currentDefensePower, int currentAttackPower,
                       CharacterState currentState) {
        // Update the instance variables with the information provided by the subject.
        this.eyeColor = eyeColor;
        this.hairColor = hairColor;
        this.hairStyle = hairStyle;
        this.attackInventory = attackInventory;
        this.defenseInventory = defenseInventory;
        this.health = health;
        this.currentAttackPower = currentAttackPower;
        this.currentDefensePower = currentDefensePower;
        this.currentState = currentState;
    }
    public String toString() {
        return "OtherUsers Observer";
    }
}



