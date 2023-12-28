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
        this.eyeColor = eyeColor;
        this.hairColor = hairColor;
        this.hairStyle = hairStyle;

        // Initialize the list of observers.
        observers = new ArrayList();

        // Initialize attackInventory and defenseInventory to null.
        attackInventory = null;
        defenseInventory = null;

        // Initialize character states for different health levels.
        wellHealth = new WellHealthState(this);
        midHealth = new MidHealthState(this);
        lowHealth = new LowHealthState(this);
        dead = new DeadState(this);

        // Set initial health and state based on health level.
        health = 100;
        currentState = wellHealth;
        if (health > 70) {
            currentState = wellHealth;
        }
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

    // Override method to set the current state and notify observers.
    @Override
    public void setCurrentState(CharacterState state) {
        this.currentState = state;
        notifyObservers();
    }

    // Override method to set the eye color and notify observers.
    @Override
    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
        notifyObservers();
    }

    // Override method to set the hair color and notify observers.
    @Override
    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
        notifyObservers();
    }

    // Override method to set the hair style and notify observers.
    @Override
    public void setHairStyle(String hairStyle) {
        this.hairStyle = hairStyle;
        notifyObservers();
    }

    // Override method to set the defense inventory and notify observers.
    @Override
    public void setDefenseInventory(DefenseInventory defenseInventory) {
        this.defenseInventory = defenseInventory;
        this.currentDefensePower = defenseInventory.getDefensePower();
        notifyObservers();
    }

    // Override method to get the defense inventory.
    @Override
    public DefenseInventory getDefenseInventory() {
        return defenseInventory;
    }

    // Override method to get the attack inventory.
    @Override
    public AttackInventory getAttackInventory() {
        return attackInventory;
    }

    // Override method to get the current defense power.
    @Override
    public int getCurrentDefensePower() {
        return currentDefensePower;
    }

    // Override method to set the health and notify observers.
    @Override
    public void setHealth(int health) {

        this.health = health;

        notifyObservers();
    }

    @Override
    public int getHealth() {
        return health;
    }

    // Method to handle taking damage, delegates to the current state and notifies observers.
    public void takeDamage(int damage) {
        currentState.takeDamage(this, damage);
        notifyObservers();
    }

    // Method to handle getting stronger, delegates to the current state and notifies observers.
    public void getStronger(int strength) {
        currentState.getStronger(this, strength);
        notifyObservers();
    }

    // Override method to get the current state.
    @Override
    public CharacterState getCurrentState() {
        return currentState;
    }

    // Override method to set the current attack power and notify observers.
    @Override
    public void setCurrentAttackPower(int attackPower) {
        this.currentAttackPower = attackPower;
        notifyObservers();
    }

    @Override
    public void setAttackInventory(AttackInventory attackInventory) {
        this.attackInventory = attackInventory;
        this.currentAttackPower = attackInventory.getAttackPower();
        notifyObservers();
    }

    // Method to get the current attack power.
    public int getCurrentAttackPower() {
        return currentAttackPower;
    }

    // Override method to set the health state and notify observers.
    @Override
    public void setHealthState(CharacterState state) {
        currentState = state;
        notifyObservers();
    }

    //Methods to get the State
    @Override
    public CharacterState getLowHealth() {
        return lowHealth;
    }

    @Override
    public CharacterState getDead() {
        return dead;
    }

    @Override
    public CharacterState getMidHealth() {
        return midHealth;
    }

    @Override
    public CharacterState getWellHealth() {
        return wellHealth;
    }

    // Override method to set the current defense power and notify observers.
    @Override
    public int setCurrentDefensePower(int defensePower) {
        this.currentDefensePower = defensePower;
        notifyObservers();
        return defensePower;
    }

    // Override method to get a description of the character.
    @Override
    public String getDescription() {
        return "A character with " + this.eyeColor + ", " + this.hairStyle + ", " + this.hairColor;
    }
}
