import java.util.ArrayList;

public class ConcreteCharacter extends Character implements Subject {
    private ArrayList observers;
    private AttackInventory attackInventory;
    private String eyeColor;
    private String hairStyle;
    private String hairColor;
    private DefenseInventory defenseInventory;
    private int health;
    private int currentDefensePower;
    private int currentAttackPower;

   // private int health;  // --------------\
    //private int currentDefensePower; // ---\  State concreteCharacter context
    //private int currentAttackPower;//-------/
    public boolean isDefending; //---------/
    private CharacterState currentState;


     public ConcreteCharacter(String eyeColor, String hairColor, String hairStyle) {
            super(eyeColor, hairColor, hairStyle);
            observers = new ArrayList();
            currentState = new HealthState(100); // Initial health set to 100
        }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update();
        }

    }
    @Override
    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
        notifyObservers();
    }

    @Override
    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
        notifyObservers();
    }

@Override
    public void setHairStyle(String hairStyle) {
        this.hairStyle = hairStyle;
        notifyObservers();
    }

@Override
    public void setAttackInventory(AttackInventory attackInventory) {
        this.attackInventory = attackInventory;
        notifyObservers();
    }

@Override
    public void setDefenseInventory(DefenseInventory defenseInventory) {
        this.defenseInventory = defenseInventory;
        notifyObservers();
    }

@Override
    public void setHealth(int health) {
        this.health = health;
        notifyObservers();
    }


     //----- State
    public void setState(CharacterState state) {
        currentState = state;
        notifyObservers();
    }

    @Override
    public void takeDamage(int damage) {
        currentState.takeDamage(damage);
        notifyObservers();
    }

    @Override
    public void getStronger(int strength) {
        currentState.getStronger(strength);
        notifyObservers();
    }

    @Override
    public int setCurrentAttackPower(int attackPower) {
        this.currentAttackPower = attackPower;
        notifyObservers(); // Gözlemcileri bilgilendir
        return attackPower;
    }
    @Override
    public int setCurrentDefensePower(int defensePower) {
        this.currentDefensePower = defensePower;
        notifyObservers(); // Gözlemcileri bilgilendir
        return defensePower;
    }

    @Override
    public void display() {
        System.out.println("Character with Health State");//------ displaying the health state of char
    }

    @Override
    String getDescription() {
        return "A character with " + eyeColor + ", " + hairStyle + ", "+ hairColor;
    }
}


