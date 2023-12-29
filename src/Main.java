public class Main {

    // Main method where the program execution begins.
    public static void main(String[] args) {

        // Create a ConcreteCharacter object with initial characteristics.

        ConcreteCharacter character = new ConcreteCharacter("blue", "black", "curly");
        System.out.println(character.getDescription());
        character.setEyeColor("green");
        character.setHairColor("blonde");
        System.out.println(character.getDescription());
        character.setHairStyle("straight");
        System.out.println(character.getDescription());
        Punching punchingAbility = new Punching();
        Kicking kickingAbility = new Kicking();

       // character.setPunchingAbility(punchingAbility);
        //character.setKickingAbility(kickingAbility);
        // Create observer objects for the character.
        OtherUsers otherUsers1 = new OtherUsers(character);
        TheSystem systemObserver = new TheSystem(character);
        OtherUsers otherUsers2 = new OtherUsers(character);

        // Register observers to the character.
        character.registerObserver(otherUsers1);
        character.registerObserver(systemObserver);
        character.registerObserver(otherUsers1);

        // Remove an observer from the character.
        character.removeObserver(otherUsers2);

        // Create inventory items for the character.
        Axe axe = new Axe(character);
        Shield shield = new Shield(character);
        Armour armour = new Armour(character);
        Gunshot gunshot = new Gunshot(character);
        System.out.println("Character's Current Attack Power: " + character.getCurrentAttackPower());
        System.out.println("Character's Current Defense Power: " + character.getCurrentDefensePower());

        // Equip the character with attack and defense items.
        character.setAttackInventory(axe);
        character.setDefenseInventory(shield);

        System.out.println("Character's Current Attack Power: " + character.getCurrentAttackPower());
        System.out.println(axe.getDescription());
        System.out.println("Character's Current Defense Power: " + character.getCurrentDefensePower());
        System.out.println(shield.getDescription());

        // Change the character's attack item.
        character.setAttackInventory(gunshot);
        System.out.println("Character's Current Attack Power: " + character.getCurrentAttackPower());
        System.out.println("Character's Current Defense Power: " + character.getCurrentDefensePower());

        // Change the character's defense item.
        character.setDefenseInventory(armour);
        System.out.println(armour.getDescription());

        // Display the character's initial health.
        System.out.println(character.getHealth());

        // Simulate the character taking damage and getting stronger.
        character.takeDamage(10);
        character.takeDamage(10);
        character.getStronger(10);
        character.getStronger(20);
        character.getStronger(10);
        character.takeDamage(30);
        character.takeDamage(20);
        character.takeDamage(30);
        character.getStronger(50);
        character.takeDamage(20);
        character.takeDamage(100);
        character.takeDamage(10);
        character.getStronger(10);
    }
}

