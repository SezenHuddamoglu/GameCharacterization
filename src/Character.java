public abstract class Character {
    private String EyeColor;
    private AttackInventory attackInventory;
    private String eyeColor;
    private String hairStyle;
    private String hairColor;
    private DefenseInventory defenseInventory;
    private int health;
    private int currentDefensePower;
    private int currentAttackPower;

    public Character(String eyeColor, String hairColor, String hairStyle) {
        this.eyeColor = eyeColor;
        this.hairColor = hairColor;
        this.hairStyle = hairStyle;
    }
    abstract void setEyeColor(String eyeColor);
    abstract void setHairColor(String hairColor);
    abstract public void setHairStyle(String hairStyle);
    abstract void setAttackInventory(AttackInventory attackInventory);
    abstract void setDefenseInventory(DefenseInventory defenseInventory);
    abstract void setHealth(int health);
    abstract int setCurrentDefensePower(int defensePower);
    abstract int setCurrentAttackPower(int attackPower);
    abstract String getDescription();
    public abstract void takeDamage(int damage);
    public abstract void getStronger(int strength);

    public AttackInventory getAttackInventory() {
        return attackInventory;
    }

    public String getEyeColor() {
        return eyeColor;
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
}
