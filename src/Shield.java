public class Shield implements DefenseInventory {
    Character decoratedCharacter;

    public Shield(Character decoratedCharacter) {
        this.decoratedCharacter=decoratedCharacter;

    }

    public int getDefensePower() {
        // Add the attack power of the Axe to the currentAttackPower of the decorated character
        return decoratedCharacter.setCurrentDefensePower(15);
    }


    public String getDescription() {
        return decoratedCharacter.getDescription() + " equipped with Shield";
    }
}
