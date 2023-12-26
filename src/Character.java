abstract class Character {
    private String currentEyeColor;
    private AttackInventory attackInventory;
    private String eyeColor;
    private String hairStyle;
    private String hairColor;
    private DefenseInventory defenseInventory;
    private int health;
    private int currentDefensePower;
    private int currentAttackPower;

    public int setCurrentAttackPower(int attackPower) {
        this.currentAttackPower = attackPower;
        return currentAttackPower;
    }

    abstract String getDescription();

    public int setCurrentDefensePower(int defensePower) {
        this.currentDefensePower=defensePower;
        return currentDefensePower;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public void setHairColor(String hairColor){
        this.hairColor=hairColor;
    }

    public void setHairStyle(String hairStyle){
        this.hairStyle=hairStyle;
    }

/*  public abstract String getDescription();
   public void applyAttackPower() {
        if (this instanceof AttackInventory) {
            ((CharacterActions) this).getAttackPower();
        } else {
            // SetAttackPower metodu implement edilmemişse uygun bir işlem yapabiliriz.
            //System.out.println("Bu karakter üzerinde setAttackPower işlemi uygulanamaz.");
        }
    }

    protected int getAttackPower(){
        return 0;
    }*/
}
//protected abstract int getDefensePower();

//protected abstract int getAttackPower();