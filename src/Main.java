public class Main {
    public static void main(String[] args) {

        System.out.println("----------------Welcome to the game-----------------");

        ConcreteCharacter character = new ConcreteCharacter();

        System.out.println("Default features: "+ character.getDescription());
        character.printDefaultAbilities();

        System.out.println();

        OtherUsers otherUsers1 = new OtherUsers(character);
        TheSystem systemObserver = new TheSystem(character);
        OtherUsers otherUsers2 = new OtherUsers(character);

        // Register observers to the character.
        character.registerObserver(otherUsers1);
        character.registerObserver(systemObserver);
        character.registerObserver(otherUsers2);
        character.printObservers();

        System.out.println();

        Features hairColorDecorator = new HairColor();
        hairColorDecorator.decorate(character, "Red");
        System.out.println(character.getDescription() +"\n");

        Features hairStyleDecorator = new HairStyle();
        hairStyleDecorator.decorate(character, "Curly");
        System.out.println(character.getDescription()+"\n");

        Features eyeColorDecorator = new EyeColor();
        eyeColorDecorator.decorate(character, "Blue");
        System.out.println(character.getDescription()+"\n");



        // Remove an observer from the character.
        character.removeObserver(otherUsers2);
        character.printObservers();
        System.out.println();

        DefaultAbilities punching = new Punching(character);
        character.setDefaultAbilityPower(punching);

        System.out.println("Character's Current Attack Power: " + character.getCurrentAttackPower()+
                " and Current Defense Power: " + character.getCurrentDefensePower()+"\n");


        DefaultAbilities kicking = new Kicking(character);
        character.setDefaultAbilityPower(kicking);
        System.out.println("Character's Current Attack Power: " + character.getCurrentAttackPower()+
                " and Current Defense Power: " + character.getCurrentDefensePower()+"\n");


        // Create inventory items for the character.
        Axe axe = new Axe(character);
        Shield shield = new Shield(character);


        // Equip the character with attack and defense items.
        character.setAttackInventory(axe);
        character.setDefenseInventory(shield);

        System.out.println("Character's Current Attack Power: " + character.getCurrentAttackPower());
        System.out.println(axe.getDescription() +"\n");
        System.out.println("Character's Current Defense Power: " + character.getCurrentDefensePower());
        System.out.println(shield.getDescription()+"\n");

        // Change the character's attack item.
        Armour armour = new Armour(character);
        Gunshot gunshot = new Gunshot(character);

        character.setAttackInventory(gunshot);
        System.out.println("Character's Current Attack Power: " + character.getCurrentAttackPower()+
                " and Current Defense Power: " + character.getCurrentDefensePower()+"\n");

        // Change the character's defense item.
        character.setDefenseInventory(armour);
        System.out.println(armour.getDescription());
        System.out.println("Character's Current Attack Power: " + character.getCurrentAttackPower()+
                " and Current Defense Power: " + character.getCurrentDefensePower()+"\n");

        // Display the character's initial health.
        System.out.println("Character's Current Health: " +character.getHealth()+"\n");

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

