import java.util.ArrayList;

public class ConcreteCharacter extends Character implements Subject {

    // Private instance variables to store character attributes, inventories, health, and states.
    private ArrayList<Observer> observers;
    private AttackInventory attackInventory;
    private String eyeColor;
    private String hairStyle;
    private String hairColor;
    private DefenseInventory defenseInventory;
    private int health = 100;
    private int currentDefensePower;
    private int currentAttackPower;

    // Character states representing different health states.
    private CharacterState wellHealth;
    private CharacterState midHealth;
    private CharacterState lowHealth;
    private CharacterState dead;
    private CharacterState currentState;

    // Constructor for the ConcreteCharacter class.
    public ConcreteCharacter(String eyeColor, String hairColor, String hairStyle) {
        // Initialize character attributes with provided values.
        super(eyeColor, hairColor, hairStyle);
        this.eyeColor = eyeColor;
        this.hairColor = hairColor;
        this.hairStyle = hairStyle;

        // Initialize the list of observers.
        observers = new ArrayList();

        // Initialize attackInventory and defenseInventory to null.

    }

    @Override
    public String getEyeColor() {
        return eyeColor;
    }

    // Method to register an observer.
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    // Method to remove an observer.
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    // Method to notify all observers of changes.
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(
                    eyeColor, hairColor, hairStyle,
                    attackInventory, defenseInventory,
                    health, currentDefensePower, currentAttackPower, currentState
            );
        }
    }


    // Override method to get a description of the character.
    @Override
    public String getDescription() {
        return "A character with " + this.eyeColor + ", " + this.hairStyle + ", " + this.hairColor;
    }
}
