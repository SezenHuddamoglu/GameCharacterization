import java.util.ArrayList;

public class ConcreteCharacter extends Character implements Subject{
    private ArrayList observers;
    private AttackInventory attackInventory;
    private String eyeColor;
    private String hairStyle;
    private String hairColor;
    private DefenseInventory defenseInventory;
    private int health=100;
    private int currentDefensePower;
    private int currentAttackPower;

    private CharacterState wellHealth;
    private CharacterState midHealth;
    private CharacterState lowHealth;
    private CharacterState dead;
    private CharacterState currentState =wellHealth;

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

    public ConcreteCharacter(String eyeColor, String hairColor, String hairStyle) {
        this.eyeColor = eyeColor;
        this.hairColor = hairColor;
        this.hairStyle = hairStyle;
        observers = new ArrayList();

        //this.setHealth(100);
        health=100;


       wellHealth=new WellHealthState(this);
        midHealth=new MidHealthState(this);
        lowHealth=new LowHealthState(this);
        dead=new DeadState(this);



        if(health>70){
            currentState=wellHealth;
        }

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
            observer.update(eyeColor,hairColor,hairStyle,
                    attackInventory, defenseInventory,
                    health,currentDefensePower,currentAttackPower,currentState);
        }

    }
    @Override
    public void setCurrentState(CharacterState state){
        this.currentState=state;
        notifyObservers();
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
    public void setDefenseInventory(DefenseInventory defenseInventory) {
        this.defenseInventory = defenseInventory;
        this.currentDefensePower = defenseInventory.getDefensePower();
        notifyObservers();
    }

    @Override
    public int getCurrentDefensePower() {
        return currentDefensePower;
    }

    @Override
    public void setHealth(int health) {
        this.health = health;
        notifyObservers();
    }


    public void takeDamage(int damage) {
        currentState.takeDamage(this,damage);
        notifyObservers();
    }
    public void getStronger(int strength) {
        currentState.getStronger(this,strength);
        getCurrentState();
        notifyObservers();
    }

    @Override
    public CharacterState getCurrentState() {
        return currentState;
    }


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

    public int getCurrentAttackPower() {
        return currentAttackPower;
    }

    @Override
    public void setHealthState(CharacterState state) {
        currentState = state;
        notifyObservers();
    }

    @Override
    public int setCurrentDefensePower(int defensePower) {
        this.currentDefensePower = defensePower;
        notifyObservers(); // Gözlemcileri bilgilendir
        return defensePower;
    }


    @Override
    public String getDescription() {
        return "A character with " + this.eyeColor + ", " + this.hairStyle + ", "+ this.hairColor;
    }


}



    /*void setAttackInventory(AttackInventory attackInventory) {
        this.attackInventory = attackInventory;
        notifyObservers();

    }*/
  /* @Override
    public void display() {
        System.out.println("Character with Health State");//------ displaying the health state of char
    }*/
