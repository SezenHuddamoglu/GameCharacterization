import java.util.ArrayList;

public class ConcreteCharacter extends Character implements Subject {
    private String currentEyeColor;
    private AttackInventory attackInventory;
    private ArrayList observers;
    private Features eyes;
    private Features hair;
    private DefenseInventory defenseInventory;

    private int health;  // --------------\
    private int currentDefensePower; // ---\  State concreteCharacter context
    private int currentAttackPower;//-------/
    public boolean isDefending; //---------/

    public ConcreteCharacter() {
        observers = new ArrayList();
        this.currentEyeColor = "normal"; // Varsayılan olarak normal göz rengi
        this.attackInventory = null; //new AttackInventory(); // Varsayılan olarak temel attackInventory

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
    private CharacterState currentState; //----- State
    public void setState(CharacterState state) {
        currentState = state;
    }

    @Override
    public void takeDamage(int damage) {
        currentState.takeDamage(damage);
    }

    @Override
    public void getStronger(int strength) {
        currentState.getStronger(strength);
    }

    @Override
    public void display() {
        System.out.println("Character with Health State");//------ displaying the health state of char
    }

    @Override
    String getDescription() {
        return null;
    }
}
    /* public void setCurrentEyeColor(String eyeColor) {
        // Geçerli göz rengini ayarla
        this.currentEyeColor = eyeColor;
    }

    public void setAttackInventory(AttackInventory attackInventory) {
        this.attackInventory = attackInventory;
        currentAttackPower = calculateAttackPower(); // Ensure that currentAttackPower is updated
    }

    public void setDefenseInventory(DefenseInventory defenseInventory){
        this.defenseInventory=defenseInventory;
        currentDefensePower= calculateDefensePower();
    }

    public int setCurrentAttackPower(int currentAttackPower) {
        this.currentAttackPower = currentAttackPower;
        return currentAttackPower;
    }

    @Override
    public String getDescription() {
        return "Basic Character with " + currentEyeColor + " eyes" + " equipped with " + attackInventory.getDescription();
    }


    protected int calculateAttackPower() {
        // Make sure to return the attack power of the equipped inventory
        return attackInventory.getAttackPower();
    }

    protected int calculateDefensePower() {
        return defenseInventory.getDefensePower();
    }
    public int takeDamage(int damage){
        if (isDefending && currentDefensePower > 0) {
            // If the character is defending and has defense power, reduce damage based on defense power
            health = Math.max(0, health - (damage - currentDefensePower));
        } else {
            // If no defense or defense power, directly subtract damage from health
            health = Math.max(0, health - damage);
        }

        // Reset the defending flag after taking damage
        isDefending = false;

        return health;

    }

    public int getStronger(int strength){
        return health+strength;
    }*/

   /* @Override
    public void setEyesColor(String color) {
        // Implement the method in the context of the ConcreteCharacter class
        this.currentEyeColor = color;
    }*/

  /*  @Override
    public int getAttackPower() {
        return 0;
    }*/



/*    public void equipAttackInventory(AttackInventory attackInventory) {
        // Eğer zaten bir attack inventory varsa, onu kaldır
        if (currentAttackInventory != null) {
            System.out.println("Removing previous attack inventory: " + currentAttackInventory.getName());
            currentAttackInventory = null;
        }
  private int calculateAttackPower() {
        // Calculate attack power based on the current attack inventory
        return attackInventory.getAttackPower();
    }
        // Yeni attack inventory'yi ekle
        currentAttackInventory = attackInventory;
        System.out.println("Equipping new attack inventory: " + attackInventory.getName());
    }

    public String getDescription() {
        return "Character";
    }

    public int getAttack() {
        if (currentAttackInventory != null) {
            return currentAttackInventory.getAttack();
        } else {
            return 0;
        }
    }

    public int getDefense() {
        // Karakterin savunma değeri ile ilgili işlemler
        return 0;
    }*/

