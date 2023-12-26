public class Axe implements AttackInventory {
   // private int axeAttackPower;
    Character decoratedCharacter;

   public Axe(Character decoratedCharacter) {
       this.decoratedCharacter=decoratedCharacter;
       // this.axeAttackPower = axeAttackPower;
    }

    @Override
    public int getAttackPower() {
        // Add the attack power of the Axe to the currentAttackPower of the decorated character
        return decoratedCharacter.setCurrentAttackPower(25);
    }

    @Override
    public String getDescription() {
        return decoratedCharacter.getDescription() + " equipped with Axe";
   }
}

/*public class Axe extends AttackInventory{
    Character decoratedCharacter;
    public Axe(Character decoratedCharacter) {
        super(decoratedCharacter);
    }
    @Override
    public int getAttackPower() {
        // Axe'in attack gücü eklenebilir
        // Örnek olarak, ConcreteCharacter sınıfındaki currentAttackPower'ı 20'ye eşitleme
        //if (decoratedCharacter instanceof ConcreteCharacter) {
            ConcreteCharacter concreteCharacter = (ConcreteCharacter) decoratedCharacter;
           return concreteCharacter.setCurrentAttackPower(20);
       // }

        //return 0;
    }
        @Override
    public String getDescription() {
        return "Axe";
    }
}
*/