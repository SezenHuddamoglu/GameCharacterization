public class Armour implements DefenseInventory{
    Character decoratedCharacter;

    public Armour(Character decoratedCharacter) {
        this.decoratedCharacter=decoratedCharacter;

    }

    public int getDefensePower() {
        // Add the attack power of the Axe to the currentAttackPower of the decorated character
        return decoratedCharacter.setCurrentDefensePower(20);
    }


    public String getDescription() {
        return decoratedCharacter.getDescription() + " equipped with Armour";
    }
}

