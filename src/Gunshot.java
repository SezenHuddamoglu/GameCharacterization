public class Gunshot implements AttackInventory {
    Character decoratedCharacter;

    public Gunshot(Character decoratedCharacter) {
        this.decoratedCharacter=decoratedCharacter;
        // this.axeAttackPower = axeAttackPower;
    }

    public int getAttackPower() {
        // Add the attack power of the Axe to the currentAttackPower of the decorated character
        return decoratedCharacter.setCurrentAttackPower(35);
    }


    public String getDescription() {
        return decoratedCharacter.getDescription() + " equipped with Gunshot";
    }
}
