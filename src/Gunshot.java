public class Gunshot implements AttackInventory {
    Character decoratedCharacter;

    public Gunshot(Character decoratedCharacter) {
        this.decoratedCharacter=decoratedCharacter;
        // this.axeAttackPower = axeAttackPower;
    }

    public int getAttackPower() {
        return 10;
    }


    public String getDescription() {
        return decoratedCharacter.getDescription() + " equipped with Gunshot";
    }
}
