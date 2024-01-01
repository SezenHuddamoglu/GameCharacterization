import java.util.ArrayList;

public abstract class Character implements Subject{

    // Private instance variables to store various characteristics and states of the character.
    private String eyeColor;
    private AttackInventory attackInventory;
    private String hairStyle;
    private String hairColor;
    private DefenseInventory defenseInventory;
    private int health = 100;
    private int currentDefensePower;
    private int currentAttackPower;
    private CharacterState wellHealth;
    private CharacterState midHealth;
    private CharacterState lowHealth;
    private CharacterState dead;
    private CharacterState currentState;
    private ArrayList<Observer> observers;
    private ArrayList<DefaultAbilities> defaultAbilities;
    private DefaultAbilities currentDefaultAbiliy;

    public Character(){
        this.eyeColor = "Brown";
        this.hairColor = "Brown";
        this.hairStyle = "Straight";
        attackInventory = null;
        defenseInventory = null;

        observers = new ArrayList();
        defaultAbilities = new ArrayList();
        //currentState=wellHealth;
        // Initialize character states for different health levels.
        wellHealth = new WellHealthState(this);
        midHealth = new MidHealthState(this);
        lowHealth = new LowHealthState(this);
        dead = new DeadState(this);

        if (health > 70) {
            currentState = wellHealth;
        }
        else if(health>40){
            currentState = midHealth;
        }
        else{
            currentState = lowHealth;
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

    public ArrayList<DefaultAbilities> getDefaultAbilities() {
        return defaultAbilities;
    }

    public void setDefaultAbilities(DefaultAbilities defaultAbility) {
        this.defaultAbilities.add(defaultAbility);
    }

    // Abstract methods to be implemented by subclasses to set various characteristics.
    public void printDefaultAbilities() {
        System.out.print("Default Abilities: ");
        for (DefaultAbilities ability : defaultAbilities) {
            if (ability != null) {
                System.out.print(ability.getAbility() + " , ");
            }
        }
        System.out.println();
    }



    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;

    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
        notifyObservers();
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairStyle(String hairStyle) {
        this.hairStyle = hairStyle;
        notifyObservers();
    }

    public String getHairStyle() {
        return hairStyle;
    }

    public void setAttackInventory(AttackInventory attackInventory) {
        this.attackInventory = attackInventory;
        this.currentAttackPower = attackInventory.getAttackPower();
        notifyObservers();
    }
    public AttackInventory getAttackInventory() {
        return attackInventory;
    }

    public void setCurrentAttackPower(int currentAttackPower) {
        this.currentAttackPower = currentAttackPower;
        notifyObservers();
    }

    public DefaultAbilities getCurrentDefaultAbiliy() {
        return currentDefaultAbiliy;
    }

    public void setCurrentDefaultAbiliy(DefaultAbilities currentDefaultAbiliy) {
            this.currentDefaultAbiliy = currentDefaultAbiliy;
    }

    public void setDefaultAbilityPower(DefaultAbilities ability) {
        if (ability == null) {
            return;
        }

        if (attackInventory == null && defaultAbilities.contains(ability)) {
            setCurrentDefaultAbiliy(ability);
            this.currentAttackPower = ability.getPower();
        }
    }


    public int getCurrentAttackPower() {
        return currentAttackPower;
    }

    public void setDefenseInventory(DefenseInventory defenseInventory) {
        this.defenseInventory = defenseInventory;
        this.currentDefensePower = defenseInventory.getDefensePower();
        notifyObservers();
    }

    public DefenseInventory getDefenseInventory() {
        return defenseInventory;
    }

    public int setCurrentDefensePower(int defensePower) {
        this.currentDefensePower = defensePower;
        notifyObservers();
        return defensePower;

    }

    public int getCurrentDefensePower() {
        return currentDefensePower;
    }

    public void setHealth(int health) {
        this.health = health;
        notifyObservers();
    }

    public int getHealth() {
        return health;
    }
    //Methods to get the State

    public CharacterState getLowHealth() {
        return lowHealth;
    }


    public CharacterState getDead() {
        return dead;
    }


    public CharacterState getMidHealth() {
        return midHealth;
    }


    public CharacterState getWellHealth() {
        return wellHealth;
    }

    public void setHealthState(CharacterState state) {
        currentState = state;
        notifyObservers();
    }
    public void takeDamage(int damage) {
        currentState.takeDamage(this, damage);

    }

    // Method to handle getting stronger, delegates to the current state and notifies observers.
    public void getStronger(int strength) {
        currentState.getStronger(this, strength);
    }
    public void setCurrentState(CharacterState currentState) {
        this.currentState = currentState;
    }
    public CharacterState getCurrentState() {
        return currentState;
    }

    public String getDescription() {
        return "A character with " + this.eyeColor + " eyes, and" + this.hairStyle + ", " + this.hairColor + " hair";
    }

}


