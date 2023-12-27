public abstract class Character {
    private String EyeColor;
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
    private CharacterState currentState;


    abstract void setEyeColor(String eyeColor);
    abstract void setHairColor(String hairColor);
    abstract public void setHairStyle(String hairStyle);
    abstract void setAttackInventory(AttackInventory attackInventory);
    abstract void setDefenseInventory(DefenseInventory defenseInventory);
    abstract void setHealth(int health);
    abstract int setCurrentDefensePower(int defensePower);
    abstract void setCurrentAttackPower(int attackPower);
    abstract String getDescription();
    public abstract void takeDamage(int damage);
    public abstract void getStronger(int strength);
    public abstract void setCurrentState(CharacterState state);
   // public abstract void setAttackPower(AttackInventory attackInventory);


    public CharacterState getHealthState() {
        return currentState;
    }



    public CharacterState getCurrentState() {
        return currentState;
    }

    public AttackInventory getAttackInventory() {
        return attackInventory;
    }

    public String getEyeColor() {
        return this.eyeColor;
    }

    public String getHairStyle() {
        return hairStyle;
    }

    public String getHairColor() {
        return hairColor;
    }

    public DefenseInventory getDefenseInventory() {
        return defenseInventory;
    }

    public int getHealth() {
        return health;
    }

    public int getCurrentDefensePower() {
        return currentDefensePower;
    }

    public int getCurrentAttackPower() {
        return currentAttackPower;
    }

    public abstract void setHealthState(CharacterState HealthState);

   public abstract CharacterState getDead();

    public abstract CharacterState getMidHealth();
    public abstract CharacterState getLowHealth();


    public abstract CharacterState getWellHealth();
}

